package org.lla_private;

import java.util.StringTokenizer;

public class Sentence {
	private String sentence;

	public Sentence(String sentence) {
		this.sentence = sentence;
	}

	StringBuilder buffer = new StringBuilder();

	public String forEachWord() {
		StringTokenizer tokenizer = new StringTokenizer(sentence);
		while(tokenizer.hasMoreTokens()) {
			String word = tokenizer.nextToken();

			// buffer.append(call(word)).append(" ");
			append(convert(word));
		}
		return buffer.toString();
	}

	public void append(String word) {
		buffer.append(word);
		buffer.append(" ");
	}
	
	// will be called for each word in a sentence
	public String convert(String word) {
		return word;
	}
}
