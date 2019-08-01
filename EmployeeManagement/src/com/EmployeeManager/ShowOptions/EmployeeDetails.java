package com.EmployeeManager.ShowOptions;

import java.util.Iterator;
/*
 * This Class has all the data which has to be entered for an Employee
 * It has a constructor which is being called when CreateEmployee Class Object is called.
 */
public class EmployeeDetails {
	public static Iterator<EmployeeDetails> iterator;
	public String name;
	public int id;
	public double salary;
	public String department;
	public int age;
	public String address;
	public String gender;
	public String skills;

	//Constructor converts the local variable value in the instance variable value.
	
	public EmployeeDetails(String name, int id, double salary, String department, int age, String address,
			String gender, String skills) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.department = department;
		this.age = age;
		this.address = address;
		this.gender = gender;
		this.skills = skills;
	}
}