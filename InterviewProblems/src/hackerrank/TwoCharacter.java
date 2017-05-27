package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

public class TwoCharacter {

	public static void main(String[] args) {
		String givenString = "beabeefeaab";
		TwoCharacter twoCharacter = new TwoCharacter();
		System.out.println(twoCharacter.getMaxLength(givenString));
		twoCharacter.generateValidString(givenString);
	}
	
	public String generateValidString(String string) {
		Set<Character> charSet = new HashSet();
		Stack<Character> stack = new Stack();
		int top = 0;
		for(int i = 0 ; i < string.length(); i++) {
			if(stack.size() == 0) {
				stack.push(string.charAt(i));
				stack.push(string.charAt(++i));
			} else {
				stack.push(string.charAt(i));
			}
			
			top = stack.size();
			if(stack.elementAt(--top) == stack.elementAt(--top)) {
				charSet.add(stack.elementAt(top));
			}
		}
		System.out.println(charSet);
		
		Iterator iter = charSet.iterator();
		while(iter.hasNext()) {
			string = string.replaceAll(Character.toString((char)iter.next()), "");
		}
		System.out.println(string);
		return string;
	}
	
	public Integer getMaxLength(String string) {
		mapTwoCharacters(convertToMap(string));
		 return 0;
	}
	
	public Map convertToMap(String string) {
		 Map<Character,Integer> numberOfcharacters = new HashMap();
		 for(int i = 0; i < string.length(); i++) {
			 if(numberOfcharacters.containsKey(string.charAt(i))) {
				 numberOfcharacters.put(string.charAt(i), numberOfcharacters.get(string.charAt(i))+1);
			 } else {
				 numberOfcharacters.put(string.charAt(i), 1);
			 }
		 }
		 System.out.println(numberOfcharacters);
		 return numberOfcharacters;
	}
	
	public Map mapTwoCharacters(Map characterMap) {
		Map<String, Integer> twoCharacterMap = new TreeMap();
		//System.out.println(characterMap.keySet());
		List list = new ArrayList(characterMap.keySet());
		System.out.println(list);
		for(int i = 0 ; i < list.size(); i++) {
			for(int j = i+1; j < list.size(); j++) {
				System.out.println(Character.toString((char)list.get(i))+Character.toString((char)list.get(j)));
				String twoChar = Character.toString((char)list.get(i))+Character.toString((char)list.get(j));
				twoCharacterMap.put(twoChar, (Integer)characterMap.get((char)list.get(i)) + (Integer)characterMap.get((char)list.get(j)));
				System.out.println(twoCharacterMap);
			}
		}
		return twoCharacterMap;
	}
	
	public String createString(Map twoCharacterMap, String string) {
		return "";
	}
	
	
}
