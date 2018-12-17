import java.util.HashMap;
import java.util.Map;

public class CountCharacterInString {

    public static void main(String[] args) {

        String givenString = "aabcbaccce";
        System.out.println(countCharacterInString(givenString));

    }

    private static Map<Character, Integer> countCharacterInString(String givenString) {

        Map<Character,Integer> countMap = new HashMap<>();

        Character c = null;
       for(int i = 0 ; i < givenString.length(); i++) {
           Integer count = 0;
           c = givenString.charAt(i);
           if (countMap.containsKey(c)) {
               count = countMap.get(c);
               countMap.put(c,++count);
           } else {
               countMap.put(c,++count);
           }
       }
       return countMap;
    }
}
