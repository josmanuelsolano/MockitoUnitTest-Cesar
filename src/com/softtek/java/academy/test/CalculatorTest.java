package com.softtek.java.academy.test;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator classToTest = new Calculator();
	
	//positive positive - sum
	@Test
	public void shouldEqualWhenTenAndSumAreSameValue(){
		Assert.assertEquals(10, classToTest.sum(7, 3));
	}
	
	//positive negative - sum
	@Test
	public void shouldNotEqualWhenTenAndSumAreDifere(){
		Assert.assertNotEquals(10, classToTest.sum(5, -3));
	}
	
	
	//positive positive - minus
	@Test
	public void shoulEqualTenWhenFirstTwentyAndSecondTen(){
		Assert.assertEquals(10, classToTest.minus(20, 10));
	}
	
	//positive negative - minus
	@Test
	public void shoulEqualTenWhenFirstTwentyAndSecondMinusTen(){
		Assert.assertEquals(30, classToTest.minus(20, -10));
	}
	
	//positive negative - divide
	@Test
	public void ShouldEqualWhenDivideByOne(){
		Assert.assertEquals(10, classToTest.divide(10, 1));
	}
	//positive zero - divide
	@Test(expected = ArithmeticException.class)
	public void ShouldEqualWhenExceptionCaught(){
		Assert.assertEquals(10, classToTest.divide(10, 0));
	}
	
	//positive positive - multiply
	@Test
	public void shouldPositiveWhenFirstAndSecondNumberArePositive(){
		Assert.assertEquals(30, classToTest.multiply(5, 6));
	}
	
	//positive negative - multiply
	@Test
	public void shouldNegativeWhenOneOfNumbersNegative(){
		Assert.assertEquals(-30, classToTest.multiply(5, -6));
	}
	//negative negative - multiply

}
