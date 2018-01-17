package com.Inheritance.HandsOn;

public class MobileDesigner extends Designer {

	public MobileDesigner(String firstName, String lastName, String companyTitle, int yearsAtCompany, int SSN) {
		super(firstName, lastName, companyTitle, yearsAtCompany, SSN);
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return firstName + " " + lastName + " " + companyTitle + " " + yearsAtCompany;
	}

}
