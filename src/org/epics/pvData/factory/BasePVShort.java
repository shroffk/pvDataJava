/**
 * 
 */
package org.epics.pvData.factory;

import java.nio.ByteBuffer;

import org.epics.pvData.pv.MessageType;
import org.epics.pvData.pv.PVShort;
import org.epics.pvData.pv.PVStructure;
import org.epics.pvData.pv.Scalar;

/**
 * Base class for PVByte.
 * It provides a complete implementation but can be extended.
 * @author mrk
 *
 */
public class BasePVShort extends AbstractPVScalar implements PVShort
{
    protected short value;
    
    public BasePVShort(PVStructure parent,Scalar scalar) {
        super(parent,scalar);
        value = 0;
    }
    /* (non-Javadoc)
     * @see org.epics.pvData.pv.PVShort#get()
     */
    public short get() {
        return value;
    }
    /* (non-Javadoc)
     * @see org.epics.pvData.pv.PVShort#put(short)
     */
    public void put(short value) {
        if(super.isMutable()) {
            this.value = value;
            return ;
        }
        super.message("not isMutable", MessageType.error);
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return toString(0);
    }
    /* (non-Javadoc)
     * @see org.epics.pvData.factory.AbstractPVField#toString(int)
     */
    public String toString(int indentLevel) {
        return convert.getString(this, indentLevel)
        + super.toString(indentLevel);
    }
    /* (non-Javadoc)
     * @see org.epics.pvData.pv.Serializable#getSerializationSize()
     */
    public int getSerializationSize() {
        return 2;
    }
    /* (non-Javadoc)
     * @see org.epics.pvData.pv.Serializable#serialize(java.nio.ByteBuffer)
     */
    public void serialize(ByteBuffer buffer) {
        buffer.putShort(value);
    }
    /* (non-Javadoc)
     * @see org.epics.pvData.pv.Serializable#deserialize(java.nio.ByteBuffer)
     */
    public void deserialize(ByteBuffer buffer) {
        value = buffer.getShort();
    }
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        // TODO anything else?
        if (obj instanceof PVShort) {
            PVShort b = (PVShort)obj;
            return b.get() == value;
        }
        else
            return false;
    }
}