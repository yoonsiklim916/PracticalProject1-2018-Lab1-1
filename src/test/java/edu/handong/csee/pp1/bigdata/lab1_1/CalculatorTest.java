package edu.handong.csee.pp1.bigdata.lab1_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testMain() {
		String[] args = {"2", "3"};
		Calculator.main(args);
		assertEquals(Calculator.getCount(),4);
	}
	
	@Test
	public void testSum() {
		Calculator myCalc = new Calculator();
		assertEquals(myCalc.sum(2, 3),5);
	}
	
	@Test
	public void testSub() {
		Calculator myCalc = new Calculator();
		assertEquals(myCalc.subtract(2, 3),-1);
	}

	@Test
	public void testMultiply() {
		// TODO
	}
	
	@Test
	public void testDivide() {
		// TODO
	}
}
