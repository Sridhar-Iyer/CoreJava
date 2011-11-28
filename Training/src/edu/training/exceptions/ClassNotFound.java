package edu.training.exceptions;

public class ClassNotFound {

      public static void main(String[] args) {
           
            new ClassNotFound();
      }
     
      public ClassNotFound(){
     
            try {
                  // load the java.lang.Strung class,
                  // this would thrown an ClassNotFoundException  because there is no class called “Strung” defined in the java.lang package  
                  Class c = Class.forName("java.lang.Strung");
            }catch(ClassNotFoundException cnfe) {
                  cnfe.printStackTrace();
            }
    }

}
