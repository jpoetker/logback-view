<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="bootstrap" />
		<title>Log Events</title>
	</head>
	<body>
		<div class="container-fluid">
		<table class="table table-striped table-condensed">
			<thead>
				<tr>
					<th></th>
					<th>Timestamp</th>
					<th>Message</th>
					<th>Logger</th>
					<th>Thread</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<g:each in="${events}" var="event">
				<tr>
					<td><g:levelGlyph level="${event.levelString}" /></td>
					<td><g:formatDate date="${new java.util.Date(event.timestamp.longValue())}" style="LONG" type="datetime" /></td>
					<td>${event.formattedMessage}</td>
					<td>${event.loggerName}</td>
					<td>${event.threadName}</td>
					<td>
						<g:ifStackTrace event="${event}">
							<g:link controller="View" action="stacktrace" id="${event.id}">stack trace</g:link>
						</g:ifStackTrace>
					</td>
				</tr>
				</g:each>
			</tbody>
		</table>
		</div>

		<r:script>
			$('span[title]').tooltip();
		</r:script>

	</body>
<html>