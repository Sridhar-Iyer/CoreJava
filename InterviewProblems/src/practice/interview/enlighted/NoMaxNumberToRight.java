package practice.interview.enlighted;

public class NoMaxNumberToRight {

	public static void main(String[] args) {
		int[] array = { 9, 5, 7, 8, 6, 4, 3, 1 };
		int[] maxArray = new NoMaxNumberToRight().noMaxRight(array);

		for (int i : maxArray) {
			System.out.println(i);
		}

	}

	public int[] noMaxRight(int[] array) {
		boolean flag;
		int count = 0;
		int[] newArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			flag = true;
			for (int j = i; j < array.length; j++) {
				if (array[i] < array[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				newArray[count] = array[i];
				count++;
			}
		}
		return newArray;
	}

}
