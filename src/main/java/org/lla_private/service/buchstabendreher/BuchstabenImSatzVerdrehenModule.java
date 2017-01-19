package org.lla_private.service.buchstabendreher;

import javax.inject.Singleton;

import com.google.inject.AbstractModule;

public class BuchstabenImSatzVerdrehenModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IBuchstabenImSatzVerdrehenService.class).to(BuchstabenImSatzVerdrehenService.class).in(Singleton.class);
		
	}

}
