package com.tdd.ruler;

public class Ruler {
	protected int value;
	protected Ratio ratio;

	public Ruler(int value, Ratio ratio) {
		this.value = value;
		this.ratio = ratio;
	}

	@Override
	public boolean equals(Object obj) {
		Ruler r = (Ruler) obj;
		return this.value * this.ratio.value() == r.ratio.value() / r.value;
	}

	public Ratio getRatio() {
		return ratio;
	}
}