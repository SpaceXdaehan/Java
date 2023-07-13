package edu.java.modifier03;

public class Person {
	// field 
	private String name;
	private int age;
		
	// constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
		
	// method
	// getter 메서드 
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	// setter 메서드
	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;			
		} else {
			System.out.println("음수 나이는 허용되지 않음");
		}
	}
	
	
	
}
