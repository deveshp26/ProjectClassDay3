package org.re;


import org.testng.Assert;
import org.testng.annotations.Test;

public class A {
	
	@Test
	private void tc1() {
		System.out.println("Test 1");
	}
	@Test
	private void tc2() {
		Assert.assertTrue(false, "assert failure");
		System.out.println("Test 2");
	}
	@Test
	private void tc3() {
		System.out.println("Test 3");
	}

}