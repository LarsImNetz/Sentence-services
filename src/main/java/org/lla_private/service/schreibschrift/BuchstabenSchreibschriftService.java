package org.lla_private.service.schreibschrift;

import text.manipulation.decorator.NoUmlautDecorator;
import text.manipulation.satz.SatzManipulator;
import text.manipulation.word.BuchstabenToSchreibschrift;

public class BuchstabenSchreibschriftService implements IBuchstabenSchreibschriftService {

	@Override
	public String manipulieren(String satz) {
		SatzManipulator satzManipulator = new SatzManipulator(new NoUmlautDecorator(new BuchstabenToSchreibschrift()));
		satzManipulator.setSentence(satz);
		return satzManipulator.getSentence();
	}
}
