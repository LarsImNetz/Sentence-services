package org.lla_private.service.buchstabenzuzahlen;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestBuchstabenZuZahlenService {
	private IBuchstabenZuZahlenService buchstabenZuZahlenService;
	
	@Before
	public void setUp() {
		buchstabenZuZahlenService = new BuchstabenZuZahlenService();
	}

	@Test
	public void testBuchstabenZuZahlenConvert() {
		String result = buchstabenZuZahlenService.convert("TEST");
		Assert.assertEquals("7357", result);
	}
}
