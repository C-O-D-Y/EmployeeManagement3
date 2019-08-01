package com.EmployeeManager.Methods;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import com.EmployeeManager.ShowOptions.EmployeeDetails;
/*
 * This class gives option to choose the user to fetch employee by given parameters.
 * By using switch case it manages the flow control of the program.
 */

public class FetchEmployeeOption {
	Scanner scanner = new Scanner(System.in);
	Iterator<EmployeeDetails> itr = EmployeeDetails.iterator;

	public FetchEmployeeOption() throws InputMismatchException {

		System.out.println("please select the option");
		System.out.println("\n Please choose one of the below options\"\r\n"
				+ "			+ \"/n 1: All Employee.\"\r\n" + "			+ \"/n 2: By Id.\"\r\n"
				+ "			+ \"/n 3: By name\"\r\n" + "			+ \"/n 4: By Department /n\");");
	}

	// Method options takes input from the user and check it via Switch case.
	public void options() throws IOException {
		FetchEmployeeMethods fem = new FetchEmployeeMethods();
		switch (scanner.nextInt()) {
		case 1:
			fem.fetch();
			break;
		case 2:
			System.out.println("Please enter the id of the Employee");
			int id = scanner.nextInt();
			fem.fetch(id);
			break;

		case 3:
			System.out.println("Please enter the Name of the Employee");
			scanner.nextLine();
			String name = scanner.nextLine();
			fem.fetch(name);
			break;

		case 4:

			System.out.println("Please enter the Department of the Employee");
			scanner.nextLine();
			String department = scanner.nextLine();
			fem.fetch(department);
			break;

		default:
			System.out.println("Sorry! Wrong Input");
		}
	}
}