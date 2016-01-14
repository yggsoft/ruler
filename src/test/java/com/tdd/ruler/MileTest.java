package com.tdd.ruler;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

import org.junit.Test;

public class MileTest {
	@Test
	public void testEquals() {
		// 3 Mile == 3 Mileprivate Ratio ratio = Ratio.Mile;
		// 3 Mile != 2 Mile
		// 3 Mile != 4 Mile

		assertTrue(Ruler.mile(3).equals(Ruler.mile(3)));
		assertFalse(Ruler.mile(3).equals(Ruler.mile(2)));
		assertFalse(Ruler.mile(3).equals(Ruler.mile(4)));
	}
}
