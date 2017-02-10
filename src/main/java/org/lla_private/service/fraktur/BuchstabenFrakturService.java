package org.lla_private.service.fraktur;

import text.manipulation.decorator.NoUmlautDecorator;
import text.manipulation.decorator.UppercaseDecorator;
import text.manipulation.satz.SatzManipulator;
import text.manipulation.word.BuchstabenToFraktur;
import text.manipulation.word.BuchstabenToOpf;

public class BuchstabenFrakturService implements IBuchstabenFrakturService {

	@Override
	public String manipulieren(String satz) {
		SatzManipulator satzManipulator = new SatzManipulator(new NoUmlautDecorator(new BuchstabenToFraktur()));
		satzManipulator.setSentence(satz);
		return satzManipulator.getSentence();
	}
}
