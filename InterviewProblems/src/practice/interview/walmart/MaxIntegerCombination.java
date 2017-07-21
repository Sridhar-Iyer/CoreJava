package practice.interview.walmart;

public class MaxIntegerCombination {

	public static void main(String[] args) {
		int[] array = { 3, 30, 34, 5, 9 };
		System.out.println("Largest Number: " + new MaxIntegerCombination().maxIntegerCombination(array));
	}

	public long maxIntegerCombination(int[] numList) {
		String largestNumber = "";
		String currentNumber = "";
		for (int i = 0; i < numList.length; i += 2) {
			if (numList.length % 2 != 0 && i == numList.length - 1) {
				currentNumber = compare(Integer.toString(numList[i]), "");
			} else {
				currentNumber = compare(Integer.toString(numList[i]), Integer.toString(numList[i + 1]));
			}
			largestNumber = compare(largestNumber, currentNumber);
		}
		return Long.parseLong(largestNumber);
	}

	public String compare(String num1, String num2) {
		String n1 = num1 + num2;
		String n2 = num2 + num1;
		String bigNumber = "";
		bigNumber = Integer.parseInt(n1) > Integer.parseInt(n2) ? n1 : n2;
		return bigNumber;
	}

}
