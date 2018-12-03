package practice.interview.israel;

public class ArrayPath {
	
	private int findPath(int[][] array, int x, int y) {
		int sum = array[0][0];
		for (int i = 0; i < x; ) {
			for (int j = 0; j < y; ) {
				if(i+1 >= x) {
					sum = sum + array[i][++j];
					System.out.println("1");
					System.out.println("Sum : " + sum);
					System.out.println(i+ " " + j);
					++i;
					++j;
					break;
				}
				if(j+1 >= y) {
					sum = sum + array[++i][j];
					System.out.println("2");
					System.out.println("Sum : " + sum);
					System.out.println(i+ " " + j);
					++i;
					++j;
					break;
				}
				if(array[i][j+1] > array[i+1][j]) {
					sum = sum + array[i][j+1];
					System.out.println("3");
					System.out.println("Sum : " + sum);
					System.out.println(i+ " " + j);
					j++;
					continue;
				}
				else {
					sum = sum + array[i+1][j];
					System.out.println("4");
					System.out.println("Sum : " + sum);
					i++;
					System.out.println(i+ " " + j);
					continue;

				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		ArrayPath ap = new ArrayPath();
		int array[][] =  {{1,2,3}, {4,5,10}, {1,22,16}};
		int result = ap.findPath(array, 3, 3);
		System.out.println(result);
		int array1[][] = {{1,5,4,16}, {32,40,10,8}, {40,1,6,3}, {0,5,2,10}};
		result = ap.findPath(array1, 4, 4);
		System.out.println(result);
		
	}

}
