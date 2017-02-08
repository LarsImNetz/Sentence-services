package org.lla_private.service.buchstabendreher;

import text.manipulation.satz.SatzManipulator;
import text.manipulation.word.BuchstabenManipulator;

public class BuchstabenImSatzVerdrehenService implements IBuchstabenImSatzVerdrehenService {

	@Override
	public String verdrehen(String satz) {
		SatzManipulator satzManipulator = new SatzManipulator(new BuchstabenManipulator());
		satzManipulator.setSentence(satz);
		return satzManipulator.getSentence();
	}

}
