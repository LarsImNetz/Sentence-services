package org.lla_private.service.kyrillisch;

import javax.inject.Singleton;

import com.google.inject.AbstractModule;

public class BuchstabenImSatzKyrillischModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IBuchstabenImSatzKyrillischService.class).to(BuchstabenImSatzKyrillischService.class).in(Singleton.class);
		
	}

}
