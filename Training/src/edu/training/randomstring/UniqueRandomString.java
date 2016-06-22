package edu.training.randomstring;

import java.util.UUID;

import org.apache.commons.lang3.RandomStringUtils;

public class UniqueRandomString {

	public static void main(String[] args) {
		
		
		// this loop creates 10 random, uuid, random strings and random number
		for ( int i = 0 ; i < 10 ; i++) {
			
			String chars = UUID.randomUUID().toString();
			
			System.out.println(chars);
			System.out.println("----------------");
			
			chars = chars.replace("-", "");
			
			System.out.println(chars);
			System.out.println("----------------");
			String randomString = null;
			
			// creates a random string of 10 character length
			randomString =	RandomStringUtils.random(10, chars);
		
			System.out.println(randomString);
			System.out.println("----------------");
			
			// creates a 12 digit random number
			String randomNumber = RandomStringUtils.randomNumeric(12);
			System.out.println(randomNumber);
			System.out.println("----------------");
		
		}

	}

}
