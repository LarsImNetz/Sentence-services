package org.lla_private;

import org.junit.Assert;
import org.junit.Test;

public class TestMain {

	@Test
	public void testMain() {
		Main.main(null);
	}

	@Test
	public void testMainWithNew() {
		Main main = new Main();
		Assert.assertNotNull(main);
	}
}
