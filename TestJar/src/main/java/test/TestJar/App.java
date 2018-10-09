package test.TestJar;

import org.apache.commons.lang3.StringUtils;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String string = "baeldung.com";
        boolean contained1 = StringUtils.containsAny(string, 'a', 'b', 'c');
        boolean contained2 = StringUtils.containsAny(string, 'x', 'y', 'z');
        boolean contained3 = StringUtils.containsAny(string, "abc");
        boolean contained4 = StringUtils.containsAny(string, "xyz");
          
       System.out.println(contained1);
       System.out.println(contained2);
       System.out.println(contained3);
       System.out.println(contained4);
    }
}
