/**
 * Copyright - See the COPYRIGHT that is included with this distribution.
 * EPICS JavaIOC is distributed subject to a Software License Agreement found
 * in file LICENSE that is included with this distribution.
 */
package org.epics.pvData.pv;

/**
 * Get/put double data
 * @author mrk
 *
 */
public interface PVDouble extends PVScalar{
    /**
     * Get the <i>double</i> value stored in the field.
     * @return double The value.
     */
    double get();
    /**
     * Put the <i>double</i> value into the field.
     * If the field is immutable a message is generated and the field not modified.
     * @param value The new value.
     */
    void put(double value);
}
