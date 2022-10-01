/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 * As a User need to enter a valid First Name
 */
public class UserRegistration {
	
	//Validate first name
	public boolean validateFirstName(String firstName) {
		String nameRegex =  "^[A-Z]{1}[a-z]{2,}$";
		 return firstName.matches(nameRegex);
	}

}
