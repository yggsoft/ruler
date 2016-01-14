package com.tdd.ruler;

public class Ruler {

	protected int value;

	public Ruler(int value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		Ruler m = (Ruler) obj;
		return value == m.value;
	}

}