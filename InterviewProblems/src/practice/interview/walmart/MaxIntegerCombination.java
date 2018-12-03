package practice.interview.walmart;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxIntegerCombination {

	public static void main(String[] args) {
		int[] array =  {3,30,34,5,9};//{8,9,82,89,91} ;//{3,30,34,5,9};//{ 6, 35, 40,8};
		MaxIntegerCombination mic = new MaxIntegerCombination();
		System.out.println(mic.maxIntegerCombination(mic.firstDigitSort(mic.convertIntToStringArray(array))));
	}

/*	public long maxIntegerCombination(int[] numList) {
		String largestNumber = "";
		String currentNumber = "";
		for (int i = 0; i < numList.length; i += 2) {
			if (numList.length % 2 != 0 && i == numList.length - 1) {
				currentNumber = compare(Integer.toString(numList[i]), "");
			} else {
				currentNumber = compare(Integer.toString(numList[i]), Integer.toString(numList[i + 1]));
			}
			largestNumber = compare(largestNumber, currentNumber);
			System.out.println(largestNumber);
		}
		return Long.parseLong(largestNumber);
	}
*/
	
	public long maxIntegerCombination(String[] numList) {
		String largestNumber = "";
		String currentNumber = "";
		/*List<Integer> myNumberList = Arrays.asList(numList);
		Collections.sort(myNumberList, Collections.reverseOrder());
		numList = (Integer)myNumberList.toArray();*/
		for (int i = 0; i < numList.length; i++) {
			if(i == 0) {
				currentNumber = compare("",numList[i]);
			} else {
				currentNumber = compare(numList[i], currentNumber);
			}
			//System.out.println(currentNumber);
		}
		return Long.parseLong(currentNumber);
	}
	
	public String[] convertIntToStringArray(int[] intArray) {
		String[] stringArray = new String[intArray.length];
		for(int i = 0 ; i < intArray.length; i++) {
			stringArray[i] =  Integer.toString(intArray[i]);
		}
		//System.out.println(Integer.parseInt(stringArray[0].substring(0, 1)));
		return stringArray;
	}
	
	/*
	 * The following method sorts the given list in the following way
	 * The numbers are sorted depending on their first digit so 9 will come before 79, first iteration does that
	 * The second iteration makes sure that double digit numbers are also sorted in a similar manner.
	 * However the above iteration would result in the following result set for the given list { 34, 33, 30, 3 }
	 * The largest number returned would be 3433330 but it would return 3433303. To solve this we are doing the third iteration
	 * The third iteration, sorts number in the following way if the second digit of a number is smaller than the first digit it searches if the single digit for it 
	 * is available if yes then it swaps the number.
	 * 
	 */
	
	public String[] firstDigitSort(String[] stringArray) {
		String temp = "";
		for (int i = 0; i < stringArray.length; i++) {
			for (int j = i; j > 0; j--) {
				if (Integer.parseInt(stringArray[j].substring(0, 1)) > Integer
						.parseInt(stringArray[j - 1].substring(0, 1))) {
					temp = stringArray[j];
					stringArray[j] = stringArray[j - 1];
					stringArray[j - 1] = temp;
				}
			}
		}
		for (int i = 0; i < stringArray.length; i++) {
			for (int j = i; j > 0; j--) {
				if (Integer.parseInt(stringArray[j].substring(0, 1)) == Integer
						.parseInt(stringArray[j - 1].substring(0, 1)))
				if (Integer.parseInt(stringArray[j]) > Integer
						.parseInt(stringArray[j - 1])) {
					temp = stringArray[j];
					stringArray[j] = stringArray[j - 1];
					stringArray[j - 1] = temp;
				}
			}
		}
		for (int i = 0; i < stringArray.length; i++) {
			if (stringArray[i].length() > 1 && Integer.parseInt(stringArray[i].substring(0, 1)) > Integer
					.parseInt(stringArray[i].substring(1, 2))) {
				for(int j = i+1; j < stringArray.length; j++) {
					if (Integer.parseInt(stringArray[i].substring(0, 1)) == Integer.parseInt(stringArray[j].substring(0, 1)) && stringArray[j].length() == 1 ) {
						
						temp = stringArray[j];
						stringArray[j] = stringArray[i];
						stringArray[i] = temp;
					}
				}
				
			}
		}
		for(int i = 0; i < stringArray.length; i++) {
			//System.out.println(stringArray[i]);
		}
		return stringArray;
	}
	
	public String compare(String num1, String num2) {
		String n1 = num1 + num2;
		String n2 = num2 + num1;
		String bigNumber = "";
		bigNumber = Long.parseLong(n1) > Long.parseLong(n2) ? n1 : n2;
		return bigNumber;
	}

}
