package org.lla_private.service.justatest;

import com.google.inject.AbstractModule;

public class NamedServiceModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(INamedService.class).to(NamedService.class);
	}

}
