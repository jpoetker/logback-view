package log

class LevelTagLib {

	def levelGlyph = { attr, body ->
		def glyph = "icon-question-sign"
		def title = "Unknown"
		def badge = "badge-inverse"
		switch (attr.level) {
			case "DEBUG":
				glyph = 'icon-eye-open'
				title = 'Debug'
				badge = 'badge-success'
				break

			case "INFO":
				glyph = 'icon-info-sign'
				title = 'Info'
				badge = 'badge-info'
				break

			case "WARN":
				glyph = 'icon-warning-sign'
				title = 'Warning'
				badge = 'badge-warning'
				break

			case "ERROR":
				glyph = 'icon-exclamation-sign'
				title = 'Error'
				badge = 'badge-important'
				break
		}

		out << "<span title='$title' class='badge $badge'><i class='$glyph icon-white'></i></span>"
	}
}
