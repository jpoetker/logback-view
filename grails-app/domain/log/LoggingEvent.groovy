package log

class LoggingEvent {
	BigInteger timestamp
	String formattedMessage
	String loggerName
	String threadName
	String levelString
	Integer referenceFlag
	String callerFilename
	String callerClass
	String callerMethod
	Integer callerLine
	String arg0
	String arg1
	String arg2
	String arg3

	static hasMany = [stackTraceLines: LoggingEventException, properties: LoggingEventProperty]

    static constraints = {
    	formattedMessage maxSize: 2048
    	callerFilename nullable: true
    	arg0 nullable: true
    	arg1 nullable: true
    	arg2 nullable: true
    	arg3 nullable: true
    }

    static mapping = {
    	version false
    	autoTimestamp false
    	id column: 'event_id'
    	timestamp column: 'timestmp', index: 'idx_timestmp'
    }

}
