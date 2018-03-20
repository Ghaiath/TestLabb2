package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


import org.apache.commons.lang3.ArrayUtils;

public class MainClassUI {

	public static void main(String[] args) throws IOException {
		Calculator Calc = new Calculator();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Expression here: ");
		String Expression = br.readLine();
		
		Calc.CheckValidity(Expression);

		String[] split = Expression.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");
		System.out.println(Arrays.toString(split));
		while (Arrays.asList(split).contains("*")) {
			for (int i = 1; i < split.length; i++) {
				if (split[i].equals("*")) {
					
					split[i - 1] = Double.toString(Calc.mul(Double.parseDouble(split[i - 1]), Double.parseDouble(split[i + 1])));
					split = ArrayUtils.remove(split, i + 1);
					split = ArrayUtils.remove(split, i);
					System.out.println(Arrays.toString(split));
				}
			}
		}
		
		while (Arrays.asList(split).contains("/")) {
			for (int i = 1; i < split.length; i++) {
				if (split[i].equals("/")) {
					split[i - 1] = Double.toString(Calc.div(Double.parseDouble(split[i - 1]), Double.parseDouble(split[i + 1])));
					split = ArrayUtils.remove(split, i + 1);
					split = ArrayUtils.remove(split, i);
					System.out.println(Arrays.toString(split));
				}
			}
		}
		
		while (Arrays.asList(split).contains("+")) {
			for (int i = 1; i < split.length; i++) {
				if (split[i].equals("+")) {
					split[i - 1] = Double.toString(Calc.add(Double.parseDouble(split[i - 1]), Double.parseDouble(split[i + 1])));
					split = ArrayUtils.remove(split, i + 1);
					split = ArrayUtils.remove(split, i);
					System.out.println(Arrays.toString(split));
				}
			}
		}
		
		while (Arrays.asList(split).contains("-")) {
			for (int i = 1; i < split.length; i++) {
				if (split[i].equals("-")) {
					split[i - 1] = Double.toString(Calc.sub(Double.parseDouble(split[i - 1]), Double.parseDouble(split[i + 1])));
					split = ArrayUtils.remove(split, i + 1);
					split = ArrayUtils.remove(split, i);
					System.out.println(Arrays.toString(split));
				}
			}
		}
	}
}
