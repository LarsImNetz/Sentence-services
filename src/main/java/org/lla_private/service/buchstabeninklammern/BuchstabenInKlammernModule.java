package org.lla_private.service.buchstabeninklammern;

import javax.inject.Singleton;

import com.google.inject.AbstractModule;

public class BuchstabenInKlammernModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IBuchstabenInKlammernService.class).to(BuchstabenInKlammernService.class).in(Singleton.class);
		
	}

}
