package org.lla_private.service.buchstabencircle;

import javax.inject.Singleton;

import com.google.inject.AbstractModule;

public class BuchstabenCircleModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IBuchstabenCircleService.class).to(BuchstabenCircleService.class).in(Singleton.class);
		
	}

}
