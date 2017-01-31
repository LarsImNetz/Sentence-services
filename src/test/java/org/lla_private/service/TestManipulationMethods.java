package org.lla_private.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.lla_private.service.ManipulationMethods.Assoc;

public class TestManipulationMethods {

	private ManipulationMethods manipulationMethods;
	
	@Before
	public void setUp() {
		manipulationMethods = new ManipulationMethods();
	}
	
	@Test
	public void testWithoutValues() {
		Assoc[] methods = manipulationMethods.getMethods();

		Assert.assertNotNull(methods);
		Assert.assertEquals(0, methods.length);
	}
	
	@Test
	public void setCheckWith1Value() {
		manipulationMethods.registerMethod("1", "eins");
		Assoc[] methods = manipulationMethods.getMethods();

		Assert.assertEquals(1, methods.length);
		Assert.assertEquals("1", methods[0].id);
		Assert.assertEquals("eins", methods[0].name);
	}
}
