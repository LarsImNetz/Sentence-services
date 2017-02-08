package org.lla_private.service.buchstabenzuzahlen;

import text.manipulation.satz.SatzManipulator;
import text.manipulation.word.BuchstabenManipulator;
import text.manipulation.word.BuchstabenManipulatorDigit;

public class BuchstabenZuZahlenService implements IBuchstabenZuZahlenService {

	@Override
	public String convert(String satz) {
		SatzManipulator satzManipulator = new SatzManipulator(new BuchstabenManipulatorDigit());
		satzManipulator.setSentence(satz.toUpperCase());
		return satzManipulator.getSentence();
	}

}
