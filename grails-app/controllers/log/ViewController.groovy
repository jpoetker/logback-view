package log

class ViewController {

    def index() { 
    	def offset = params["offset"] ? params["offset"] : 0;
    	def max = params["max"] ? params["max"] : 100;

    	[events: LoggingEvent.list(offset: offset, max: max, sort:'timestamp', order:'desc')]
    }

    def stacktrace() {
    	def event = LoggingEvent.get(params.id)

    	if (event == null) {
    		response.status = 404
    	} else {
    		[event: event]
    	}
    }
}
