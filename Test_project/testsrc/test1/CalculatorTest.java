package test1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void AddTest() {
		double a = 15;
		double b = 20;
		
		double expexted = 35;
		double result = Calculator.add(a, b);
		
		assertEquals(expexted, result, 0.000001);
	}

	@Test
	void SubTest() {
		double a = 15;
		double b = 20;
		
		double expexted = -5;
		double result = Calculator.sub(a, b);
		
		assertEquals(expexted, result, 0.000001);
	}
	
	@Test
	void MulTest() {
		double a = 5;
		double b = 20;
		
		double expexted = 100;
		double result = Calculator.mul(a, b);
		
		assertEquals(expexted, result, 0.000001);
	}
	
	@Test
	void DivTest() {
		double a = 20;
		double b = 5;
		
		double expexted = 4;
		double result = Calculator.div(a, b);
		
		assertEquals(expexted, result, 0.000001);
	}
}