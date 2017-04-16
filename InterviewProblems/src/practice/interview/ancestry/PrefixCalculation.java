package practice.interview.ancestry;

/*
 * Write a method to read values from an array of strings
 * in a specific format and do the specified calculation. 
 * Use the follow values in your array:
 * +;1;2
 * -;3;4
 * *;5;-6
*/

public class PrefixCalculation {

	public static void main(String[] args) {
		String[] array = { "+;1;2", "-;3;4" };
		new PrefixCalculation().performCalculation(array);
	}

	public void performCalculation(String[] expressions) {
		String[] expression = new String[expressions.length];
		for (String exp : expressions) {
			expression = exp.split(";");
			Integer result = 0;
			switch (expression[0]) {
			case "+":
				result = Integer.parseInt(expression[1]) + Integer.parseInt(expression[2]);
				break;
			case "-":
				result = Integer.parseInt(expression[1]) - Integer.parseInt(expression[2]);
			}
			System.out.println("Result " + result);
		}
	}
}
