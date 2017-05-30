package hackerrank;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TallestCandle {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer,Integer> candle = new TreeMap<Integer,Integer>();
        int n = in.nextInt();
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        
        for(int i =0; i < n; i++) {
        	if(candle.containsKey(height[i])) {
        		candle.put(height[i], candle.get(height[i]) +1);
        	}
        	else {
        		candle.put(height[i], 1);
        	}
        }
        
        System.out.println(candle.get(((TreeMap<Integer, Integer>) candle).lastKey()));
        
    }
}
