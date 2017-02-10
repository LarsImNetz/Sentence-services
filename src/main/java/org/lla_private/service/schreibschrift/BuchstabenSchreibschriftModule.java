package org.lla_private.service.schreibschrift;

import javax.inject.Singleton;

import com.google.inject.AbstractModule;

public class BuchstabenSchreibschriftModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IBuchstabenSchreibschriftService.class).to(BuchstabenSchreibschriftService.class).in(Singleton.class);		
	}

}
