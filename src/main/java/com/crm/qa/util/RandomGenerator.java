package com.crm.qa.util;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class RandomGenerator {
	
	
	public static String createUser() {
		String s="hsbc"+RandomStringUtils.random(3,'a','b','c');
		return s;
		
		}
	
	public static void main(String[] args) {
		System.out.println(RandomGenerator.createUser());		
	}

}
