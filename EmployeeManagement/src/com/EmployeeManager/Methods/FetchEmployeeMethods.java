package com.EmployeeManager.Methods;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.EmployeeManager.ConvertFile.FetchFromFile;

/*
 * This Class contains method for fetching an employee which get the data of the employee from Collection.
 */

public class FetchEmployeeMethods extends FetchFromFile {
	int flag = 0;
	Scanner sc;

	public FetchEmployeeMethods() throws IOException {
//In this constructor i'm loading the file into our java context code from FetchFromFile class
		try {
			sc = new FetchFromFile().loadFile();
		} catch (FileNotFoundException e) {

			System.out.println("File Path Not Found! Please give correct path.");
		}
	}

	/*
	 * Methods below takes Parameters from the user_input and being called to
	 * according method and, when condition is satisfied it will just take that line
	 * from the file and print it to the user
	 */
	public void fetch() {
		while (sc.hasNextLine()) {
			String[] str = sc.nextLine().split(" ");

			for (String y : str) {
				flag = 1;
				System.out.println(y);
			}
			System.out.println("==*==*==*==*==*==*==*==*==*==*==");
		}

		if (flag == 0) {
			System.out.println("No Records Found");
		}
	}

	public void fetch(String name) {
		while (sc.hasNextLine()) {
			String[] str = sc.nextLine().split(" ");

			if (str[0].equalsIgnoreCase(name)) {
				flag = 1;
				for (String y : str) {
					System.out.println(y);
				}
				System.out.println("==*==*==*==*==*==*==*==*==*==*==");
			}
		}
		if (flag == 0) {
			System.out.println("No Records Found");
		}
	}

	public void fetch(int id) {
		while (sc.hasNextLine()) {
			String[] str = sc.nextLine().split(" ");

			if (str[4].equals(Integer.toString(id))) {
				for (String y : str) {
					flag = 1;
					System.out.println(y);
				}
				System.out.println("==*==*==*==*==*==*==*==*==*==*==");
			}
		}

		if (flag == 0) {
			System.out.println("No Records Found");
		}
	}
}
