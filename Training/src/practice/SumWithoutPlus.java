package practice;

// This is an apple interview question
public class SumWithoutPlus {

	public static void main(String[] args) {
		System.out.println(sum(-2,-3));
	}
	
	public static int sum(int a, int b) {
		while ( a > 0 ) {
			--a;
			++b;
		}
		while (a < 0) {
			++a;
			--b;
		}
		return b;
	}
}
