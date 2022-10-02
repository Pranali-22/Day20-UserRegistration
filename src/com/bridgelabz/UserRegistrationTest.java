/**
 * 
 */
package com.bridgelabz;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * @author Dell
 * As a User need to enter a valid last Name
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
		
		Assert.assertTrue(firstName,userRegistration.validateFirstName(firstName));
		
	}
	
	/**
	 * Test method for validateLastName
	 * validate last name 
	 */
	
	@Test
	void validate_given_last_name() {
		
		System.out.println("Enter last name");
		String lastName=input.nextLine();
		
		Assert.assertTrue(lastName,userRegistration.validateFirstName(lastName));
	}

}
