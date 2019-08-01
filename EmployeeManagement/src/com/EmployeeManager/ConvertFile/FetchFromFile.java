package com.EmployeeManager.ConvertFile;

import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * In this class we load file to get our data from the file
 *  and, manipulate the data
 *  */

public class FetchFromFile {

	public Scanner loadFile() throws IOException {
		File file = new File("C:\\Users\\saurabh.chauhan\\eclipse-workspace\\EmployeeDetails.txt");
		FileReader filereader = new FileReader(file);
		Scanner sc = new Scanner(filereader);
		return sc;
	}
}
