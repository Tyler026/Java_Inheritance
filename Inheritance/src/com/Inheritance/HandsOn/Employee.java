package com.Inheritance.HandsOn;

public class Employee { // --- Superclass ---
	String firstName;
	String lastName;
	String companyTitle;
	int yearsAtCompany;
	private int SSN;
	// --- Constructor ---
	public Employee (String firstName, String lastName, String companyTitle, int yearsAtCompany, int SSN) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyTitle = companyTitle;
		this.yearsAtCompany = yearsAtCompany;
		this.SSN = SSN;
	}
	
	// --- getMethod() --- 
	public String getfirstName() { return firstName; }
	// --- setMethod() ---
	public void setfirstName() {}
	
	// --- getMethod() ---
	public String getlastName() { return lastName; }
	// --- setMethod() ---
	public void setlastName() {}
	
	// --- getMethod() ---
	public String getcompanyTitle() { return companyTitle; }
	// --- setMethod() ---
	public void setcompanyTitle() {}
	
	// --- getMethod() ---
	public int getyearsAtCompany() { return yearsAtCompany; }
	// --- setMethod() ---
	public void setyearsAtCompany() {}
	
	// --- getMethod() ---
	int getSSN() {
		if(SSN < 0) {}
		return SSN;
	}
	// --- setMethod() ---
	void setSSN() {}
	
	
	public String toString() {
		return firstName + " " + lastName + " has worked at " + companyTitle + " for " + yearsAtCompany + " year(s).";
		
		}
}	



