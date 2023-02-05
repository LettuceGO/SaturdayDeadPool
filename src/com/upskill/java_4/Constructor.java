package com.upskill.java_4;

public class Constructor {

	/*Constructor is instance of class, method same as class name, java will execute constructor first
	- 	Constructor cannot be static or override nor void or return type.
	- 	Default Constructor : No constructor is initialized
	- 	Parameterized Constructor : Add different signature
	-	Constructor overloading : Different signature
	*/
	
	
	String studentName;
	int studentAge;
	String studenteye;
	int studentHeight;
	String studentDress;
	
	public Constructor(String name, int age, String eye, int Height, String Coat) {
		studentName = name;
		studentAge = age;
		studenteye = eye;
		studentHeight = 70;
		studentDress = Coat;
	}
	public Constructor (String name) {
		studentName = name;
	
}
	public static void main(String[] args) {
		Constructor obj = new Constructor ("Tahin", 20, "Brown", 70, "Red");
		System.out.println(obj.studentName);
		System.out.println(obj.studentAge);
		System.out.println(obj.studenteye);
		System.out.println(obj.studentHeight);
		System.out.println(obj.studentDress);
	
		
		Constructor obj2 = new Constructor ("Tahin");
		System.out.println(obj2.studentName);
	}
	
	public Constructor (int value) {
		
	}
	
	

}
