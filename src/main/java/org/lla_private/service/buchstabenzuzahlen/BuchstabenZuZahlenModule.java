package org.lla_private.service.buchstabenzuzahlen;

import javax.inject.Singleton;

import com.google.inject.AbstractModule;

public class BuchstabenZuZahlenModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IBuchstabenZuZahlenService.class).to(BuchstabenZuZahlenService.class).in(Singleton.class);		
	}

}
