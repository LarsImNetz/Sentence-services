package org.lla_private;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBrainSentence {
	private BrainSentence sut;

	@Before
	public void setUp() {
		sut = new BrainSentence("");
	}

	@Test
	public void testConvert_abc() throws Exception {
		Assert.assertEquals("abc", sut.convert("abc"));
	}

	@Test
	public void testConvert_abcd() throws Exception {
		Assert.assertEquals("acbd", sut.convert("abcd"));
	}

	@Test
	public void testForEachWord() throws Exception {
		String sentence = "Dies ist ein kurzer Satz";
		BrainSentence brain = new BrainSentence(sentence);
		String brainSentence = brain.forEachWord();
		String expected = "Deis ist ein kezrur Staz ";
		Assert.assertEquals(expected, brainSentence);
	}

	@Test
	public void testForEachWord2() throws Exception {
		String sentence = "Seit Jahrzehnten warnt der Club of Rome vor ungebremstem Wachstum";
		BrainSentence brain = new BrainSentence(sentence);
		String brainSentence = brain.forEachWord();
		System.out.println(brainSentence);
		String expected = "Siet Jetnhezrhan wnrat der Culb of Rmoe vor uetsmerbegnm Wutshcam ";
		Assert.assertEquals(expected, brainSentence);
	}
}
