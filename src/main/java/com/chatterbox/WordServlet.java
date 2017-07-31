package com.chatterbox;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WordServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		// Trie t = new Trie();

		String text = request.getParameter("textArea");

		System.out.println(text);

		// if()

		// // Set response content type
		// response.setContentType("text/html");
		//
		// PrintWriter out = response.getWriter();
		// String title = "Using POST Method to Read Form Data";
		// String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " +
		// "transitional//en\">\n";
		//
		// out.println(docType + "<html>\n" + "<head><title>" + title +
		// "</title></head>\n" + "<body>\n" + "<h1>" + title
		// + "</h1>\n" + "<ul>\n" + " <li><b>First Name</b>: " +
		// request.getParameter("first_name") + "\n"
		// + " <li><b>Last Name</b>: " + request.getParameter("last_name") +
		// "\n" + "</ul>\n" + "</body>\n"
		// + "</html>");
	}

	// test examples: user types in ab

	// everytime you click autocomplete: 1, if tree.searchword is true, then
	// that's the first word you give the user, 2, give the other words that
	// start with that

	// When you click on auto complete (or you can make it have a key listener
	// that displays a drop down of words) that incomplete word should be sent
	// to your servlet that tries to reTRIEve it from your list of words. The
	// servlet should return full words that are possible auto complete matches.
	// Does that make sense?

}
