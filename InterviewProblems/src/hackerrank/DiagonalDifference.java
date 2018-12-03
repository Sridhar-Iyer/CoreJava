package com.workwave.jsonparser.JsonParser;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int rightDiagonalSum = 0;
        int leftDiagonalSum = 0;
        
        for(int i = 0 , j = 0; j < n; i++,j++) {
        	leftDiagonalSum = leftDiagonalSum + a[i][j];
        }
        
        for(int i = n-1 , j = 0; j < n; i--,j++) {
        	rightDiagonalSum = rightDiagonalSum + a[i][j];
        }
        
        int difference = Math.abs(leftDiagonalSum - rightDiagonalSum);
        
        System.out.println("Diagonal difference is : "+ difference );
        
    }
}
