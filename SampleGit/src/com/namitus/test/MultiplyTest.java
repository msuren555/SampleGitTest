package com.namitus.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MultiplyTest {

	@Test
	public void multiplyTest() {
		Junit test = new Junit();
		int result = test.multiply(3, 5);
		assertEquals(15, result);
	}

}
