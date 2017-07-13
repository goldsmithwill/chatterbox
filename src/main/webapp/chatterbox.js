window.onload = new function() {
	var textArea = document.getElementById("textArea");
}

function boldText() {
	if (textArea.style.fontWeight == "normal") {
		textArea.style.fontWeight = "bold";
	} else {
		textArea.style.fontWeight = "normal";
	}
}

function italicizeText() {
	if (textArea.style.fontStyle == "normal") {
		textArea.style.fontStyle = "italic";
	} else {
		textArea.style.fontStyle = "normal";
	}
}

function underlineText() {
	if (textArea.style.textDecoration == "none") {
		textArea.style.textDecoration = "underline";
	} else {
		textArea.style.textDecoration = "none";
	}
}