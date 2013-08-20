package edu.training.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<String, String> hashmap = new HashMap <String, String>();
		
		hashmap.put("Fruit", "Apple");
		hashmap.put("Vegetable", "Cabbage");
		
		System.out.println(hashmap.get("Fruit"));
		
    }

}
