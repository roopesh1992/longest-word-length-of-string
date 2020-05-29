package com.trowe.price;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestWordLengthOfStringTest {

	@Test
	public void test1() {
		LongestWordLengthOfString obj = new LongestWordLengthOfString();
		String output = obj.findLongestWordandLength("My name is Roopesh Babu");
		assertEquals("Roopesh 7", output);
	}
	
	@Test
	public void test2() {
		LongestWordLengthOfString obj1 = new LongestWordLengthOfString();
		String output = obj1.findLongestWordandLength("Coding assessment for T Rowe Price");
		assertEquals("assessment 10", output);
	}

}
