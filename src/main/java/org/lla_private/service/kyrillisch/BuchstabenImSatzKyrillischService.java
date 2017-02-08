package org.lla_private.service.kyrillisch;

import text.manipulation.decorator.NoUmlautDecorator;
import text.manipulation.satz.SatzManipulator;
import text.manipulation.word.BuchstabenToKyrillisch;

public class BuchstabenImSatzKyrillischService implements IBuchstabenImSatzKyrillischService {

	// TODO: wir brauchen doch einen UpperCaseDecorator, damit die Reihenfolge eingehalten wird
	@Override
	public String convert(String satz) {
		SatzManipulator satzManipulator = new SatzManipulator(new NoUmlautDecorator(new BuchstabenToKyrillisch()));
		satzManipulator.setSentence(satz.toUpperCase());
		return satzManipulator.getSentence();
	}

}
