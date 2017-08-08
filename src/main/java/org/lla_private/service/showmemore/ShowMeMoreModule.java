package org.lla_private.service.showmemore;

import com.google.inject.AbstractModule;

public class ShowMeMoreModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IShowMeMore.class).to(ShowMeMore.class);
	}

}
