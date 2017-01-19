package org.lla_private.service.satzdreher;

import text.SatzManipulator;
import text.manipulation.BuchstabenManipulator;

public class SatzDreherService implements ISatzDreherService {

	@Override
	public String satzDrehen(String satz) {
		SatzManipulator satzManipulator = new SatzManipulator(new BuchstabenManipulator());
		satzManipulator.setSentence(satz);
		satzManipulator.perform();
		return satzManipulator.getSentence();
	}

}
