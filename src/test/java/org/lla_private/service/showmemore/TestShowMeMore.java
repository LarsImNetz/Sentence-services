package org.lla_private.service.showmemore;

import org.junit.Assert;
import org.junit.Test;

public class TestShowMeMore {

	@Test
	public void testCallTime() {
		IShowMeMore more = new ShowMeMore();

		long startTime = System.currentTimeMillis();
			
		String value = more.more();
		
		long endTime = System.currentTimeMillis() - startTime;
		System.out.println(endTime + " ms");
	
		Assert.assertNotNull(more);
		Assert.assertTrue(value.length() > 0);
	}
}
