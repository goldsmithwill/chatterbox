package com.chatterbox;

import java.io.File;
import java.io.FileNotFoundException;
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
		TrieNode p = root;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			int index = c - 'a';

			if (p.arr[index] == null) {
				TrieNode temp = new TrieNode();
				p.arr[index] = temp;
				p = temp;
			} else {
				p = p.arr[index];
			}
		}
		p.isEnd = true;
	}

	// Returns if the word is in the trie
	public boolean search(String word) {
		TrieNode p = searchNode(word);
		if (p == null) {
			return false;
		} else {
			if (p.isEnd)
				return true;
		}

		return false;
	}

	// Returns if there is any word in the trie
	// that starts with the given prefix.
	public boolean startsWith(String prefix) {
		TrieNode p = searchNode(prefix);
		if (p == null) {
			return false;
		} else {
			return true;
		}
	}

	public TrieNode searchNode(String s) {
		TrieNode p = root;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int index = c - 'a';
			if (p.arr[index] != null) {
				p = p.arr[index];
			} else {
				return null;
			}
		}

		if (p == root)
			return null;

		return p;
	}
}