package edu.training.randomstring;

import java.util.UUID;

import org.apache.commons.lang3.RandomStringUtils;

public class UniqueRandomString {

	public static void main(String[] args) {
		
		
		
		for ( int i = 0 ; i < 10 ; i++) {
			
			String chars = UUID.randomUUID().toString();
			
			System.out.println(chars);
			System.out.println("----------------");
			
			chars = chars.replace("-", "");
			
			System.out.println(chars);
			System.out.println("----------------");
			String randomString = null;
			
			randomString =	RandomStringUtils.random(10, chars);
		
			System.out.println(randomString);
			System.out.println("----------------");
		
		}

	}

}
