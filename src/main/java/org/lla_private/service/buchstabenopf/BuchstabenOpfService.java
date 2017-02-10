package org.lla_private.service.buchstabenopf;

import text.manipulation.decorator.NoUmlautDecorator;
import text.manipulation.decorator.UppercaseDecorator;
import text.manipulation.satz.SatzManipulator;
import text.manipulation.word.BuchstabenToOpf;

public class BuchstabenOpfService implements IBuchstabenOpfService {

	@Override
	public String manipulieren(String satz) {
		SatzManipulator satzManipulator = new SatzManipulator(new NoUmlautDecorator(new BuchstabenToOpf()));
		satzManipulator.setSentence(satz);
		return satzManipulator.getSentence();
	}
}
