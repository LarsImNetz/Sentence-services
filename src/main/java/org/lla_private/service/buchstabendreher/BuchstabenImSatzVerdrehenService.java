package org.lla_private.service.buchstabendreher;

import text.SatzManipulator;
import text.manipulation.BuchstabenManipulator;

public class BuchstabenImSatzVerdrehenService implements IBuchstabenImSatzVerdrehenService {

	@Override
	public String verdrehen(String satz) {
		SatzManipulator satzManipulator = new SatzManipulator(new BuchstabenManipulator());
		satzManipulator.setSentence(satz);
		satzManipulator.perform();
		return satzManipulator.getSentence();
	}

}
