package org.lla_private.service;

public enum ManipulationEnum {
	VERDREHEN("Buchstaben im Satz verdrehen"),
	KYRILLISCH("Buchstaben durch Kyrillisch ersetzen"),
	DIGITS("einige Buchstaben zu Zahlen"),
	FRAKTUR("Buchstaben zu Fraktur"),
	SCHREIBSCHRIFT("Buchstaben in Schreibschrift"),
	OPF("Buchstaben zu Opf Zeichen");

	private String description;
	
	private ManipulationEnum(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	
	public static ManipulationEnum forString(String value) {
		for (ManipulationEnum enu: ManipulationEnum.values()) {
			if (enu.name().equalsIgnoreCase(value)) {
				return enu;
			}
		}
		return null;
	}
}
