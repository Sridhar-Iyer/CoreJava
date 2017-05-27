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

import com.google.common.base.Functions;
import com.google.common.collect.Ordering;

public class TwoCharacter {

	public static void main(String[] args) {
		String givenString = "abababababababaa";
		TwoCharacter twoCharacter = new TwoCharacter();
		givenString = twoCharacter.generateValidString(givenString);
		
		System.out.println(twoCharacter.getMaxLength(givenString));
		
	}
	
	// IF the given string has consecutive characters those characters can be dropped before proceeding further 
	public String generateValidString(String string) {
		@SuppressWarnings("unchecked")
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
		String str = createString(mapTwoCharacters(convertToMap(string)),string);
		 return str.length();
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
		Map<String, Integer> twoCharacterMap = new HashMap<String, Integer>();
		//System.out.println(characterMap.keySet());
		List<Character> list = new ArrayList<Character>(characterMap.keySet());
		System.out.println(list);
		for(int i = 0 ; i < list.size(); i++) {
			for(int j = i+1; j < list.size(); j++) {
				System.out.println(Character.toString((char)list.get(i))+Character.toString((char)list.get(j)));
				String twoChar = Character.toString((char)list.get(i))+Character.toString((char)list.get(j));
				twoCharacterMap.put(twoChar, (Integer)characterMap.get((char)list.get(i)) + (Integer)characterMap.get((char)list.get(j)));
				//System.out.println(twoCharacterMap);
			}
		}
		// sort the map with values descending
		Ordering.natural().reverse().nullsLast().onResultOf(Functions.forMap(twoCharacterMap, null));
		System.out.println(twoCharacterMap);
		return twoCharacterMap;
	}
	
	public String createString(Map twoCharacterMap, String string) {
		System.out.println(twoCharacterMap);
		System.out.println(string);
		boolean flag = false;
		String newString = "";
		List<String> list = new ArrayList<String>(twoCharacterMap.keySet());
		System.out.println(list);
		for(int i = 0 ; i < list.size(); i++) {
			newString = "";
			Character char1 = list.get(i).charAt(0);
			Character char2 = list.get(i).charAt(1);
			System.out.println(char1);
			System.out.println(char2);		
			for(int j = 0; j <string.length(); j++) {
				if(string.charAt(j) == char1 || string.charAt(j) == char2) {
					newString = newString + string.charAt(j);
					System.out.println(newString);
				}
			}
			flag = isValidString(newString);
			System.out.println(flag);
			if(flag) { System.out.println(newString); break; }
		}
		System.out.println(newString);
		return newString;
	}
	
	
	public boolean isValidString(String string) {
		@SuppressWarnings("unchecked")
		boolean flag = true;
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
				flag = false;
				break;
			}
		}
		return flag;
	}
}
