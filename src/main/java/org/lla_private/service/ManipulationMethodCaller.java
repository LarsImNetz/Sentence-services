package org.lla_private.service;

import javax.inject.Inject;

import org.lla_private.service.buchstabencircle.IBuchstabenCircleService;
import org.lla_private.service.buchstabendreher.IBuchstabenImSatzVerdrehenService;
import org.lla_private.service.buchstabenopf.IBuchstabenOpfService;
import org.lla_private.service.buchstabenzuzahlen.IBuchstabenZuZahlenService;
import org.lla_private.service.fraktur.IBuchstabenFrakturService;
import org.lla_private.service.kyrillisch.IBuchstabenImSatzKyrillischService;
import org.lla_private.service.schreibschrift.IBuchstabenSchreibschriftService;

import com.google.inject.Injector;

public class ManipulationMethodCaller implements IManipulationMethodCaller {

	@Inject 
	private Injector injector;
	
	@Inject
	public ManipulationMethodCaller(final Injector injector) {
		this.injector = injector;
	}
	
	// TODO: SRP verletzt?
	@Override
	public String callAlgorithm(String convertMethod, String satz) {
		switch (ManipulationEnum.forString(convertMethod)) {
		case VERDREHEN:
			IBuchstabenImSatzVerdrehenService verdrehenService = injector.getInstance(IBuchstabenImSatzVerdrehenService.class);
			return verdrehenService.verdrehen(satz);
		case KYRILLISCH:
			IBuchstabenImSatzKyrillischService satzKyrillischService = injector.getInstance(IBuchstabenImSatzKyrillischService.class);
			return satzKyrillischService.convert(satz);
		case DIGITS:
			IBuchstabenZuZahlenService satzZuZahlenService = injector.getInstance(IBuchstabenZuZahlenService.class);
			return satzZuZahlenService.convert(satz);
		case OPF:
			IBuchstabenOpfService opfService = injector.getInstance(IBuchstabenOpfService.class);
			return opfService.manipulieren(satz);
		case FRAKTUR:
			IBuchstabenFrakturService service = injector.getInstance(IBuchstabenFrakturService.class);
			return service.manipulieren(satz);
		case SCHREIBSCHRIFT:
			IBuchstabenSchreibschriftService service2 = injector.getInstance(IBuchstabenSchreibschriftService.class);
			return service2.manipulieren(satz);
		case CIRCLE:
			IBuchstabenCircleService service3 = injector.getInstance(IBuchstabenCircleService.class);
			return service3.manipulieren(satz);
		default:
			break;
		}

		return null;
	}
}
