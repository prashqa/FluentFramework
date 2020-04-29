package com.project.utils;

import com.github.javafaker.Faker;

public class Utilities {	
	
	public static String generateFirstName() {
		Faker faker = new Faker();
		String firstName = faker.name().firstName();		
		return firstName;
	}
	
	public static String generateLastName() {
		Faker faker = new Faker();
		String lastName = faker.name().lastName(); 
		return lastName;
	}
	
	public static String generateEmail() {		
		return generateFirstName()+generateLastName()+"@swooptest.com";
	}

}
