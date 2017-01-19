package org.lla_private.service.justatest;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class TestNamedService {

	private INamedService namedServiceSUT;
	
	@Test
	public void testNamedService(){
		namedServiceSUT = new NamedService();
		String actual = namedServiceSUT.getHello();
		Assert.assertEquals("Hello World", actual);
	}
	
	@Test
	public void testNamedServiceMitMockito() {
		namedServiceSUT = Mockito.mock(INamedService.class);

		Mockito.when(namedServiceSUT.getHello()).thenReturn("moin");

		final String actual = namedServiceSUT.getHello();
		
		Assert.assertEquals("moin", actual);
	}
	
	@Test
	public void testNamedServiceMitModule() {
		Injector injector = Guice.createInjector(new NamedServiceModule());
		namedServiceSUT = injector.getInstance(NamedService.class);

		String actual = namedServiceSUT.getHello();
		Assert.assertEquals("Hello World", actual);	
	}
}
