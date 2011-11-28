package edu.training.exceptions;

import java.lang.reflect.Method;

public class NoSuchMethod {

      public static void main(String[] args) {
           
            new NoSuchMethod();
      }
     
      public NoSuchMethod(){
     
            try {
                  // load the java.lang.String class, if not found throws ClassNotFoundException
                  Class c = Class.forName("java.lang.String");
           
                  try {
                  Class[] arguments = new Class[2];

                  // search for method called "someMethod" with two parameters
                  // since there is no method called "someMethod(arg1, arg2)", in the java.lang.String class, this throws an NoSuchMethodException
                  Method m = c.getDeclaredMethod("someMethod", arguments);

                }catch(NoSuchMethodException nsme) {
                      nsme.printStackTrace();
                }
          }catch(ClassNotFoundException cnfe) {
                  cnfe.printStackTrace();
            }
    }

}