package com.Inheritance.HandsOn;

public class Designer extends Employee {

	public Designer(String firstName, String lastName, String companyTitle, int yearsAtCompany, int SSN) {
		super(firstName, lastName, companyTitle, yearsAtCompany, SSN);
		// TODO Auto-generated constructor stub
	}
	String jobTitle = "Employee";	

	public String getjobTitle() {
	return jobTitle;
}
	public void setjobTitle() {}
	
	@Override
	public String toString() {
		return firstName + " " + lastName + " has worked at " + companyTitle + " for " + yearsAtCompany + " year(s) as a(n) " + jobTitle;
	}
	
}