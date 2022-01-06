package com.te.streamapi;

public class Employee {
	int EmployeeId;
	String EmployeeName;
	double EmployeeSalary;
	String EmployeeDesignation;
	int age;

	public Employee(int employeeId, String employeeName, double employeeSalary, String employeeDesignation, int age) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		EmployeeSalary = employeeSalary;
		EmployeeDesignation = employeeDesignation;
		this.age = age;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return EmployeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		EmployeeSalary = employeeSalary;
	}

	public String getEmployeeDesignation() {
		return EmployeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		EmployeeDesignation = employeeDesignation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", EmployeeSalary="
				+ EmployeeSalary + ", EmployeeDesignation=" + EmployeeDesignation + ", age=" + age + "]";
	}

}
