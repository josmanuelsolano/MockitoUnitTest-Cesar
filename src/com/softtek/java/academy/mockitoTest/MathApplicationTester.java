package com.softtek.java.academy.mockitoTest;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {
	
	//@InjectMocks annotation is used to create and inject the mock object
	@InjectMocks
	MathApplication mathApplication = new MathApplication();
	
	//@Mock annotation is used to create the mock object to be injected
	@Mock
	CalculatorService calculatorService;
	
	@Test
	public void testAdd(){
		//add the behavior of calc service to add two numbers
		when(calculatorService.add(10.0,20.0)).thenReturn(30.0);
		//Test the add functionality
		Assert.assertEquals(mathApplication.add(10.0, 20.0), 30.0, 0);
	}
	
	@Test
	public void testSubstract(){
		//add the behavior of calc service to subtract two numbers
		when(calculatorService.subtract(20.0,10.0)).thenReturn(10.0);
		//Test the subtract functionality
		Assert.assertEquals(mathApplication.subtract(20.0, 10.0), 10.0, 0);
	}
	
	@Test
	public void testMultiply(){
		//add the behavior of calc service to multiply two numbers
		when(calculatorService.multiply(20.0,10.0)).thenReturn(200.0);
		//Test the multiply functionality
		Assert.assertEquals(mathApplication.multiply(20.0, 10.0), 200.0, 0);
		verify(calculatorService).multiply(20.0, 10.0);
	}
	
	@Test
	public void testDivide(){
		//add the behavior of calc service to divide two numbers
		when(calculatorService.divide(20.0,10.0)).thenReturn(2.0);
		//Test the divide functionality
		Assert.assertEquals(mathApplication.divide(20.0, 10.0), 2.0, 0);
	}
	
	@Test
	public void testSquareMultipliedNumbers(){
		//add the behavior of calc service to squareMultipledNumber
		when(calculatorService.multiply(2.0, 2.0)).thenReturn(4.0);
		//Test the square multiplied numbers functionality
		Assert.assertEquals(mathApplication.squareMultipliedNumbers(2.0, 2.0), 16.0, 0);
	}
	
	@Test
	public void testMultiplyResultBy100(){
		//add the behavior of calc service to multiplyResultBy100
		when(calculatorService.multiply(2.0, 5.0)).thenReturn(10.0);
		//Test the multiply result by 100 functionality
		Assert.assertEquals(mathApplication.multiplyResultBy100(2.0, 5.0), 1000.0, 0);
	}
}
