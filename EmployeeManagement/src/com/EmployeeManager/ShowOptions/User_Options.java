package com.EmployeeManager.ShowOptions;

import java.util.Scanner;
import com.EmployeeManager.Choose.Controller;
/*
 * This Class gives User to choose Option for Employee Management Services
 */
public class User_Options {
	public User_Options() {
		Scanner scanner = new Scanner(System.in);
		try
		{
		do {
			System.out.println("\n Please choose one of the below options" + "\n1: New Employee."
					+ "\n2: Fetch Employee." + "\n3: Delete current Employee." + "\n4: Exit ");
			int option = scanner.nextInt();
			//calling Controller class from package com.EmployeeManager.Choose
			new Controller(option);
		} 
		while (1 > 0);
		}
		catch (Exception e) {
			System.out.println("Wrong input\n Please select from the given options only");
			new User_Options();
		}
	}
}