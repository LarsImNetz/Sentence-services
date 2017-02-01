package org.lla_private.service;

import org.lla_private.service.ManipulationMethods.Assoc;
import org.lla_private.service.buchstabendreher.BuchstabenImSatzVerdrehenModule;
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

		// TODO: Die SentenceServices müssen hier weg!
		install("verdrehen", "Buchstaben im Satz verdrehen", new BuchstabenImSatzVerdrehenModule());
		install("kyrillisch", "Buchstaben durch Kyrillisch ersetzen", new BuchstabenImSatzKyrillischModule());
	}

	private void install(String id, String description, AbstractModule module) {
		install(module);
		manipulationMethods.registerMethod(id, description);
	}

	@Override
	public Assoc[] getMethods() {
		return manipulationMethods.getMethods();
	}
}
