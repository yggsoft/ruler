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
		Mile threeMile = new Mile(3);

		assertTrue(threeMile.equals(new Mile(3)));
		assertFalse(threeMile.equals(new Mile(2)));
		assertFalse(threeMile.equals(new Mile(4)));
	}
}
