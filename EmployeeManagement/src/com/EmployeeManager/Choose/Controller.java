package com.EmployeeManager.Choose;

import com.EmployeeManager.Methods.CreateEmployee;
import com.EmployeeManager.Methods.DeleteEmployeeOptions;
import com.EmployeeManager.Methods.FetchEmployeeOption;

/*
 * This Class controls the flow of program according to the User input from the User_Options
 * via Switch Case it direct the flow to various method in the com.EmployeeManager.Methods packages methods
 */
public class Controller {

	// Calling different methods by using switch-case.

	public Controller(int choose) throws Exception {

		switch (choose) {
		case 1:
			CreateEmployee ce = new CreateEmployee();
			ce.newEmployee();
			break;
		case 2:
			new FetchEmployeeOption().options();
			break;
		case 3:
			new DeleteEmployeeOptions();
			break;
		case 4:
			System.out.println("Adios Amigo");
			System.exit(0);
			break;
		default:
			System.out.println("Wrong Option, Please select Correct Option");
		}

	}
}
