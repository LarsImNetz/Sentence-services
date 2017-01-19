package org.lla_private;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestInvertSentence {
	private InvertSentence sut;
	
	private static String sentence="Dies ist ein kurzer Satz";

	@Before
	public void setUp() {
		sut = new InvertSentence(sentence);
	}
	
	@Test
	public void testForEachWord() throws Exception {
		String inverseSentence = sut.forEachWord();
		String expected = "Satz kurzer ein ist Dies ";
		Assert.assertEquals(expected, inverseSentence);
	}
}
