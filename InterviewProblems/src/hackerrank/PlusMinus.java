package hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		double negativeCount = 0.0;
		double zeroCount = 0.0;
		double positiveCount = 0.0;

		for (int arr_i = 0; arr_i < n; arr_i++) {
			negativeCount = ((arr[arr_i] < 0) ? ++negativeCount : negativeCount);
			positiveCount = ((arr[arr_i] > 0) ? ++positiveCount : positiveCount);
			zeroCount = ((arr[arr_i] == 0) ? ++zeroCount : zeroCount);
		}
		String number = n + ".0";
		double decimalNumber = Double.parseDouble(number);
		System.out.printf("%.6f\n", (double) positiveCount / decimalNumber);
        System.out.printf("%.6f\n", (double)negativeCount/decimalNumber);
        System.out.printf("%.6f\n", (double)zeroCount/decimalNumber);
    }
}
