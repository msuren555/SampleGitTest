package com.namitus.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConcatTest {

	@Test
	public void concatTest() {
		Junit test = new Junit();
		String result = test.concat("one", "two");
		assertEquals("onetwo", result);
	}

}
