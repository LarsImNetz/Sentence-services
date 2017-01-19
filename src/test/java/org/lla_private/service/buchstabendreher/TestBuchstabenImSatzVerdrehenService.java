package org.lla_private.service.buchstabendreher;

import org.junit.Assert;
import org.junit.Test;
import org.lla_private.service.buchstabendreher.BuchstabenImSatzVerdrehenModule;
import org.lla_private.service.buchstabendreher.BuchstabenImSatzVerdrehenService;
import org.lla_private.service.buchstabendreher.IBuchstabenImSatzVerdrehenService;
import org.mockito.Mockito;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class TestBuchstabenImSatzVerdrehenService {

	private IBuchstabenImSatzVerdrehenService buchstabenImSatzVerdrehenServiceSUT;

	@Test
	public void testBuchstabenImSatzVerdrehenService() {
		buchstabenImSatzVerdrehenServiceSUT = new BuchstabenImSatzVerdrehenService();
		String actual = buchstabenImSatzVerdrehenServiceSUT.verdrehen("egal");
		Assert.assertEquals("eagl", actual);
	}

	@Test
	public void testBuchstabenImSatzVerdrehenServiceMitMockito() {
		buchstabenImSatzVerdrehenServiceSUT = Mockito.mock(IBuchstabenImSatzVerdrehenService.class);

		Mockito.when(buchstabenImSatzVerdrehenServiceSUT.verdrehen(Mockito.anyString())).thenReturn("verdrehter Satz");

		final String actual = buchstabenImSatzVerdrehenServiceSUT.verdrehen("Text wird hier nicht gebraucht");

		Assert.assertEquals("verdrehter Satz", actual);
	}

	@Test
	public void testBuchstabenImSatzVerdrehenServiceMitModule() {
		Injector injector = Guice.createInjector(new BuchstabenImSatzVerdrehenModule());
		buchstabenImSatzVerdrehenServiceSUT = injector.getInstance(BuchstabenImSatzVerdrehenService.class);

		String actual = buchstabenImSatzVerdrehenServiceSUT.verdrehen("egal");
		Assert.assertEquals("eagl", actual);
	}
}
