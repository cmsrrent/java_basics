package oop;

class Person {
	String name;
	String email;
	String phone;
	
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(email);
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
	
	
}

public class Demo {

	
	public static void main(String[] args) {
		// Person
		
		// instantiate oject
		Person person1 = new Person();
		
		// define properties
		person1.name = "Joe";
		person1.email = "jim@mailinator.com";
		person1.phone = "01111111111";
		
		// abstract
		person1.walk();
		person1.sleep();
		person1.eat();
		
		
		Person person2 = new Person();
		person2.name = "Jane";
		person2.sleep();
		
		
		/*
		// attributes
		String name = "Joe";
		String email = "joe:testemail.com";
		String phone = "07777777777";

		// actions, activities
		walking(name);
		System.out.println(name + " is eating");
		
		// what about binding attributes and properties together
		
	}

	// add functions
	static void walking(String name) {
		System.out.println(name + " is walking");
	}
	*/
	}
}
