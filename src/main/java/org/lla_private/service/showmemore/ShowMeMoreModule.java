package org.lla_private.service.showmemore;

import javax.inject.Singleton;

import com.google.inject.AbstractModule;

public class ShowMeMoreModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IShowMeMoreService.class).to(ShowMeMoreService.class).in(Singleton.class);		
	}

}
