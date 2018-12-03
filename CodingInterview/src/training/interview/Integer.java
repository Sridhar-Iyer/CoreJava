package training.interview;

import java.util.Arrays;

public class Integer {

	private Character[] digits = new Character[] {'0','1','2','3','4','5','6','7','8','9'};
	
	public int parseInt(String s) throws NumberFormatException {
		int number = 0;
		int count = 0;
		if (s == null) throw new NumberFormatException("Null");
		else if (s == "") throw new NumberFormatException("Empty string");
		for(int i = s.length()-1; i >= 0 ; i--) {
			if(Arrays.asList(digits).contains(s.charAt(i))) {
				number = (int) (number + ( ( s.charAt(i) - 48) * Math.pow(10, count)));
				++count;
			} else throw new NumberFormatException("Invalid integer character found in string '" + s.charAt(i) + "'" );
		}
		return number;
	}
	
	public static void main(String[] args) {
		Integer integer = new Integer();
		try {
			
			int a = integer.parseInt("325");
			int b = integer.parseInt(" ");
			System.out.println(b);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
