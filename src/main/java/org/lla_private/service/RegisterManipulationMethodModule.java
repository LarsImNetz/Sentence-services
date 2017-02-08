package org.lla_private.service;

import javax.inject.Singleton;

import org.lla_private.service.ManipulationMethods.Assoc;
import org.lla_private.service.buchstabendreher.BuchstabenImSatzVerdrehenModule;
import org.lla_private.service.buchstabenopf.BuchstabenOpfModule;
import org.lla_private.service.buchstabenzuzahlen.BuchstabenZuZahlenModule;
import org.lla_private.service.kyrillisch.BuchstabenImSatzKyrillischModule;

import com.google.inject.AbstractModule;

public class RegisterManipulationMethodModule extends AbstractModule implements IManipulationMethod {

	private ManipulationMethods manipulationMethods;
	
	public RegisterManipulationMethodModule() {
		manipulationMethods = new ManipulationMethods();
	}

	@Override
	protected void configure() {
		bind(IManipulationMethod.class).toInstance(this);
		bind(IManipulationMethodCaller.class).to(ManipulationMethodCaller.class).in(Singleton.class);

		// TODO: Die SentenceServices müssen hier weg!
		install(ManipulationEnum.VERDREHEN, new BuchstabenImSatzVerdrehenModule());
		install(ManipulationEnum.KYRILLISCH, new BuchstabenImSatzKyrillischModule());
		install(ManipulationEnum.DIGITS, new BuchstabenZuZahlenModule());
		install(ManipulationEnum.OPF, new BuchstabenOpfModule());
	}

	private void install(ManipulationEnum manipulationType, AbstractModule module) {
		install(module);
		manipulationMethods.registerMethod(manipulationType.name(), manipulationType.getDescription());
	}

	@Override
	public Assoc[] getMethods() {
		return manipulationMethods.getMethods();
	}
}
