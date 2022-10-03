/**
 * 
 */
package com.bridgelabz;
import java.util.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * @author Dell
 * As a User need to follow pre-defined Mobile Format - E.g. 91 9919819801 - Country code follow by space
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
	

}
