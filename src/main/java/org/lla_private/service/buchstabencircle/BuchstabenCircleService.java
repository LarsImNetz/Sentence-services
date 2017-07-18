package org.lla_private.service.buchstabencircle;

import text.manipulation.decorator.NoUmlautDecorator;
import text.manipulation.satz.SatzManipulator;
import text.manipulation.word.BuchstabenToOpf;
import text.manipulation.word.BuchstabenWithCircle;

public class BuchstabenCircleService implements IBuchstabenCircleService {

	@Override
	public String manipulieren(String satz) {
		SatzManipulator satzManipulator = new SatzManipulator(new NoUmlautDecorator(new BuchstabenWithCircle()));
		satzManipulator.setSentence(satz);
		return satzManipulator.getSentence();
	}
}
