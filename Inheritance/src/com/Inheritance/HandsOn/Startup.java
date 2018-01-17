package com.Inheritance.HandsOn;

public class Startup {

	public static void main(String[] args) {
		Employee e = new Employee("tyler", "fuqua", null, 0, 0);
		System.out.println(e.toString());
		
		Manager m = new Manager(null, null, null, 0, 0);
		System.out.println(m.toString());
		
		Designer d = new Designer(null, null, null, 0, 0);
		System.out.println(d.toString());
		
		Engineer en = new Engineer(null, null, null, 0, 0);
		System.out.println(en.toString());
	}

}
