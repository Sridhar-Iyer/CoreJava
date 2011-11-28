package edu.training.exceptions;

public class IndexOutOfBounds {

    public static void main(String[] args) {
         
          String s = "abc";
         
          for (int i = 0 ; i < 4 ; i++) {
                try {
                      System.out.println(s.charAt(i));
                }catch(IndexOutOfBoundsException iobe){
                      System.err.println("Index Out Of Bounds Exception has occured");
                }
          }

    }

}

