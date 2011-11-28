package edu.training.exceptions;

public class NegativeArraySize {

      public static void main(String[] args) {
           
            int array[] = {1,2,3,4,5};
           
            try {
                  array = new int[-8];
            }catch(NegativeArraySizeException nase) {
                  System.err.println("Negative Array Size Exception has occured, check array initialization again. ");
            }
           
            for (int i: array) {
                  System.out.println(i);
            }
      }

}
