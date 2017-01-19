package org.lla_private.service.satzdreher;

import javax.inject.Singleton;

import com.google.inject.AbstractModule;

public class SatzDreherModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(ISatzDreherService.class).to(SatzDreherService.class).in(Singleton.class);
		
	}

}
