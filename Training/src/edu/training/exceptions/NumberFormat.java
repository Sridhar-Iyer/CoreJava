package edu.training.exceptions;

public class NumberFormat {

      public static void main(String[] args) {
           
            String string = "hello";
           
            try {
                  // this parsing doesn't work as hello is not a number
                  Integer integer = Integer.parseInt(string);
                  System.out.println(integer++);
            }catch(NumberFormatException nfe) {
                  System.err.println("Number Format Exception caught, check what you are parsing");
                  nfe.printStackTrace();
            }
    }
}
