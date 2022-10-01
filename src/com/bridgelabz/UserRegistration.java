/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 * As a User need to follow pre-defined Password rules.
 * Rule4 – Has exactly 1 Special Character
 */
public class UserRegistration {
	
	//Validate first name
	public boolean validateFirstName(String firstName) {
		String nameRegex =  "^[A-Z]{1}[a-z]{2,}$";
		 return firstName.matches(nameRegex);
	}
	
	//Validate last name
	public boolean validateLastName(String lastName) {
		String nameRegex =  "^[A-Z]{1}[a-z]{2,}$";
		 return lastName.matches(nameRegex);
	}
	
	//Validate email address
	public boolean validateEmailAddress(String emailId) {
		String nameRegex = "^[a-z]{1,}(.[a-z]{1,})?@bl.co(.in)?$";
		return emailId.matches(nameRegex);
	}
	
	//Validate mobile number
	public boolean validateMobileNumber(String mobileNumber) {
		String nameRegex = "[0-9]{2} [0-9]{10}$";
		return mobileNumber.matches(nameRegex);
	}

	//Validate password to have exact 1 special character
	public boolean validatePassword(String password) {
		String nameRegex = "[A-Z]{1,}[a-zA-Z0-9]{5,}[!@#$&*]{1}[0-9]{1,}$";
		return password.matches(nameRegex);
	}
}
