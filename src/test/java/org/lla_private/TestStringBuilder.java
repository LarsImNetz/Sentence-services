package org.lla_private;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestStringBuilder {

	private StringBuilder builder;
	
	@Before
	public void setUp() {
		builder = new StringBuilder();
	}
	
	@Test
	public void testStringAppend_ab() {
		builder.append("a");
		builder.append("b");
		Assert.assertEquals("ab", builder.toString());
	}
	
	@Test
	public void testStringAppend_abcd() {
		builder.append("a");
		builder.append("b");
		builder.append("c");
		builder.append("d");
		Assert.assertEquals("abcd", builder.toString());
	}
	
	@Test
	public void testStringInsert_ab() {
		builder.insert(0, "a");
		builder.insert(0, "b");
		builder.insert(0, "c");
		Assert.assertEquals("cba", builder.toString());
	}	
}
