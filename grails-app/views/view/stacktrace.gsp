<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="bootstrap" />
		<title>Log Events</title>
	</head>
	<body>
		<div class="container-fluid">
			<h4>${event.formattedMessage}</h4>
<pre class="pre-scrollable">
<g:stackTrace event="${event}" />
</pre>
</pre>
		</div>
	</body>
</html>