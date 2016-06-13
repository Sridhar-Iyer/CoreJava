package practice;

/*
 *  Amazon Interview question
 *  
Write all jumbled number which is >0 && <N, where N is provided by the user.
A jumbled number is a number whose next digit (either left or right) max differ by 1 value.
	e.g.:
	8987 is a jumbled number.
	13 is not a jumbled number.
	123456 is a jumbled number.
	287 is not jumbled number.
 *
 */

public class NumberJumble {

	public static void main(String[] args) {
		
		boolean flag = jumbleOrNot(13477);
		if(flag) {
			System.out.println("This is a jumbled number");
		} else {
			System.out.println("This is not a jumbled number");
		}

	}
	
	public static boolean jumbleOrNot(Integer number) {
		Integer previous_digit = 0;
		Integer current_digit = 0;
		boolean flag = true;
		while(number > 0) {
			previous_digit = current_digit;
			current_digit = number % 10;
			number = number / 10;
			if(previous_digit != 0) {
				if(previous_digit == (current_digit + 1) || previous_digit == (current_digit -1 )) {
					continue;
				} else {
					flag = false;
					break;
				}
			}	
		}
		return flag;
	}

}
