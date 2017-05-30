package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {

    public static void main(String[] args) {
    	MinMaxSum mms = new MinMaxSum();
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        Arrays.sort(arr);
        
        System.out.print(mms.min(arr) + " " + mms.max(arr));

    }
    
    public long min(int[] arr) {
    	long sum = 0;
    	for(int arr_i=0; arr_i < 4; arr_i++) {
    		sum = sum + arr[arr_i];
    	}
    	return sum;
    }
    
    public long max(int[] arr) {
    	long sum = 0;
    	for(int arr_i=1; arr_i < 5; arr_i++) {
    		sum = sum + arr[arr_i];
    	}
    	return sum;
    }
}
