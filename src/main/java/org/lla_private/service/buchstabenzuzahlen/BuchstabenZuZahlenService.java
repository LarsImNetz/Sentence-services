package org.lla_private.service.buchstabenzuzahlen;

import text.SatzManipulator;
import text.manipulation.BuchstabenManipulator;
import text.manipulation.BuchstabenManipulatorDigit;

public class BuchstabenZuZahlenService implements IBuchstabenZuZahlenService {

	@Override
	public String convert(String satz) {
		SatzManipulator satzManipulator = new SatzManipulator(new BuchstabenManipulatorDigit());
		satzManipulator.setSentence(satz.toUpperCase());
		satzManipulator.perform();
		return satzManipulator.getSentence();
	}

}
