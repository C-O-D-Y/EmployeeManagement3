package com.EmployeeManager.Methods;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.EmployeeManager.CustomException.NegativeAgeException;
/*
 *This Class Create a new Employee by using another Java Class(EmployeeDetails) 
 */

@SuppressWarnings("serial")
public class CreateEmployee {

	public void newEmployee() throws NegativeAgeException {

		// This method takes all data of the Employee and save it into Collection
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("\n Welcome \n");
			System.out.println("\n______ PERSONAL DETAILS______\n");
			System.out.println("Please enter your Name");
			String name = scanner.nextLine();
			System.out.println("Please enter your Age");
			int age = scanner.nextInt();
			if (age <= 0) {
				throw new NegativeAgeException("Age Cannot be Negative! Please enter correct value");
			}
			scanner.nextLine();
			System.out.println("Please enter Gender of the Employee");
			String gender = scanner.nextLine();
			System.out.println("Please enter Residence of the Employee");
			String address = scanner.nextLine();

			System.out.println("\n______ PROFESSIONAL DETAILS______\n");
			System.out.println("Please enter the id");
			int id = scanner.nextInt();
			System.out.println("Please enter the Salary");
			float salary = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Please enter your Department");
			String department = scanner.nextLine();
			System.out.println("Please enter the Skills Employee have ");
			String skills = scanner.nextLine();

			/*
			 * Adding object of EmployeeDetails Class in the ArrayList This EmployeeDetails
			 * class contains object like id,age,name etc.
			 */
			try {
				String s = name + " " + age + " " + gender + " " + address + " " + id + " " + salary + " " + department
						+ " " + skills + "\n";
				File file = new File("C:\\Users\\saurabh.chauhan\\eclipse-workspace\\EmployeeDetails.txt");
				FileWriter fw = new FileWriter(file, true);
				fw.write(s);
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
			}
			System.out.println("Employee Added");
		} catch (InputMismatchException e) {
			System.out.println("Try Again wrong input");
			System.out.println("Please Enter Integer value");
			newEmployee();
		}

	}
}
