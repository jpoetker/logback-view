package log

import org.apache.commons.lang.builder.HashCodeBuilder

class LoggingEventException implements Serializable {
	static belongsTo = [event: LoggingEvent]
	Integer i
	String traceLine

	boolean equals(other) {
		if (!(other instanceof LoggingEventException)) {
			return false
		}

		other.event.id == event.id && other.i == i
	}

	int hashCode() {
		def builder = new HashCodeBuilder()
		builder.append event.id
		builder.append i
		builder.toHashCode()
	}

    static constraints = {
    }

    static mapping = {
    	version false
    	autoTimestamp false
    	id composite: ['event', 'i']
    	event column: 'event_id'
    }
}
