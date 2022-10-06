/**
 * 
 */
package com.bridgelabz;
import java.util.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * @author Dell
 * UC9 - Clear all email samples provided separately
 *
 */
class UserRegistrationTest {

	Scanner input = new Scanner(System.in);
		
	UserRegistration userRegistration = new UserRegistration();
	Boolean isValidFirstName = true, isValidLastName = true, isValidEmailId = true, isValidMobileNumber = true, isValidPassword = true;
	
	/*
	 * Test method for {@link com.bridgelabz.UserRegistration#validateFirstName(java.lang.String)}.
	 * validate first name 
	 */
	
	@Test
	void validate_given_first_name() {		
		
		System.out.println("Enter first name");
		String firstName=input.nextLine();		
		Assert.assertTrue(userRegistration.validateFirstName(firstName));
		isValidFirstName = userRegistration.validateFirstName(firstName);
	}
	
	/**
	 * Test method for validateLastName
	 * validate last name 
	 */
	
	@Test
	void validate_given_last_name() {
		
		System.out.println("Enter last name");
		String lastName=input.nextLine();		
		Assert.assertTrue(userRegistration.validateLastName(lastName));
		isValidLastName = userRegistration.validateLastName(lastName);
	}
	
	
	/**
	 * Test method for validateEmailAddress
	 * validate email address 
	 */	
	
	@Test
	void validate_given_email_address() {
		System.out.println("Enter email Id");
		String emailId=input.nextLine();			
		Assert.assertTrue(userRegistration.validateEmailAddress(emailId));
		isValidEmailId = userRegistration.validateEmailAddress(emailId);
	}
	
	
	/**
	 * Test method for validateMobileNumber
	 * validate Mobile Number
	 */
	
	@Test
	void validate_given_mobile_number() {
		
		System.out.println("Enter Mobile number");
		String mobileNumber=input.nextLine();		
		Assert.assertTrue(userRegistration.validateMobileNumber(mobileNumber));
		isValidMobileNumber = userRegistration.validateMobileNumber(mobileNumber);
	}
	
	/**
	 * Test method for validatePassword
	 * validate Password - to have exact 1 special character
	 */
	@Test	
	void validate_given_password() {
		
		System.out.println("Enter password");
		String password=input.nextLine();		
		Assert.assertTrue(userRegistration.validatePassword(password));
		isValidPassword = userRegistration.validatePassword(password);
	}
	
	/**
	 * Test method for validatePassword
	 * Validate a valid user entry
	 */
	@Test	
	void validate_user_entry() {
		Assert.assertEquals("Happy",userRegistration.VaidateUserEntry(isValidFirstName && isValidLastName && isValidEmailId && isValidMobileNumber && isValidPassword));
			
	}
}
