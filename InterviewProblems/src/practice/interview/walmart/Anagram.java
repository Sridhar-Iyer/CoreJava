package practice.interview.walmart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Anagram {

	public static void main(String[] args) {
		List wordList = new ArrayList();
		wordList.add("bat");
		wordList.add("tab");
		wordList.add("act");
		wordList.add("cat");
		wordList.add("tac");
		wordList.add("ace");
		System.out.println(anagram(wordList));
	}
	
	public static List anagram(List<String> wordList) {
		List finalList = new ArrayList();
		Map<String,List> anagramMap = new HashMap();
		for(String word: wordList) {
			char[] chars = word.toCharArray();
			Arrays.sort(chars);
			String sortedWord = new String(chars);
			if(anagramMap.containsKey(sortedWord)) {
				List tempList = anagramMap.get(sortedWord);
				tempList.add(word);
				anagramMap.put(sortedWord, tempList);
				tempList = null;				
			}else {
				List<String> anagramList = new ArrayList();
				anagramList.add(word);
				anagramMap.put(sortedWord, anagramList);
			}
		}
		for(String s : anagramMap.keySet()) {
			finalList.add(anagramMap.get(s));
		}
		return finalList;
	}

}
