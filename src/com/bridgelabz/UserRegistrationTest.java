/**
 * 
 */
package com.bridgelabz;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Dell
 * As a User need to follow pre-defined Password rules.
 * Rule2 - Should have at least 1 Upper Case - NOTE – All rules must be
 *
 */
class UserRegistrationTest {

	Scanner input = new Scanner(System.in);
	UserRegistration userRegistration = new UserRegistration();
	
	/**
	 * Test method for {@link com.bridgelabz.UserRegistration#validateFirstName(java.lang.String)}.
	 * validate first name 
	 */
	@Test
	void validate_given_first_name() {		
		
		System.out.println("Enter first name");
		String firstName=input.nextLine();
		
		if(userRegistration.validateFirstName(firstName)) {
			System.out.println("First name is valid");
		}else {
			System.out.println("First name is not valid");
		}
	}
	
	/**
	 * Test method for validateLastName
	 * validate last name 
	 */
	@Test
	void validate_given_last_name() {
		
		System.out.println("Enter last name");
		String lastName=input.nextLine();
		
		if(userRegistration.validateLastName(lastName)) {
			System.out.println("Last name is valid");
		}else {
			System.out.println("Last name is not valid");
		}
	}
	
	
	/**
	 * Test method for validateEmailAddress
	 * validate last name 
	 */
	@Test
	void validate_given_email_address() {
		
		System.out.println("Enter email address");
		String emailId=input.nextLine();
		
		if(userRegistration.validateEmailAddress(emailId)) {
			System.out.println("Email address is valid");
		}else {
			System.out.println("Email address is not valid");
		}
	}
	
	
	/**
	 * Test method for validateMobileNumber
	 * validate Mobile Number
	 */
	@Test
	void validate_given_mobile_number() {
		
		System.out.println("Enter Mobile number");
		String mobileNumber=input.nextLine();
		
		if(userRegistration.validateMobileNumber(mobileNumber)) {
			System.out.println("Mobile number is valid");
		}else {
			System.out.println("Mobile number is not valid");
		}
	}
	

	/**
	 * Test method for validatePassword
	 * validate Password - to check for 1 upper case letter
	 */
	@Test
	void validate_given_password() {
		
		System.out.println("Enter password");
		String password=input.nextLine();
		
		if(userRegistration.validatePassword(password)) {
			System.out.println("Password is valid");
		}else {
			System.out.println("Password is not valid");
		}
	}
}
