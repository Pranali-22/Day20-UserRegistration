/**
 * 
 */
package com.bridgelabz;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Dell
 * As a User need to enter a valid First Name
 *
 */
class UserRegistrationTest {

	/**
	 * Test method for {@link com.bridgelabz.UserRegistration#validateFirstName(java.lang.String)}.
	 * validate first name 
	 */
	@Test
	void validate_given_first_name() {
		
		Scanner input = new Scanner(System.in);
		UserRegistration userRegistration = new UserRegistration();
		
		System.out.println("Enter first name");
		String firstName=input.nextLine();
		
		if(userRegistration.validateFirstName(firstName)) {
			System.out.println("First name is valid");
		}else {
			System.out.println("First name is not valid");
		}
	}

}
