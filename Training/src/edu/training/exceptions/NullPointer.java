package edu.training.exceptions;

public class NullPointer {

      public static void main(String[] args) {
           
            new NullPointer();
      }
     
      public NullPointer(){
     
            Object[] object = {12,25,68,45};
           
            try {
                    for (Object o : object ) {
                          System.out.println(o);
                    }
                    // explicitly dereferencing object array
                    object = null;
                   
                    for (Object o : object ) {
                          System.out.println(o);
                    }
                   
            }catch(NullPointerException nfe) {
                  nfe.printStackTrace();
            }
    }

}