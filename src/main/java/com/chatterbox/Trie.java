package com.chatterbox;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Trie {
	private TrieNode root;

	public Trie() throws FileNotFoundException {
		root = new TrieNode();

		// adding words.txt words to the trie
		addWords();
	}

	public static void main(String[] args) {
		try {
			Trie t = new Trie();
			t.startsWith("hi");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	// addWords method to add contents of words.txt file to the trie
	public void addWords() throws FileNotFoundException {
		// creating scanner for words.txt file
		Scanner scanner = new Scanner(
				new File(new File(new File("").getAbsolutePath()) + "/src/main/resources/words.txt"));

		// while loop to go through scanner
		while (scanner.hasNextLine()) {
			String nextLine = scanner.nextLine();

			// adding word to the trie
			insert(nextLine);
		}

		// closing scanner
		scanner.close();

	}

	// Inserts a word into the trie
	public void insert(String word) {
		TrieNode n = root;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			int index = c - 'a';

			if (n.arr[index] == null) {
				TrieNode temp = new TrieNode();
				n.arr[index] = temp;
				n = temp;
			} else {
				n = n.arr[index];
			}
		}
		n.isEnd = true;
	}

	// Returns if the word is in the trie
	public boolean search(String word) {
		TrieNode n = searchNode(word);
		if (n == null) {
			return false;
		} else {
			if (n.isEnd)
				return true;
		}

		return false;
	}

	// Returns if there is any word in the trie
	// that starts with the given prefix.
	public boolean startsWith(String prefix) {
		TrieNode n = searchNode(prefix);

		if (n == null) {
			return false;
		} else {
			return true;
		}
	}

	// getStartsWith method
	// returns all words in the Trie that start with a specific prefix
	public List<String> getStartsWith(String prefix) {
		// startsWithList to be returned
		List<String> startsWithList = new ArrayList<String>();

		TrieNode n = searchNode(prefix);

		return startsWithList;

	}

	public TrieNode searchNode(String s) {
		TrieNode n = root;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int index = c - 'a';
			if (n.arr[index] != null) {
				n = n.arr[index];
			} else {
				return null;
			}
		}

		if (n == root)
			return null;

		return n;
	}

}