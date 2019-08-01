package com.EmployeeManager.CustomException;

import com.EmployeeManager.Methods.*;

/*
 * This Class Contains User_Defined Exception in which age cannot be negative
 */
@SuppressWarnings("serial")
public class NegativeAgeException extends Exception {
	/*
	 * Constructor calling is done when condition arises as mentioned and, Message
	 * will be printed.
	 */
	public NegativeAgeException(String message) {
		System.out.println(message);
		/*
		 * Surrounded by try catch block to give Specific solution
		 */
		try {
			new CreateEmployee().newEmployee();
		} catch (NegativeAgeException e) {
			// TODO Auto-generated catch block
			System.out.println("Negative Age Entered! please try again");
		}
	}

}
