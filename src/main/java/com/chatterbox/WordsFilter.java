package com.chatterbox;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WordsFilter {
	public static void main(String[] args) throws IOException {
		// create files and file reading/writing objects
		File f = new File(new File(new File("").getAbsolutePath()) + "/src/main/resources/words.txt");
		File temp = new File("myTempFile.txt");
		Scanner input = new Scanner(f); // reader
		BufferedWriter writer = new BufferedWriter(new FileWriter(temp)); // writer

		// while loop to go through input scanner
		while (input.hasNextLine()) {
			String line = input.nextLine();

			// converting word to lower case
			line = line.toLowerCase();

			// filter out words that do not only contain letters
			if (!line.matches("[a-z]+")) {
				continue;
			}

			// writing current line
			writer.write(line + System.getProperty("line.separator"));
		}

		// closing file reading/writing objects
		writer.close();
		input.close();

		// rename temp file as f file
		temp.renameTo(f);
	}
}
