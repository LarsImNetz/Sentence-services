package org.lla_private;

import org.junit.Assert;
import org.junit.Test;

public class TestHello {

	@Test
	public void testGetHelloWorld() {
		IHello hello = new Hello();
		String result = hello.getHelloWorld();
		Assert.assertEquals("Hello World.", result);
	}

}
