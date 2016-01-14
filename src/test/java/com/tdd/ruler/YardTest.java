package com.tdd.ruler;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

import org.junit.Test;

public class YardTest {
	@Test
	public void testEquals() {
		//	1 Mile == 1760 Yard
		//	3 Yard = 3 Yard
		//	1 Mile != 1761 Yard
		//	3 Yard != 4 Yard
		Ruler threeYard = new Yard(3);
		Mile oneMile = new Mile(1);

		assertTrue(oneMile.equals(new Yard(1760)));
		assertTrue(threeYard.equals(new Yard(3)));
//		assertFalse(oneMile.equals(new Yard(1761)));		
//		assertFalse(threeYard.equals(new Yard(4)));
	}
}
