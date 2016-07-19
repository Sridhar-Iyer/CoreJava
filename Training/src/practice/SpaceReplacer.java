package practice;

/**
 * 
 * @author Sridhar
 * Amazon Interview Question
 * 
 * Replace a String with spaces in between them with %20
 *
 */

public class SpaceReplacer {

	public static void main(String[] args) {
		System.out.println(replaceSpaces("Hello World Sridhar"));
	}
	
	private static String replaceSpaces(String givenString) {
		
		int lengthOfGivenString = givenString.length();
		char PERCENT = '%';
		char TWO = '2';
		char ZERO = '0';
		int spaceCounter = 0;
		
		for(int i = 0; i < lengthOfGivenString; i++) {
			if(givenString.charAt(i) == ' ') {
				spaceCounter++;
			}
		}
		int lenghtOfOutputString = lengthOfGivenString + ( spaceCounter * 3);
		StringBuilder outputString = new StringBuilder(lenghtOfOutputString);
		
		for(int j = 0; j < lengthOfGivenString; j++) {
				if(givenString.charAt(j) == ' ') {
					outputString.append(PERCENT);
					outputString.append(TWO);
					outputString.append(ZERO);
				} else {
					outputString.append(givenString.charAt(j));
				}
			}
			
		return outputString.toString();
	}

}
