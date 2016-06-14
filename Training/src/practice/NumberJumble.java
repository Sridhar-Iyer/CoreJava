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
		Integer previousDigit = 0;
		Integer currentDigit = 0;
		boolean flag = true;
		while(number > 0) {
			previousDigit = currentDigit;
			currentDigit = number % 10;
			number = number / 10;
			if(previousDigit != 0) {
				if(previousDigit == (currentDigit + 1) || previousDigit == (currentDigit -1 )) {
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
