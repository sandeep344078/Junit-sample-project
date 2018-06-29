package com.hdp.calculator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {

	private static ICalculator calculator;

	@BeforeClass
	public static void initCalculator() {
		  calculator = new Calculator();
	}
	
	@Before
	public void beforeEachTest() {
		System.out.println("This is executed before each Test");

	}
	
	@After
	public void afterEachTest() {
		System.out.println("This is exceeuted after each Test");

	}
	
	@Test
	public void TestSum() {
		int result = calculator.sum(3, 7);
		Assert.assertEquals(10, result);
	}
	
	@Test
	public void testDivision() {
		try {
			int result = calculator.division(126, 63);
			Assert.assertEquals(2, result);
		} catch(Exception e) {
			//e.printStackTrace(System.err);
			System.out.println(e);
		}
	}
	
	@Test(expected = Exception.class)
	public void testDivisionException() throws Exception {
		calculator.division(10, 0);
	}
	
}
