package com.junitPractice.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	@Test
	public void testArraySort_RandomArray() {
		int[] numbers = { 12, 3, 4, 1 };
		int[] expected = { 1, 3, 4, 12 };
//		int[] expected = { 1, 4, 3, 12 };				//Will fail since it's not sorted
		Arrays.sort(numbers);
//		assertEquals(expected,numbers);					//will fail as assertEquals() is compare whole object
		assertArrayEquals(expected, numbers);
	}

	@Test(expected=NullPointerException.class)
	public void testArraySort_NullArray() {
		int[] numbers = null;
		Arrays.sort(numbers);
//		try{
//			Arrays.sort(numbers);
//		} catch (NullPointerException ne) {
//			//success
//		}
	}
	
	@Test(timeout=100)
	public void testSort_Performance(){
		int array[] = {12,23,4};
		for(int i=1;i<=1000000;i++)
		{
			array[0] = i;
			Arrays.sort(array);
		}
	}

}