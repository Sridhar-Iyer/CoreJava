import java.util.HashMap;
import java.util.Map;

public class MapCodePractice {

    public static void main(String[] args) {

        String givenString = "aabcbaccce";
        System.out.println(countCharacterInString(givenString));
        String[] arrayString = {"a", "b", "a", "c", "b"};
        System.out.println(isRepeated(arrayString));

    }

    private static Map<String,Boolean> isRepeated(String[] arrayString) {
        Map<String,Boolean> containsMap = new HashMap<>();
        for (String s : arrayString) {
            Boolean flag = false;
            if(containsMap.containsKey(s)) {
                flag = true;
                containsMap.put(s,flag);
            }else {
                containsMap.put(s,flag);
            }
        }
        return containsMap;
    }

    private static Map<Character, Integer> countCharacterInString(String givenString) {
        Map<Character, Integer> countMap = new HashMap<>();
        Character c = null;
        for (int i = 0; i < givenString.length(); i++) {
            Integer count = 0;
            c = givenString.charAt(i);
            if (countMap.containsKey(c)) {
                count = countMap.get(c);
                countMap.put(c, ++count);
            } else {
                countMap.put(c, ++count);
            }
        }
        return countMap;
    }
}
