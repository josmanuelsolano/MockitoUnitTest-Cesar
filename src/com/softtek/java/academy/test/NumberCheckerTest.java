package com.softtek.java.academy.test;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;


public class NumberCheckerTest {
	NumbersChecker classToTest = null;
	
	@BeforeClass
	public static void loadOnClass(){
		System.out.println("This only run once");
	}
	
	@AfterClass
	public static void afterEndTest(){
		System.out.println("This only once at the end of the times");
	}
	
	@Before
	public void setup(){
		System.out.println("Setup method");
		this.classToTest = new NumbersChecker();
	}
	
	//numero positivo impar
	@Test
	@Ignore
	public void shouldTrueWhenOddPositiveNumber(){
		Assert.assertTrue(classToTest.isOdd(5));
	}
	//numero positivo par
	@Test
	public void shouldFalseWhenEvenPositiveNumber(){
		Assert.assertFalse(classToTest.isOdd(6));
	}
	//numero negativo impar
	@Test
	public void shouldFalseWhenEvenNegativeNumber(){
		Assert.assertFalse(classToTest.isOdd(-10));
	}
	//numero negativo par
	@Test
	public void shouldTrueWhenOddNegativeNumber(){
		Assert.assertTrue(classToTest.isOdd(-11));
	}
}
