package com.tdd.ruler;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

import org.junit.Test;

public class YardTest {
	@Test
	public void testEquals4YardMile() {
		//	1 Mile == 1760 Yard
		//	3 Yard = 3 Yard
		//	1 Mile != 1761 Yard
		//	3 Yard != 4 Yard
//		Ruler threeYard = new Yard(3);
//		Mile oneMile = new Mile(1);

		assertTrue(Ruler.mile(1).equals(Ruler.yard(1760)));
		assertTrue(Ruler.yard(3).equals(Ruler.yard(3)));
		assertFalse(Ruler.mile(1).equals(Ruler.yard(1761)));
		assertFalse(Ruler.yard(3).equals(Ruler.yard(4)));
	}


	@Test
	public void testEquals4YardFoot() {
//		1 Yard == 3 Feet
//		1 Feet == 12 Inch

		assertTrue(Ruler.yard(1).equals(Ruler.foot(3)));
		assertFalse(Ruler.foot(3).equals(Ruler.inch(12)));
	}

	@Test
	public void testAddition() {
//		13 Inch + 11 Inch = 2 Feet
//		3 Feet + 2 Yard = 3 Yard

		assertTrue(Ruler.inch(13).add(Ruler.inch(11)).equals(Ruler.foot(2)));
		assertTrue(Ruler.foot(3).add(Ruler.yard(2)).equals(Ruler.yard(3)));

	}
}
