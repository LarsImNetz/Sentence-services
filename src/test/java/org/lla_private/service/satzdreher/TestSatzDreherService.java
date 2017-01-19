package org.lla_private.service.satzdreher;

import org.junit.Assert;
import org.junit.Test;
import org.lla_private.service.satzdreher.ISatzDreherService;
import org.lla_private.service.satzdreher.SatzDreherModule;
import org.lla_private.service.satzdreher.SatzDreherService;
import org.mockito.Mockito;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class TestSatzDreherService {

	private ISatzDreherService satzDreherServiceSUT;
		
	@Test
	public void testSatzDreherService(){
		satzDreherServiceSUT = new SatzDreherService();
		String actual = satzDreherServiceSUT.satzDrehen("egal");
		Assert.assertEquals("eagl", actual);
	}
	
	@Test
	public void testSatzDreherServiceMitMockito() {
		satzDreherServiceSUT = Mockito.mock(ISatzDreherService.class);

		Mockito.when(satzDreherServiceSUT.satzDrehen(Mockito.anyString())).thenReturn("verdrehter Satz");

		final String actual = satzDreherServiceSUT.satzDrehen("Text wird hier nicht gebraucht");
		
		Assert.assertEquals("verdrehter Satz", actual);
	}
	
	@Test
	public void testSatzDreherServiceMitModule() {
		Injector injector = Guice.createInjector(new SatzDreherModule());
		satzDreherServiceSUT = injector.getInstance(SatzDreherService.class);

		String actual = satzDreherServiceSUT.satzDrehen("egal");
		Assert.assertEquals("eagl", actual);	
	}
}
