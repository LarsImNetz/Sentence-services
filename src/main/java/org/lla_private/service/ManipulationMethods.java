package org.lla_private.service;

import java.util.ArrayList;
import java.util.List;

public class ManipulationMethods {

	private Methods methods;
	
	public ManipulationMethods() {
		methods = new Methods();
	}

	public Assoc[] getMethods() {
		return methods.items.toArray(new Assoc[0]);
	}

	public void registerMethod(String id, String description) {
		methods.register(id, description);
	}
	
	// --- inner representation ---
	public class Methods {
		List<Assoc> items;

		public Methods() {
			items = new ArrayList<>();
		}
		
		public void register(String id, String description) {
			items.add(new Assoc(id, description));
		}
	}

	public class Assoc {
		public final String id;
		public final String name;

		public Assoc(String id, String name) {
			this.id = id;
			this.name = name;
		}
	}
	
}
