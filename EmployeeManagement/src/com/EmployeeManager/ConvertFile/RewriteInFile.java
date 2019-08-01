package com.EmployeeManager.ConvertFile;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;
import java.util.Scanner;

/*
 * In this Class i'm loading the filePath into FileWriter class so that we can use this file to write and save the data
 */
public class RewriteInFile {

	public FileWriter rewriteFile() throws IOException {
		File file = new File("C:\\Users\\saurabh.chauhan\\eclipse-workspace\\EmployeeDetails1.txt");
		FileWriter filewriter = new FileWriter(file);
		return filewriter;
	}

	/*
	 * In this method, i'm rewriting the file of the new data
	 */
	public void rename() throws IOException, ArrayIndexOutOfBoundsException {
		FileReader filereader = new FileReader("C:\\Users\\saurabh.chauhan\\eclipse-workspace\\EmployeeDetails1.txt");
		FileWriter filewriter = new FileWriter("C:\\Users\\saurabh.chauhan\\eclipse-workspace\\EmployeeDetails.txt");
		Scanner sc1 = new Scanner(filereader);
		while (sc1.hasNextLine()) {
			String[] str1 = sc1.nextLine().split(" ");
			for (String x : str1) {
				filewriter.write(x + " ");
			}
			filewriter.write("\n");
		}
		sc1.close();
		filereader.close();
		filewriter.close();
	}
}
