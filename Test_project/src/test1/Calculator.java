package test1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

	public double add(double number1, double number2) {
		return number1 + number2;
	}

	public double sub(double number1, double number2) {
		return number1 - number2;
	}

	public double mul(double number1, double number2) {
		return number1 * number2;
	}

	public double div(double number1, double number2) {
		if (number2 == 0) {
			throw new IllegalArgumentException("Man kan inte dividera by 0");
		}
		return number1 / number2;
	}

	public boolean CheckValidity(String Expression) {
		Pattern p = Pattern.compile("^(\\d+(\\.\\d+)?(?=\\D|$)|[+\\-/](?![+\\-/])|[()]|)+$", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(Expression);
		if (m.find()) {
			return true;
		}
		throw new IllegalArgumentException("Invalid Math Expression...");
	}
}