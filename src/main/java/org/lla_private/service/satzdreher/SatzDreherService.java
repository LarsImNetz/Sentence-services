package org.lla_private.service.satzdreher;

import text.SatzDreher;

public class SatzDreherService implements ISatzDreherService {

	@Override
	public String satzDrehen(String satz) {
		SatzDreher dreher = new SatzDreher(satz);
		return dreher.getVerdrehtenSatz();
	}

}
