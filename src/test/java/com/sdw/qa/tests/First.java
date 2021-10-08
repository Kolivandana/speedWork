package com.sdw.qa.tests;

import org.testng.annotations.Test;

import com.sdw.qa.base.TestBase;

public class First {

	@Test
	public void m2() {
		System.out.println("In test class");
		TestBase tb = new TestBase();
		tb.m1();
	}
}
