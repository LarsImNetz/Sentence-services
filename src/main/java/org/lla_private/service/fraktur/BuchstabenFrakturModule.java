package org.lla_private.service.fraktur;

import javax.inject.Singleton;

import com.google.inject.AbstractModule;

public class BuchstabenFrakturModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IBuchstabenFrakturService.class).to(BuchstabenFrakturService.class).in(Singleton.class);		
	}

}
