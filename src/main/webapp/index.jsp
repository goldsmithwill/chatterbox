<html>
<head>
<meta charset="UTF-8">
<script src="chatterbox.js"></script>
<link type="text/css" href="chatterbox.css" rel="stylesheet">
<title>ChatterBox</title>
</head>

<body>
	<h1>ChatterBox</h1>
	<h3>a site for talkative people</h3>
	<div id="chatBox">
		<div id="chatFormatButtons">
			<!-- bold button -->
			<input id="boldButton" type="button" value="B" onclick="boldText()"></input>

			<!-- italicize button -->
			<input id="italicizeButton" type="button" value="I"
				onclick="italicizeText()"></input>

			<!-- underline button -->
			<input id="underlineButton" type="button" value="U"
				onclick="underlineText()"></input>
		</div>

		<form id="uploadForm" action="UploadDownloadFileServlet" method="post"
			enctype="multipart/form-data">
			<input name="fileName" type="file"> <br> <input
				type="submit" value="Upload">
		</form>

		<textarea id="textArea" rows="15" cols="56"></textarea>
	</div>
</body>
</html>