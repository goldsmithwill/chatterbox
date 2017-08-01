package com.chatterbox;

public class TrieNode {
	TrieNode[] arr;
	boolean isEnd;

	// Constructor to initialize TrieNode objects
	public TrieNode() {
		// arr field to hold 26 TrieNodes
		// 1 TrieNode for each letter in the alphabet
		this.arr = new TrieNode[26];
	}

}