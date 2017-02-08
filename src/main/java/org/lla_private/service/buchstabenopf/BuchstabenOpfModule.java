package org.lla_private.service.buchstabenopf;

import javax.inject.Singleton;

import com.google.inject.AbstractModule;

public class BuchstabenOpfModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IBuchstabenOpfService.class).to(BuchstabenOpfService.class).in(Singleton.class);
		
	}

}
