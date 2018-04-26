package com.hcl.example;

public class Employee {

	public int id;
	public String name;

	public Employee(String name) {
		this.name = name;
		this.id = generateUniqueId();
	}

	private static int uniqueId = 0;

	public int generateUniqueId() {
		return ++uniqueId;
	}

	public void displayEmployeeInformation() {
		System.out.println("Employee ID : " + id + ", Employee name : " + name);
	}
}