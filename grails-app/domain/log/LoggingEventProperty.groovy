package log

import org.apache.commons.lang.builder.HashCodeBuilder

class LoggingEventProperty implements Serializable {
	Long eventId
	String mappedKey
	String mappedValue

	boolean equals(other) {
		if (!(other instanceof LoggingEventProperty)) {
			return false
		}

		other.eventId == eventId && other.mappedKey == mappedKey
	}

	int hashCode() {
		def builder = new HashCodeBuilder()
		builder.append eventId
		builder.append mappedKey
		builder.toHashCode()
	}

    static constraints = {
    	mappedValue maxSize: 2048
    }

    static mapping = {
    	version false
    	autoTimestamp false
    	id composite: ['eventId', 'mappedKey']
    }
}
