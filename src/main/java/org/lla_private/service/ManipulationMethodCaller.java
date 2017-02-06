package org.lla_private.service;

import javax.inject.Inject;

import org.lla_private.service.buchstabendreher.IBuchstabenImSatzVerdrehenService;
import org.lla_private.service.buchstabenzuzahlen.IBuchstabenZuZahlenService;
import org.lla_private.service.kyrillisch.IBuchstabenImSatzKyrillischService;

import com.google.inject.Injector;

public class ManipulationMethodCaller implements IManipulationMethodCaller {

	@Inject 
	private Injector injector;
	
	@Inject
	public ManipulationMethodCaller(final Injector injector) {
		this.injector = injector;
	}
	
	@Override
	public String callAlgorithm(String convertMethod, String satz) {
		switch (convertMethod) {
		case "verdrehen":
			IBuchstabenImSatzVerdrehenService verdrehenService = injector.getInstance(IBuchstabenImSatzVerdrehenService.class);
			return verdrehenService.verdrehen(satz);
		case "kyrillisch":
			IBuchstabenImSatzKyrillischService satzKyrillischService = injector.getInstance(IBuchstabenImSatzKyrillischService.class);
			return satzKyrillischService.convert(satz);
		case "zuZahlen":
			IBuchstabenZuZahlenService satzZuZahlenService = injector.getInstance(IBuchstabenZuZahlenService.class);
			return satzZuZahlenService.convert(satz);
		default:
			break;
		}

		return null;
	}
}