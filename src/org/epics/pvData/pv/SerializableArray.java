/**
 * Copyright - See the COPYRIGHT that is included with this distribution.
 * EPICS JavaIOC is distributed subject to a Software License Agreement found
 * in file LICENSE that is included with this distribution.
 */
package org.epics.pvData.pv;

import java.nio.ByteBuffer;



/**
 * Base interface for array serializaion.
 * @author mse
 *
 */
public interface SerializableArray extends Serializable {
	
    /**
     * Serialize field into given buffer.
	 * @param buffer serialization buffer.
	 * @param offset offset in array.
	 * @param count number of elements in array.
	 */
	void serialize(ByteBuffer buffer, int offset, int count);
}