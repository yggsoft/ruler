package com.tdd.ruler;

public enum Ratio {
	Mile(1), Yard(1760);

	private int radio;

	Ratio(int ratio) {
		this.radio = ratio;
	}

	public int value() {
		return this.radio;
	}

}
