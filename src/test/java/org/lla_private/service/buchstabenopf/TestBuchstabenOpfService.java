package org.lla_private.service.buchstabenopf;

import org.junit.Assert;
import org.junit.Test;

public class TestBuchstabenOpfService {
	@Test
	public void testOpf() {
		BuchstabenOpfService service = new BuchstabenOpfService();
		String actual = service.manipulieren("a");

		Assert.assertEquals("&Aopf;", actual);
	}
}
