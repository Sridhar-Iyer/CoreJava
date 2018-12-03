package practice.interview.israel;

import java.util.Random;

public class RandomArray {

	int[][] array = new int[5][5];

	private int[][] initializeArray() {
		Random rand = new Random();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				int x = rand.nextInt(1000);
				array[i][j] = x;
			}
		}
		return array;
	}

	public static void main(String[] args) {
		RandomArray ra = new RandomArray();
		int[][] newArray = ra.initializeArray();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(newArray[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
