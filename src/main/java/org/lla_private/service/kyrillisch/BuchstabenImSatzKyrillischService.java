package org.lla_private.service.kyrillisch;

import text.SatzManipulator;
import text.manipulation.BuchstabenToKyrillisch;

public class BuchstabenImSatzKyrillischService implements IBuchstabenImSatzKyrillischService {

	@Override
	public String convert(String satz) {
		SatzManipulator satzManipulator = new SatzManipulator(new BuchstabenToKyrillisch());
		satzManipulator.setSentence(satz.toUpperCase());
		satzManipulator.perform();
		return satzManipulator.getSentence();
	}

}
