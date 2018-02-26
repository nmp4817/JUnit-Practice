package com.junitPractice.helper;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterizedTest1 {

	StringHelper helper = new StringHelper();
	
	private String input;
	private boolean expectedOutput;
	
	public StringHelperParameterizedTest1(String input, boolean expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}

	@Parameters
	public static Collection<Object[]> testConditions() {
		Object expectedOutputs[][] = { 
				{ "ABCD", false }, 
				{ "ABAB", true },
				{ "AB", true },
				{ "A", false }};
		return Arrays.asList(expectedOutputs);
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
		assertEquals(expectedOutput,helper.areFirstAndLastTwoCharactersTheSame(input));
	}
	
//	@Test
//	public void testAreFirstAndLastTwoCharactersTheSame1() {
//		assertTrue(helper.areFirstAndLastTwoCharactersTheSame(input));
//	}
//	
//	@Test
//	public void testAreFirstAndLastTwoCharactersTheSame2() {
//		assertFalse(helper.areFirstAndLastTwoCharactersTheSame(input));
//	}
}