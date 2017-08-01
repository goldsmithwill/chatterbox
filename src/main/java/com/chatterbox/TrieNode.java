package com.chatterbox;

public class TrieNode {
	TrieNode[] arr;
	boolean isEnd;
	char letter;

	// Constructor to initialize TrieNode objects
	public TrieNode() {
		// arr field to hold 26 TrieNodes
		// 1 TrieNode for each letter in the alphabet
		this.arr = new TrieNode[26];

		// for loop to assign letter to each TrieNode in arr
		for (int i = 0; i < 26; i++) {
			char letter = (char) ('a' + i);
			// this.arr[3];
		}
	}

}