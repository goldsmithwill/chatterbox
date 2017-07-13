package com.chatterbox;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AutoCorrect {
	private Map<Character, Set<String>> wordsMap;

	// AutoCorrect constructor to read words.txt and initialize fields
	public AutoCorrect() throws FileNotFoundException {
		// creating new map to be used to initialize wordsMap field later
		Map<Character, Set<String>> wordsMap = new HashMap<Character, Set<String>>();

		String filename = new File(new File("").getAbsolutePath()) + "/src/main/resources/words.txt";
		// scanning words.txt file into ArrayList
		Scanner scanner = new Scanner(new File(filename));

		while (scanner.hasNextLine()) {
			String word = scanner.nextLine();
			Character firstChar = word.charAt(0);
			if (wordsMap.containsKey(firstChar)) {
				wordsMap.get(firstChar).add(word);
			} else {
				wordsMap.put(firstChar, new HashSet<String>());
				wordsMap.get(firstChar).add(word);
			}
		}
		scanner.close();

		// initializing wordsMap field
		setWordsMap(wordsMap);
	}

	public static void main(String[] args) {
		try {
			AutoCorrect a = new AutoCorrect();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Scanner scanner = new Scanner(System.in);
		String userInput = "";

		while (!userInput.equals("close")) {
			userInput = scanner.nextLine();

		}
		scanner.close();
	}

	public Set<String> filterWordsMap(String filter) {
		Character firstChar = filter.charAt(0);

		Set<String> tempWordsSet = getWordsMap().get(firstChar);

		Set<String> filteredWordsSet = new HashSet<String>();

		for (String word : tempWordsSet) {
			if (word.startsWith(filter)) {
				filteredWordsSet.remove(word);
			}
		}

		return null;

	}

	// getters and setters

	public Map<Character, Set<String>> getWordsMap() {
		return wordsMap;
	}

	public void setWordsMap(Map<Character, Set<String>> wordsMap) {
		this.wordsMap = wordsMap;
	}

}