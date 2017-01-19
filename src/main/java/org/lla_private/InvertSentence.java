package org.lla_private;

public class InvertSentence extends Sentence {

	public InvertSentence(String sentence) {
		super(sentence);
	}
	
	@Override
	public void append(String word) {
		String newWord = word + " ";
		buffer.insert(0, newWord);
	}

}
