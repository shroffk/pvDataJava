/**
 * Copyright - See the COPYRIGHT that is included with this distribution.
 * EPICS JavaIOC is distributed subject to a Software License Agreement found
 * in file LICENSE that is included with this distribution.
 */
package org.epics.pvData;


import junit.framework.TestCase;

import org.epics.pvData.factory.ConvertFactory;
import org.epics.pvData.factory.PVDataFactory;
import org.epics.pvData.pv.Convert;
import org.epics.pvData.pv.PVByte;
import org.epics.pvData.pv.PVDataCreate;
import org.epics.pvData.pv.PVDouble;
import org.epics.pvData.pv.PVFloat;
import org.epics.pvData.pv.PVInt;
import org.epics.pvData.pv.PVLong;
import org.epics.pvData.pv.PVShort;
import org.epics.pvData.pv.PVUByte;
import org.epics.pvData.pv.PVUInt;
import org.epics.pvData.pv.PVULong;
import org.epics.pvData.pv.PVUShort;
import org.epics.pvData.pv.*;

/**
 * JUnit test for BitSet.
 * NOTE not complete.
 * @author mse
 *
 */
public class ConvertTest extends TestCase {
	private static Convert convert = ConvertFactory.getConvert();
	private static PVDataCreate pvDataCreate = PVDataFactory.getPVDataCreate();
	
	static private void print(String value) {System.out.println(value);}

	public void testConvertScalar() {
		PVByte pvByte = (PVByte)pvDataCreate.createPVScalar(null, ScalarType.pvByte);
		PVUByte pvUByte = (PVUByte)pvDataCreate.createPVScalar(null, ScalarType.pvUByte);
		PVShort pvShort = (PVShort)pvDataCreate.createPVScalar(null, ScalarType.pvShort);
		PVUShort pvUShort = (PVUShort)pvDataCreate.createPVScalar(null, ScalarType.pvUShort);
		PVInt pvInt = (PVInt)pvDataCreate.createPVScalar(null, ScalarType.pvInt);
		PVUInt pvUInt = (PVUInt)pvDataCreate.createPVScalar(null, ScalarType.pvUInt);
		PVLong pvLong = (PVLong)pvDataCreate.createPVScalar(null, ScalarType.pvLong);
		PVULong pvULong = (PVULong)pvDataCreate.createPVScalar(null, ScalarType.pvULong);
		PVFloat pvFloat = (PVFloat)pvDataCreate.createPVScalar(null, ScalarType.pvFloat);
		PVDouble pvDouble = (PVDouble)pvDataCreate.createPVScalar(null, ScalarType.pvDouble);
		print("");
		print("fromByte");
		byte bval = Byte.MAX_VALUE;
		convert.fromByte(pvByte, bval);
		print("byte " +pvByte.toString());
		convert.fromByte(pvUByte, bval);
		print("ubyte " +pvUByte.toString());
		convert.fromByte(pvShort, bval);
		print("short " +pvShort.toString());
		convert.fromByte(pvUShort, bval);
		print("ushort " +pvUShort.toString());
		convert.fromByte(pvInt, bval);
		print("int " +pvInt.toString());
		convert.fromByte(pvUInt, bval);
		print("uint " +pvUInt.toString());
		convert.fromByte(pvLong, bval);
		print("long " +pvLong.toString());
		convert.fromByte(pvULong, bval);
		print("ulong " +pvULong.toString());
		convert.fromByte(pvFloat, bval);
		print("float " +pvFloat.toString());
		convert.fromByte(pvDouble, bval);
		print("double " +pvDouble.toString());
		bval++;
        convert.fromByte(pvByte, bval);
        print("byte " +pvByte.toString());
        convert.fromByte(pvUByte, bval);
        print("ubyte " +pvUByte.toString());
        convert.fromByte(pvShort, bval);
        print("short " +pvShort.toString());
        convert.fromByte(pvUShort, bval);
        print("ushort " +pvUShort.toString());
        convert.fromByte(pvInt, bval);
        print("int " +pvInt.toString());
        convert.fromByte(pvUInt, bval);
        print("uint " +pvUInt.toString());
        convert.fromByte(pvLong, bval);
        print("long " +pvLong.toString());
        convert.fromByte(pvULong, bval);
        print("ulong " +pvULong.toString());
        convert.fromByte(pvFloat, bval);
        print("float " +pvFloat.toString());
        convert.fromByte(pvDouble, bval);
        print("double " +pvDouble.toString());
        convert.copyScalar(pvUByte, pvFloat);
        print("float from unsigned " +pvFloat.toString());
        convert.copyScalar(pvUByte, pvDouble);
        print("double from unsigned " +pvDouble.toString());
        bval++;
        convert.fromByte(pvByte, bval);
        print("byte " +pvByte.toString());
        convert.fromByte(pvUByte, bval);
        print("ubyte " +pvUByte.toString());
        convert.fromByte(pvShort, bval);
        print("short " +pvShort.toString());
        convert.fromByte(pvUShort, bval);
        print("ushort " +pvUShort.toString());
        convert.fromByte(pvInt, bval);
        print("int " +pvInt.toString());
        convert.fromByte(pvUInt, bval);
        print("uint " +pvUInt.toString());
        convert.fromByte(pvLong, bval);
        print("long " +pvLong.toString());
        convert.fromByte(pvULong, bval);
        print("ulong " +pvULong.toString());
        convert.fromByte(pvFloat, bval);
        print("float " +pvFloat.toString());
        convert.fromByte(pvDouble, bval);
        print("double " +pvDouble.toString());
        convert.copyScalar(pvUByte, pvFloat);
        print("float from unsigned " +pvFloat.toString());
        convert.copyScalar(pvUByte, pvDouble);
        print("double from unsigned " +pvDouble.toString());
		print("");
        print("fromShort");
		short sval = Short.MAX_VALUE;
		print("value " + Short.toString(sval));
		convert.fromShort(pvByte, sval);
		print("byte " +pvByte.toString());
		convert.fromShort(pvUByte, sval);
		print("ubyte " +pvUByte.toString());
		convert.fromShort(pvShort, sval);
		print("short " +pvShort.toString());
		convert.fromShort(pvUShort, sval);
		print("ushort " +pvUShort.toString());
		convert.fromShort(pvInt, sval);
		print("int " +pvInt.toString());
		convert.fromShort(pvUInt, sval);
		print("uint " +pvUInt.toString());
		convert.fromShort(pvLong, sval);
		print("long " +pvLong.toString());
		convert.fromShort(pvULong, sval);
		print("ulong " +pvULong.toString());
		convert.fromShort(pvFloat, sval);
		print("float " +pvFloat.toString());
		convert.fromShort(pvDouble, sval);
		print("double " +pvDouble.toString());
		sval++;
		print("value " + Short.toString(sval));
        convert.fromShort(pvByte, sval);
        print("byte " +pvByte.toString());
        convert.fromShort(pvUByte, sval);
        print("ubyte " +pvUByte.toString());
        convert.fromShort(pvShort, sval);
        print("short " +pvShort.toString());
        convert.fromShort(pvUShort, sval);
        print("ushort " +pvUShort.toString());
        convert.fromShort(pvInt, sval);
        print("int " +pvInt.toString());
        convert.fromShort(pvUInt, sval);
        print("uint " +pvUInt.toString());
        convert.fromShort(pvLong, sval);
        print("long " +pvLong.toString());
        convert.fromShort(pvULong, sval);
        print("ulong " +pvULong.toString());
        convert.fromShort(pvFloat, sval);
        print("float " +pvFloat.toString());
        convert.fromShort(pvDouble, sval);
        print("double " +pvDouble.toString());
        convert.copyScalar(pvUShort, pvFloat);
        print("float from unsigned " +pvFloat.toString());
        convert.copyScalar(pvUShort, pvDouble);
        print("double from unsigned " +pvDouble.toString());
        sval++;
        print("value " + Short.toString(sval));
        convert.fromShort(pvByte, sval);
        print("byte " +pvByte.toString());
        convert.fromShort(pvUByte, sval);
        print("ubyte " +pvUByte.toString());
        convert.fromShort(pvShort, sval);
        print("short " +pvShort.toString());
        convert.fromShort(pvUShort, sval);
        print("ushort " +pvUShort.toString());
        convert.fromShort(pvInt, sval);
        print("int " +pvInt.toString());
        convert.fromShort(pvUInt, sval);
        print("uint " +pvUInt.toString());
        convert.fromShort(pvLong, sval);
        print("long " +pvLong.toString());
        convert.fromShort(pvULong, sval);
        print("ulong " +pvULong.toString());
        convert.fromShort(pvFloat, sval);
        print("float " +pvFloat.toString());
        convert.fromShort(pvDouble, sval);
        print("double " +pvDouble.toString());
        convert.copyScalar(pvUShort, pvFloat);
        print("float from unsigned " +pvFloat.toString());
        convert.copyScalar(pvUShort, pvDouble);
        print("double from unsigned " +pvDouble.toString());
		print("");
        print("fromInt");
		int ival = Integer.MAX_VALUE;
		print("value " + Integer.toString(ival));
		convert.fromInt(pvByte, ival);
		print("byte " +pvByte.toString());
		convert.fromInt(pvUByte, ival);
		print("ubyte " +pvUByte.toString());
		convert.fromInt(pvShort, ival);
		print("short " +pvShort.toString());
		convert.fromInt(pvUShort, ival);
		print("ushort " +pvUShort.toString());
		convert.fromInt(pvInt, ival);
		print("int " +pvInt.toString());
		convert.fromInt(pvUInt, ival);
		print("uint " +pvUInt.toString());
		convert.fromInt(pvLong, ival);
		print("long " +pvLong.toString());
		convert.fromInt(pvULong, ival);
		print("ulong " +pvULong.toString());
		convert.fromInt(pvFloat, ival);
		print("float " +pvFloat.toString());
		convert.fromInt(pvDouble, ival);
		print("double " +pvDouble.toString());
		ival++;
		print("value " + Integer.toString(ival));
        convert.fromInt(pvByte, ival);
        print("byte " +pvByte.toString());
        convert.fromInt(pvUByte, ival);
        print("ubyte " +pvUByte.toString());
        convert.fromInt(pvShort, ival);
        print("short " +pvShort.toString());
        convert.fromInt(pvUShort, ival);
        print("ushort " +pvUShort.toString());
        convert.fromInt(pvInt, ival);
        print("int " +pvInt.toString());
        convert.fromInt(pvUInt, ival);
        print("uint " +pvUInt.toString());
        convert.fromInt(pvLong, ival);
        print("long " +pvLong.toString());
        convert.fromInt(pvULong, ival);
        print("ulong " +pvULong.toString());
        convert.fromInt(pvFloat, ival);
        print("float " +pvFloat.toString());
        convert.fromInt(pvDouble, ival);
        print("double " +pvDouble.toString());
        convert.copyScalar(pvUInt, pvFloat);
        print("float from unsigned " +pvFloat.toString());
        convert.copyScalar(pvUInt, pvDouble);
        print("double from unsigned " +pvDouble.toString());
        ival++;
        print("value " + Integer.toString(ival));
        convert.fromInt(pvByte, ival);
        print("byte " +pvByte.toString());
        convert.fromInt(pvUByte, ival);
        print("ubyte " +pvUByte.toString());
        convert.fromInt(pvShort, ival);
        print("short " +pvShort.toString());
        convert.fromInt(pvUShort, ival);
        print("ushort " +pvUShort.toString());
        convert.fromInt(pvInt, ival);
        print("int " +pvInt.toString());
        convert.fromInt(pvUInt, ival);
        print("uint " +pvUInt.toString());
        convert.fromInt(pvLong, ival);
        print("long " +pvLong.toString());
        convert.fromInt(pvULong, ival);
        print("ulong " +pvULong.toString());
        convert.fromInt(pvFloat, ival);
        print("float " +pvFloat.toString());
        convert.fromInt(pvDouble, ival);
        print("double " +pvDouble.toString());
        convert.copyScalar(pvUInt, pvFloat);
        print("float from unsigned " +pvFloat.toString());
        convert.copyScalar(pvUInt, pvDouble);
        print("double from unsigned " +pvDouble.toString());
		print("");
        print("fromLong");
		long lval = Long.MAX_VALUE;
		convert.fromLong(pvByte, lval);
		print("byte " +pvByte.toString());
		convert.fromLong(pvUByte, lval);
		print("ubyte " +pvUByte.toString());
		convert.fromLong(pvShort, lval);
		print("short " +pvShort.toString());
		convert.fromLong(pvUShort, lval);
		print("ushort " +pvUShort.toString());
		convert.fromLong(pvInt, lval);
		print("int " +pvInt.toString());
		convert.fromLong(pvUInt, lval);
		print("uint " +pvUInt.toString());
		convert.fromLong(pvLong, lval);
		print("long " +pvLong.toString());
		convert.fromLong(pvULong, lval);
		print("ulong " +pvULong.toString());
		convert.fromLong(pvFloat, lval);
		print("float " +pvFloat.toString());
		convert.fromLong(pvDouble, lval);
		print("double " +pvDouble.toString());
		lval++;
        convert.fromLong(pvByte, lval);
        print("byte " +pvByte.toString());
        convert.fromLong(pvUByte, lval);
        print("ubyte " +pvUByte.toString());
        convert.fromLong(pvShort, lval);
        print("short " +pvShort.toString());
        convert.fromLong(pvUShort, lval);
        print("ushort " +pvUShort.toString());
        convert.fromLong(pvInt, lval);
        print("int " +pvInt.toString());
        convert.fromLong(pvUInt, lval);
        print("uint " +pvUInt.toString());
        convert.fromLong(pvLong, lval);
        print("long " +pvLong.toString());
        convert.fromLong(pvULong, lval);
        print("ulong " +pvULong.toString());
        convert.fromLong(pvFloat, lval);
        print("float " +pvFloat.toString());
        convert.fromLong(pvDouble, lval);
        print("double " +pvDouble.toString());
        convert.copyScalar(pvULong, pvFloat);
        print("float from unsigned " +pvFloat.toString());
        convert.copyScalar(pvULong, pvDouble);
        print("double from unsigned " +pvDouble.toString());
        lval++;
        convert.fromLong(pvByte, lval);
        print("byte " +pvByte.toString());
        convert.fromLong(pvUByte, lval);
        print("ubyte " +pvUByte.toString());
        convert.fromLong(pvShort, lval);
        print("short " +pvShort.toString());
        convert.fromLong(pvUShort, lval);
        print("ushort " +pvUShort.toString());
        convert.fromLong(pvInt, lval);
        print("int " +pvInt.toString());
        convert.fromLong(pvUInt, lval);
        print("uint " +pvUInt.toString());
        convert.fromLong(pvLong, lval);
        print("long " +pvLong.toString());
        convert.fromLong(pvULong, lval);
        print("ulong " +pvULong.toString());
        convert.fromLong(pvFloat, lval);
        print("float " +pvFloat.toString());
        convert.fromLong(pvDouble, lval);
        print("double " +pvDouble.toString());
        convert.copyScalar(pvULong, pvFloat);
        print("float from unsigned " +pvFloat.toString());
        convert.copyScalar(pvULong, pvDouble);
        print("double from unsigned " +pvDouble.toString());

	}
	
	public void testConvertScalarArray() {
        PVByteArray pvByte = (PVByteArray)pvDataCreate.createPVScalarArray(null, ScalarType.pvByte);
        PVUByteArray pvUByte = (PVUByteArray)pvDataCreate.createPVScalarArray(null, ScalarType.pvUByte);
        PVShortArray pvShort = (PVShortArray)pvDataCreate.createPVScalarArray(null, ScalarType.pvShort);
        PVUShortArray pvUShort = (PVUShortArray)pvDataCreate.createPVScalarArray(null, ScalarType.pvUShort);
        PVIntArray pvInt = (PVIntArray)pvDataCreate.createPVScalarArray(null, ScalarType.pvInt);
        PVUIntArray pvUInt = (PVUIntArray)pvDataCreate.createPVScalarArray(null, ScalarType.pvUInt);
        PVLongArray pvLong = (PVLongArray)pvDataCreate.createPVScalarArray(null, ScalarType.pvLong);
        PVULongArray pvULong = (PVULongArray)pvDataCreate.createPVScalarArray(null, ScalarType.pvULong);
        PVFloatArray pvFloat = (PVFloatArray)pvDataCreate.createPVScalarArray(null, ScalarType.pvFloat);
        PVDoubleArray pvDouble = (PVDoubleArray)pvDataCreate.createPVScalarArray(null, ScalarType.pvDouble);
        print("");
        print("fromByteArray");
        int length = 4;
        byte[] barray = new byte[length];
        byte bval = Byte.MAX_VALUE;
        barray[0] = bval; barray[1] = bval += 1; barray[2] = bval += 2; barray[3] = Byte.MIN_VALUE; 
        convert.fromByteArray(pvByte,0,length, barray,0);
        print("byte " +pvByte.toString());
        convert.fromByteArray(pvUByte,0,length, barray,0);
        print("ubyte " +pvUByte.toString());
        convert.fromByteArray(pvShort,0,length, barray,0);
        print("short " +pvShort.toString());
        convert.fromByteArray(pvUShort,0,length, barray,0);
        print("ushort " +pvUShort.toString());
        convert.fromByteArray(pvInt,0,length, barray,0);
        print("int " +pvInt.toString());
        convert.fromByteArray(pvUInt,0,length, barray,0);
        print("uint " +pvUInt.toString());
        convert.fromByteArray(pvLong,0,length, barray,0);
        print("long " +pvLong.toString());
        convert.fromByteArray(pvULong,0,length, barray,0);
        print("ulong " +pvULong.toString());
        convert.fromByteArray(pvFloat,0,length, barray,0);
        print("float " +pvFloat.toString());
        convert.fromByteArray(pvDouble,0,length, barray,0);
        print("double " +pvDouble.toString());
        convert.copyScalarArray(pvULong,0, pvFloat,0,length);
        print("float from unsigned " +pvFloat.toString());
        convert.copyScalarArray(pvULong,0, pvDouble,0,length);
        print("double from unsigned " +pvDouble.toString());
        print("");
        print("fromByteArray");
        short[] sarray = new short[length];
        short sval = Short.MAX_VALUE;
        sarray[0] = sval; sarray[1] = sval += 1; sarray[2] = sval += 2; sarray[3] = Short.MIN_VALUE; 
        convert.fromShortArray(pvShort,0,length, sarray,0);
        print("Short " +pvShort.toString());
        convert.fromShortArray(pvUByte,0,length, sarray,0);
        print("ubyte " +pvUByte.toString());
        convert.fromShortArray(pvShort,0,length, sarray,0);
        print("short " +pvShort.toString());
        convert.fromShortArray(pvUShort,0,length, sarray,0);
        print("ushort " +pvUShort.toString());
        convert.fromShortArray(pvInt,0,length, sarray,0);
        print("int " +pvInt.toString());
        convert.fromShortArray(pvUInt,0,length, sarray,0);
        print("uint " +pvUInt.toString());
        convert.fromShortArray(pvLong,0,length, sarray,0);
        print("long " +pvLong.toString());
        convert.fromShortArray(pvULong,0,length, sarray,0);
        print("ulong " +pvULong.toString());
        convert.fromShortArray(pvFloat,0,length, sarray,0);
        print("float " +pvFloat.toString());
        convert.fromShortArray(pvDouble,0,length, sarray,0);
        print("double " +pvDouble.toString());
        convert.copyScalarArray(pvULong,0, pvFloat,0,length);
        print("float from unsigned " +pvFloat.toString());
        convert.copyScalarArray(pvULong,0, pvDouble,0,length);
        print("double from unsigned " +pvDouble.toString());
        print("");
        print("fromIntArray");
        int[] iarray = new int[length];
        int ival = Integer.MAX_VALUE;
        iarray[0] = ival; iarray[1] = ival += 1; iarray[2] = ival += 2; iarray[3] = Integer.MIN_VALUE; 
        convert.fromIntArray(pvShort,0,length, iarray,0);
        print("Short " +pvShort.toString());
        convert.fromIntArray(pvUByte,0,length, iarray,0);
        print("ubyte " +pvUByte.toString());
        convert.fromIntArray(pvShort,0,length, iarray,0);
        print("short " +pvShort.toString());
        convert.fromIntArray(pvUShort,0,length, iarray,0);
        print("ushort " +pvUShort.toString());
        convert.fromIntArray(pvInt,0,length, iarray,0);
        print("int " +pvInt.toString());
        convert.fromIntArray(pvUInt,0,length, iarray,0);
        print("uint " +pvUInt.toString());
        convert.fromIntArray(pvLong,0,length, iarray,0);
        print("long " +pvLong.toString());
        convert.fromIntArray(pvULong,0,length, iarray,0);
        print("ulong " +pvULong.toString());
        convert.fromIntArray(pvFloat,0,length, iarray,0);
        print("float " +pvFloat.toString());
        convert.fromIntArray(pvDouble,0,length, iarray,0);
        print("double " +pvDouble.toString());
        convert.copyScalarArray(pvULong,0, pvFloat,0,length);
        print("float from unsigned " +pvFloat.toString());
        convert.copyScalarArray(pvULong,0, pvDouble,0,length);
        print("double from unsigned " +pvDouble.toString());
        print("");
        print("fromLongArray");
        long[] larray = new long[length];
        long lval = Long.MAX_VALUE;
        larray[0] = lval; larray[1] = lval += 1; larray[2] = lval += 2; larray[3] = Long.MIN_VALUE; 
        convert.fromLongArray(pvShort,0,length, larray,0);
        print("Short " +pvShort.toString());
        convert.fromLongArray(pvUByte,0,length, larray,0);
        print("ubyte " +pvUByte.toString());
        convert.fromLongArray(pvShort,0,length, larray,0);
        print("short " +pvShort.toString());
        convert.fromLongArray(pvUShort,0,length, larray,0);
        print("ushort " +pvUShort.toString());
        convert.fromLongArray(pvInt,0,length, larray,0);
        print("int " +pvInt.toString());
        convert.fromLongArray(pvUInt,0,length, larray,0);
        print("uint " +pvUInt.toString());
        convert.fromLongArray(pvLong,0,length, larray,0);
        print("long " +pvLong.toString());
        convert.fromLongArray(pvULong,0,length, larray,0);
        print("ulong " +pvULong.toString());
        convert.fromLongArray(pvFloat,0,length, larray,0);
        print("float " +pvFloat.toString());
        convert.fromLongArray(pvDouble,0,length, larray,0);
        print("double " +pvDouble.toString());
        convert.copyScalarArray(pvULong,0, pvFloat,0,length);
        print("float from unsigned " +pvFloat.toString());
        convert.copyScalarArray(pvULong,0, pvDouble,0,length);
        print("double from unsigned " +pvDouble.toString());
	}
}
