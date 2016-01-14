package com.tdd.ruler;

public class Ruler {
	private int value;
	protected Ratio ratio;

	private Ruler(int value, Ratio ratio) {
		this.value = value;
		this.ratio = ratio;
	}

	private static Ruler createRuler(int value, Ratio ratio) {
		return new Ruler(value, ratio);
	}

	public static Ruler mile(int value) {
		return new Ruler(value, Ratio.Mile);
	}

	public static Ruler yard(int value) {
		return new Ruler(value, Ratio.Yard);
	}

	@Override
	public boolean equals(Object obj) {
		Ruler r = (Ruler) obj;
		return this.value * r.ratio.value() == this.ratio.value() * r.value;
	}

	public Ratio getRatio() {
		return ratio;
	}

	public static Ruler foot(int value) {
		return new Ruler(value, Ratio.Foot);
	}

	public static Ruler inch(int value) {
		return new Ruler(value, Ratio.Inch);
	}

	public Ruler add(Ruler rule) {
		if (this.getRatio() == rule.getRatio()) {
			return new Ruler(getValue() + rule.getValue(), getRatio());
		}

		if (this.getRatio().value() > rule.getRatio().value()) {
			return new Ruler(rule.getValue() * getRatio().value() / rule.getRatio().value() + getValue(), getRatio());
		} else {
			return new Ruler(getValue() * rule.getRatio().value() / getRatio().value() + rule.getValue(), rule.getRatio());
		}
	}

	public int getValue() {
		return value;
	}
}