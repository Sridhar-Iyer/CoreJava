package practice; 
 
import java.util.HashMap;
import java.util.Map;

public class FindAnagram {

       public static void main(String[] args) {
             
              String string1 = "A McDonald's Burger";
              String string2 = "Real dog and crumbs!";
             
              Map<Character,Integer> map1 = new HashMap<Character,Integer>();
              Map<Character,Integer> map2 = new HashMap<Character,Integer>();
             
              string1 = string1.replaceAll("\\W", "");
              string2 = string2.replaceAll("\\W", "");
             
              if(string1.length() == string2.length()) {
                     for(int i = 0; i < string1.length(); i++) {
                           Integer value = 1;
                           Character c = Character.toLowerCase(string1.charAt(i));
                           if(map1.containsKey(c)) {
                                  value = map1.get(c);
                                  value++;
                                  map1.put(c, value);
                           }else {
                                  map1.put(c, value);
                           }
                     }
                    
                     for(int i = 0; i < string2.length(); i++) {
                           Integer value = 1;
                           Character c = Character.toLowerCase(string2.charAt(i));
                           if(map2.containsKey(c)) {
                                  value = map2.get(c);
                                  value++;
                                  map2.put(c, value);
                           }else {
                                  map2.put(c, value);
                           }
                     }
                    
                     if(map1.equals(map2)) {
                           System.out.println("They are anagrams");
                     }else
                           System.out.println("They are not anagrams");
                    
              }else {
                     System.out.println("They are not anagrams");
              }
       }
}
