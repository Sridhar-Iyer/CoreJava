package hackerrank;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String string = in.next();
		CamelCase cc = new CamelCase();
		System.out.println(cc.numberofWordsInString(string));
	}

	public Integer numberofWordsInString(String string) {
		Integer count = 0;
		if (string.equals(""))
			return count;
		else {
			for (int i = 0; i < string.length(); i++) {
				if (Character.isUpperCase(string.charAt(i))) {
					++count;
				}
			}
		}
		return count + 1;
	}

}
