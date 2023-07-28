package edu.java.inheritance02;

public class Person {

	//field
	private String name;
	
	// constructor
	public Person() {
		System.out.println("person() 생성자호출");
	}
	
	public Person(String name) {
		this.name = name;
		System.out.println("Person(name) 생성자호출");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
