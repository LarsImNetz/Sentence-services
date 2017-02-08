package org.lla_private.service.kyrillisch;

import text.manipulation.decorator.NoUmlautDecorator;
import text.manipulation.decorator.UppercaseDecorator;
import text.manipulation.satz.SatzManipulator;
import text.manipulation.word.BuchstabenToKyrillisch;

public class BuchstabenImSatzKyrillischService implements IBuchstabenImSatzKyrillischService {

	@Override
	public String convert(String satz) {
		SatzManipulator satzManipulator = new SatzManipulator(new NoUmlautDecorator(new UppercaseDecorator(new BuchstabenToKyrillisch())));
		satzManipulator.setSentence(satz);
		return satzManipulator.getSentence();
	}

}
