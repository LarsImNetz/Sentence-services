package org.lla_private.service.buchstabeninklammern;

import text.manipulation.decorator.NoUmlautDecorator;
import text.manipulation.satz.SatzManipulator;
import text.manipulation.word.BuchstabenInKlammern;

public class BuchstabenInKlammernService implements IBuchstabenInKlammernService {

	@Override
	public String manipulieren(String satz) {
		SatzManipulator satzManipulator = new SatzManipulator(new NoUmlautDecorator(new BuchstabenInKlammern()));
		satzManipulator.setSentence(satz);
		return satzManipulator.getSentence();
	}
}
