package log

class ExceptionTagLib {

	def ifStackTrace = {attr, body ->
		if (attr.event.stackTraceLines.asList().size() > 0) {
			out << body()
		}
	}

	def stackTrace = {attr, body ->
		def lines = attr.event.stackTraceLines.sort() {it.i}

		lines.each() { out << it.traceLine << '\n'}
	}
}
