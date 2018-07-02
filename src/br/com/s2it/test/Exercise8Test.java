package br.com.s2it.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.s2it.exercise8.Exercise8;

public class Exercise8Test {

	@Test
	public void testNumberALargerThanNumberB() {
		Exercise8 p = new Exercise8();

		int result0 = p.calcNumber(3400, 12);
		int result1 = p.calcNumber(12, 3400);

		assertEquals(result0, 314200);
		assertEquals(result1, 314200);
	}

	@Test
	public void testNumberAhigherThenNumberB() {
		Exercise8 p = new Exercise8();

		int result0 = p.calcNumber(34, 12);
		int result1 = p.calcNumber(345, 123);
		int result2 = p.calcNumber(9876, 8765);
		int result3 = p.calcNumber(900, 100);
		int result4 = p.calcNumber(123, 456);
		int result5 = p.calcNumber(111, 999);
		int result6 = p.calcNumber(000, 000);

		assertEquals(result0, 3142);
		assertEquals(result1, 314253);
		assertEquals(result2, -1);
		assertEquals(result3, 910000);
		assertEquals(result4, 142536);
		assertEquals(result5, 191919);
		assertEquals(result6, 000000);
	}

}
