/**
 * 
 */
package com.bridgelabz;
import java.util.*;
import org.junit.Assert;
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
		Assert.assertTrue(userRegistration.validateFirstName(firstName));
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
	}
	
	
	/**
	 * Test method for validateEmailAddress
	 * validate last name 
	 */
	@Test
	void validate_given_email_address() {
		
		System.out.println("Enter email address");
		String emailId=input.nextLine();		
		Assert.assertTrue(userRegistration.validateEmailAddress(emailId));
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
	}
	
	/**
	 * Test method for validatePassword
	 * validate Password - to have 1 letter in uppercase
	 */
	@Test
	void validate_given_password() {
		
		System.out.println("Enter password");
		String password=input.nextLine();		
		Assert.assertTrue(userRegistration.validatePassword(password));
	}

}
