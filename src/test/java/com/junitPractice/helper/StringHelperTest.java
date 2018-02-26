package com.junitPractice.helper;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

//	@Test
//	public void test() {
//		StringHelper helper = new StringHelper();
////		String actual = helper.truncateAInFirst2Positions("AACD");
////		String expected = "CD";
////		assertEquals(expected, actual);
//		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
//		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
//	}
	
//	StringHelper helper = new StringHelper();
	
	StringHelper helper;
	
	@Before
	public void setUp() {
		helper = new StringHelper();
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
//		StringHelper helper = new StringHelper();
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {
//		StringHelper helper = new StringHelper();
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AnotPresent() {
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinLast2Positions() {
		assertEquals("CDAA", helper.truncateAInFirst2Positions("ACDAA"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
//		boolean actual = helper.areFirstAndLastTwoCharactersTheSame("ABCD");
//		boolean expected = false;
//		assertEquals(expected,actual);
		
//		assertEquals(false,helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_Only2CharlongString() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_OnlyCharlongString() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
	}
}
