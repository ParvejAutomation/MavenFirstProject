package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest2 {
	@Test
	public void sum() {
		System.out.println("Sum");
		int a=10;
		int b=20;
		Assert.assertEquals(30, a+b);
	}
	@Test
	public void sub() {
		System.out.println("Sub");
		int a=30;
		int b=20;
		Assert.assertEquals(10, a-b);
	}
	@Test
	public void mul() {
		System.out.println("Mul");
		int a=10;
		int b=20;
		Assert.assertEquals(200, a*b);
	}
	

}
