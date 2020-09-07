package com.sapient.training.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	Calculator cal;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class method");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class method");
	}

	@Before
	public void setUp() throws Exception {
		cal = new Calculator();
		System.out.println("Before test method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After test method");
	}

	@Test
	public void isValidtestAddition() {
		assertEquals("Test Passed",5.0,cal.addition(2.0,3.0),0.01);
	}
	
	@Test
	public void isInValidtestAddition() {
		assertNotEquals("Test Passed",5.0,cal.addition(3.0,3.0),0.01);
	}

	@Test
	public void isValidtestSubtraction() {
		assertEquals("Substration Passed",1,cal.subtraction(2,1),0.01);
	}
	@Test
	public void isinValidtestSubtraction() {
		assertNotEquals("Substration Passed",4,cal.subtraction(2,1),0.01);
	}

}
