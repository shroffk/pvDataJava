/**
 * Copyright - See the COPYRIGHT that is included with this distribution.
 * EPICS JavaIOC is distributed subject to a Software License Agreement found
 * in file LICENSE that is included with this distribution.
 */
package org.epics.pvData.pv;

/**
 * Interface for creating introspection interfaces.
 * @author mrk
 *
 */
public interface FieldCreate {
    /**
     * Create a <i>ScalarField</i>.
     * @param fieldName The field name.
     * @param scalarType The scalar type.
     * @return a <i>Field</i> interface for the newly created object.
     * @throws An <i>IllegalArgumentException</i> if an illegal type is specified.
     */
    public Scalar createScalar(String fieldName,ScalarType scalarType);
    /**
     * Create an <i>Array</i> field.
     * @param fieldName The field name
     * @param elementType The <i>Type</i> for array elements
     * @return An <i>Array</i> Interface for the newly created object.
     */
    public Array createArray(String fieldName,ScalarType elementType);
    /**
     * Create a <i>Structure</i> field.
     * @param fieldName The field name
     * @param field The array of <i>Field</i>s for the structure.
     * @return a <i>Structure</i> interface for the newly created object.
     */
    public Structure createStructure(String fieldName, Field[] field);
}
