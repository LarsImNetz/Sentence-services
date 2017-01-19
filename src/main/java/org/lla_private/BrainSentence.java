package org.lla_private;

public class BrainSentence extends Sentence {

	public BrainSentence(String sentence) {
		super(sentence);
	}

	@Override
	public String convert(String word) {
		if (word.length() < 4) {
			return word;
		}

		char c0 = word.charAt(0);
		char cLast = word.charAt(word.length() - 1);

		StringBuilder buf = new StringBuilder();
		buf.append(c0);

		for (int i = 1; i < word.length() - 1; i++) {
			char cn = word.charAt(i);
			buf.insert(1, cn);
		}
		buf.append(cLast);
		return buf.toString();
	}
}
