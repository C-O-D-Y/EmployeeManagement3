package com.EmployeeManager.Methods;

import java.util.Scanner;

/*
 * This Class controls the delete methods parameters given by user and pass it to method accordingly.
 */
public class DeleteEmployeeOptions extends FetchEmployeeOption {
	Scanner scanner = new Scanner(System.in);
	DeleteEmployeeMethods dem = new DeleteEmployeeMethods();

	/*
	 * This constructor calls super constructor to call the options to the user for
	 * deleting an Employee. After calling constructor calling deleteOptions methods
	 * and controlling flow accordingly
	 */
	public DeleteEmployeeOptions() throws Exception {
		// Chaining constructor concept is used to show options to the user
		super();
		deleteOptions();

	}

	public void deleteOptions() throws Exception {
		try {
			switch (scanner.nextInt()) {
			case 1:
				dem.delete();
				break;
			case 2:
				System.out.println("Please enter the id of the Employee");
				int id = scanner.nextInt();
				dem.delete(id);
				break;

			case 3:
				System.out.println("Please enter the Name of the Employee");
				scanner.nextLine();
				String name = scanner.nextLine();
				dem.delete(name);
				break;

			case 4:

				System.out.println("Please enter the Department of the Employee");
				scanner.nextLine();
				String department = scanner.nextLine();
				dem.delete(department);
				break;

			default:
				System.out.println("Sorry! Wrong Input");
			}
		} catch (Exception e) {
			System.out.println("Sorry! Please enter the correct input");
			new DeleteEmployeeOptions();
		}

	}
}
