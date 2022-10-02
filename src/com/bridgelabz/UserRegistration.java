/**
 * 
 */
package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Dell
 * As a User need to enter a valid last Name
 * 
 */
public class UserRegistration {
	
	//Validate first name
	public boolean validateFirstName(String firstName) {
		String newRegex =  "^[A-Z]{1}[a-z]{2,}$";
		Pattern patternObj = Pattern.compile(newRegex);
		 
		Matcher matcherObj = patternObj.matcher(firstName);
		return matcherObj.matches();
	}
	
	//Validate last name
	public boolean validateLastName(String lastName) {
		String newRegex =  "^[A-Z]{1}[a-z]{2,}$";
		Pattern patternObj = Pattern.compile(newRegex);
		 
		Matcher matcherObj = patternObj.matcher(lastName);
		return matcherObj.matches();
	}

}
