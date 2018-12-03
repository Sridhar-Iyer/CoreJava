package practice.interview.unity3d;

public class Recursive2DMatrix {

	public static void main(String[] args) {
		int[][] array = new int[5][5];
		Recursive2DMatrix r2dm = new Recursive2DMatrix();
		array = r2dm.fillMatrix(array, 0, 0, 1);
		
		for(int i = 0; i < 5 ; i++) {
			for(int j = 0; j < 5 ; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}
	
	public int[][] fillMatrix(int[][] array, int row, int column, int number) {
		if(row < array.length) {
			if(column == array.length) {
				fillMatrix(array,++row, 0,number);
			} else {
				array[row][column] = number;
				fillMatrix(array,row,++column,++number);
			}
		}
		return array;
	}

}
