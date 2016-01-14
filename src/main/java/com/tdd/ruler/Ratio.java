package com.tdd.ruler;

public enum Ratio {
	Mile(1), Yard(Mile.value() * 1760), Foot(Yard.value() * 3), Inch(Foot.value() * 12);

	private int radio;

	Ratio(int ratio) {
		this.radio = ratio;
	}

	public int value() {
		return this.radio;
	}

}
