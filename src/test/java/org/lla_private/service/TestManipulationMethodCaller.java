package org.lla_private.service;

import org.junit.Assert;
import org.junit.Test;
import org.lla_private.service.buchstabendreher.IBuchstabenImSatzVerdrehenService;
import org.mockito.Mockito;

import com.google.inject.Injector;

public class TestManipulationMethodCaller {

	@Test
	public void test() {
		Injector injectorMock = Mockito.mock(Injector.class);
		IBuchstabenImSatzVerdrehenService verdrehService = Mockito.mock(IBuchstabenImSatzVerdrehenService.class);

		String satz="satz";
		Mockito.when(verdrehService.verdrehen(satz)).thenReturn("verdrehter Satz");
		Mockito.when(injectorMock.getInstance(IBuchstabenImSatzVerdrehenService.class)).thenReturn(verdrehService );
		
		ManipulationMethodCaller caller = new ManipulationMethodCaller(injectorMock);
		
		String verdrehterSatz = caller.callAlgorithm(ManipulationEnum.VERDREHEN.name(), satz);
		Assert.assertEquals("verdrehter Satz", verdrehterSatz);
	}
}
