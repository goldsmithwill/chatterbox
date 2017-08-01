<!DOCTYPE html>
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
			<input id="boldButton" type="button" value="B" onclick="boldText()">

			<!-- italicize button -->
			<input id="italicizeButton" type="button" value="I"
				onclick="italicizeText()">

			<!-- underline button -->
			<input id="underlineButton" type="button" value="U"
				onclick="underlineText()">
		</div>

		<!-- 	<form id="uploadForm" action="UploadDownloadFileServlet" method="post"
			enctype="multipart/form-data">
			<input name="fileName" type="file"> <br> <input
				type="submit" value="Upload">
		</form> -->



		<form id="autoCompleteForm" action="WordServlet" method="post"
			enctype="application/x-www-form-urlencoded">
			<input id="textArea" name="textArea" type="text"> <input
				type="submit" value="Auto Complete">
		</form>

	</div>
</body>
</html>