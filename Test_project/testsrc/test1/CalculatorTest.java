package test1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	Calculator Calc = new Calculator();

	@Test
	void AddTest() {
		double a = 15;
		double b = 20;
		
		double expexted = 35;
		double result = Calc.add(a, b);
		
		assertEquals(expexted, result, 0.000001);
	}

	@Test
	void SubTest() {
		double a = 15;
		double b = 20;
		
		double expexted = -5;
		double result = Calc.sub(a, b);
		
		assertEquals(expexted, result, 0.000001);
	}
	
	@Test
	void MulTest() {
		double a = 5;
		double b = 20;
		
		double expexted = 100;
		double result = Calc.mul(a, b);
		
		assertEquals(expexted, result, 0.000001);
	}
	
	@Test
	void DivTest() {
		double a = 20;
		double b = 4;
		
		double expexted = 5;
		double result = Calc.div(a, b);
		
		assertEquals(expexted, result, 0.000001);
	}
	
	@Test
	void ValidityTest() {
		String Expression = "1+2+3a4-5+6*6/7/8";
		boolean expexted = false;
		boolean result = Calc.CheckValidity(Expression);
		assertFalse(result == expexted);		
	}
}