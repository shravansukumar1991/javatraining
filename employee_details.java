package demo;

public class employee_details {
	String empName;
	String empGender;
	String empDob;
	String empBgrp;
	 
	employee_details () {
		empName = "";
		empGender = "";
		empDob = "";
		empBgrp = "";
	}
	
	public void setEmployeeDetails (String empName, String empGender, String empDob, String empBgrp) {
	    this.empName = empName;
	    this.empGender = empGender;
	    this.empDob = empDob;
	    this.empBgrp = empBgrp;
	}
	
	public void printEmployeeDetails() {
		System.out.println (this.empName+","+ this.empGender+","+ this.empDob + "," + this.empBgrp);
	}
	}
	
