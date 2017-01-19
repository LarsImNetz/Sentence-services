package org.lla_private;

import java.util.StringTokenizer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class TestSentence {

	private Sentence sut;
	
	private static String sentence="Dies ist ein kurzer Satz";

	@Before
	public void setUp() {
		sut = new Sentence(sentence);
	}
	
	@Test
	public void testWord() {
		StringTokenizer tokenizer = new StringTokenizer(sentence);
		while(tokenizer.hasMoreTokens()) {
			String word = tokenizer.nextToken();
			System.out.println(word);
		}
	}

	@Test
	public void testForEachWord() throws Exception {
		String newSentence = sut.forEachWord();
		String expected = sentence + " ";
		Assert.assertEquals(expected, newSentence);
	}

}
