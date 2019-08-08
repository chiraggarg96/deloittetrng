package com.deloitte.cms.model;

import java.util.Set;

public class EmployeeDetails {

	public int employeeiD;
	private String employeeName;
	private int employeeSalary;
	private Set employeeAddress;
	public EmployeeDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeDetails(int employeeiD, String employeeName, int employeeSalary) {
		super();
		this.employeeiD = employeeiD;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	public int getEmployeeiD() {
		return employeeiD;
	}
	public void setEmployeeiD(int employeeiD) {
		this.employeeiD = employeeiD;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public Set getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(Set employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public EmployeeDetails(int employeeiD, String employeeName, int employeeSalary, Set employeeAddress) {
		super();
		this.employeeiD = employeeiD;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeAddress = employeeAddress;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [employeeiD=" + employeeiD + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", employeeAddress=" + employeeAddress + "]";
	}
	

}
