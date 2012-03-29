/**
 * Copyright - See the COPYRIGHT that is included with this distribution.
 * EPICS pvData is distributed subject to a Software License Agreement found
 * in file LICENSE that is included with this distribution.
 */
package org.epics.pvData.misc;


import org.epics.pvData.pv.ByteArrayData;
import org.epics.pvData.pv.PVByteArray;
import org.epics.pvData.pv.PVField;
import org.epics.pvData.pv.PVScalarArray;
import org.epics.pvData.pv.PVStringArray;
import org.epics.pvData.pv.PVStructure;
import org.epics.pvData.pv.ScalarType;
import org.epics.pvData.pv.StringArrayData;
import org.epics.pvData.pv.Type;

/**
 * Factory for an enumerated structure.
 * @author mrk
 *
 */
public class MultiChoiceFactory {
	private static final int nBitsPerByte = 8;
	public static MultiChoice getMultiChoice(PVField pvField) {
		if(pvField.getField().getType()!=Type.structure) return null;
		PVStructure pvStructure = (PVStructure)pvField;
        PVField pvf = pvStructure.getSubField("bitMask");
        if(pvf==null) return null;
        if(pvf.getField().getType()!=Type.scalarArray) return null;
        PVScalarArray pva = (PVScalarArray)pvf;
        if(pva.getScalarArray().getElementType()!=ScalarType.pvByte) return null;
        PVByteArray pvBitMask= (PVByteArray)pva;
        pvf = pvStructure.getSubField("choices");
        if(pvf==null) return null;
        if(pvf.getField().getType()!=Type.scalarArray) return null;
        pva = (PVScalarArray)pvf;
        if(pva.getScalarArray().getElementType()!=ScalarType.pvString) return null;
        PVStringArray pvChoices = (PVStringArray)pva;
        return new MultiChoiceImpl(pvBitMask,pvChoices);
	}
    
	private static class ChoicesImpl implements MultiChoice.Choices {
        private String[] choices = null;
        private int length = 0;
		@Override
		public String[] getChoices() {
			return choices;
		}
		@Override
		public int getNumberChoices() {
			// TODO Auto-generated method stub
			return length;
		}
		private void setChoices(String[] choices) { this.choices = choices;}
		private void setLength(int length) {this.length = length;}
		private void setChoice(String choice,int index) {choices[index] = choice;}
		
	}
   
    private static class MultiChoiceImpl implements MultiChoice {
    	private final ByteArrayData byteArrayData = new ByteArrayData();
    	private final StringArrayData stringArrayData = new StringArrayData();
    	private final PVByteArray pvBitMask;
    	private final PVStringArray pvChoices;
    	private ChoicesImpl choices = new ChoicesImpl();
    	private String[] choiceValues = null;
    	
        private MultiChoiceImpl(PVByteArray pvBitMask,PVStringArray pvChoices) {
        	this.pvBitMask = pvBitMask;
        	this.pvChoices = pvChoices;
        }
		@Override
		public int registerChoice(String choice) {
			ensureLength();
			int length = pvChoices.getLength();
			pvChoices.get(0, length, stringArrayData);
			String[] theChoices = stringArrayData.data;
            for(int i=0; i<length; i++) {
            	if(choice.equals(theChoices[i])) return i;
            }
            String[] newStr = new String[1];
            newStr[0] = choice;
            for(int i=0; i<pvChoices.getCapacity(); i++) {
            	if(theChoices[i]==null) {
            		pvChoices.put(i, 1, newStr,0);
            		return i;
            	}
            }
            pvChoices.put(length, 1, newStr,0);
            return length;
		}
		@Override
		public byte[] getBitMask() {
			ensureLength();
			pvBitMask.get(0, pvBitMask.getLength(), byteArrayData);
			return byteArrayData.data;
		}

		@Override
		public String[] getChoices() {
			pvChoices.get(0, pvChoices.getLength(), stringArrayData);
			return stringArrayData.data;
		}

		@Override
		public Choices getSelectedChoices() {
			ensureLength();
			int length = pvChoices.getLength();
			pvChoices.get(0, length, stringArrayData);
			String[] theChoices = stringArrayData.data;
			pvBitMask.get(0, pvBitMask.getLength(), byteArrayData);
			byte[] data = byteArrayData.data;
			int index = 0;
			for(int i=0; i<length; i++) {
				if(isSet(data,i)) {
					choices.setChoice(theChoices[i], index);
					index++;
				}
			}
			choices.setLength(index);
			return choices;
		}
		
		@Override
		public void clear() {
			ensureLength();
			pvBitMask.get(0, pvBitMask.getLength(), byteArrayData);
			byte[] data = byteArrayData.data;
			for(int i=0; i< data.length; i++) data[i] = 0;

		}
		@Override
		public void setBit(int index) {
			ensureLength();
			pvBitMask.get(0, pvBitMask.getLength(), byteArrayData);
			byte[] data = byteArrayData.data;
			byte offset = (byte)(index %nBitsPerByte);
			byte mask = (byte)(1 << offset);
			data[index/nBitsPerByte] |= mask;
		}
		
		private void ensureLength() {
			int length = pvChoices.getLength();
			pvChoices.get(0, length, stringArrayData);
			String[] theChoices = stringArrayData.data;
			if(theChoices==choiceValues) return;
			choiceValues = theChoices;
			int nwords = length/nBitsPerByte + 1;
			if(pvBitMask.getCapacity()<nwords) pvBitMask.setCapacity(nwords);
			choices.setChoices(theChoices);
		}
		private boolean isSet(byte[]data, int index) {
			byte word = data[index/nBitsPerByte];
			int offset = index %nBitsPerByte;
			byte mask = (byte)(1 << offset);
			return ((word&mask) == 0) ? false : true;
		}
    }
}
