/**
 * 
 */
package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Dell
 * As a User need to follow pre-defined Password rules.
 * Rule3 – Should have at least 1 number in the password 
 */
public class UserRegistration {
	
	//Validate first name
	public boolean validateFirstName(String firstName) {
		String newRegex =  "[A-Z]{1}[a-z]{2,}$";
		Pattern patternObj = Pattern.compile(newRegex);			 
		Matcher matcherObj = patternObj.matcher(firstName);
		return matcherObj.matches();
	}
			
	//Validate last name
	public boolean validateLastName(String lastName) {
		String newRegex =  "[A-Z]{1}[a-z]{2,}$";
		Pattern patternObj = Pattern.compile(newRegex);			 
		Matcher matcherObj = patternObj.matcher(lastName);
		return matcherObj.matches();
	}
			
	//Validate email address
	public boolean validateEmailAddress(String emailId) {
		String newRegex = "[a-z]{1,}(.[a-z]{1,})?@bl.co(.in)?$";
		Pattern patternObj = Pattern.compile(newRegex);			 
		Matcher matcherObj = patternObj.matcher(emailId);
		return matcherObj.matches();	 
	}

	//Validate mobile number
	public boolean validateMobileNumber(String mobileNumber) {
		String newRegex = "[0-9]{2} [0-9]{10}$";
		Pattern patternObj = Pattern.compile(newRegex);			 
		Matcher matcherObj = patternObj.matcher(mobileNumber);
		return matcherObj.matches();	 
	}
			
	//Validate password to have at least 1 numeric number
	public boolean validatePassword(String password) {
		String newRegex = "[A-Z]{1,}[a-zA-Z0-9!@#$&*]{6,}[0-9]{1,}$";
		Pattern patternObj = Pattern.compile(newRegex);		 
		Matcher matcherObj = patternObj.matcher(password);
		return matcherObj.matches();
	}
}
