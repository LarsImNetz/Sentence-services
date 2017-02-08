package org.lla_private.service.kyrillisch;

import org.junit.Assert;
import org.junit.Test;

public class ITestBuchstabenImSatzKyrillischService {

	@Test
	public void testSatzZuKyrillisch() {
		BuchstabenImSatzKyrillischService service = new BuchstabenImSatzKyrillischService();
		String actuals = service.convert("test");
		System.out.println(actuals);
		Assert.assertEquals("ТЭЅТ", actuals);
	}

	@Test
	public void testSatzZuKyrillischMitUmlaut() {
		BuchstabenImSatzKyrillischService service = new BuchstabenImSatzKyrillischService();
		String actuals = service.convert("AÄOÖuÜ");
		System.out.println(actuals);
		Assert.assertEquals("ААЭООЭUUЭ", actuals);
	}
}
