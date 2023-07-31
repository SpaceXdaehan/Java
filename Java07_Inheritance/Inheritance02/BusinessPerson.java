package edu.java.inheritance02;

// 회사원은 사람이다. 회사원은 사람을 확장한다.
public class BusinessPerson extends Person {
	// field
	private String company;

	// constructor
	public BusinessPerson() {
		// super();(생략되어있음) 상위 클래스의 기본 생성자 호출은 생략 가능.
		System.out.println("BusinessPerson() 생성자 호출");
	}

	public BusinessPerson(String company) {
		// super();
		this.company = company;
		System.out.println("BusinessPerson(company) 생성자 호출");
	}

	public BusinessPerson(String name, String company) {
		super(name); // 부모의 생성자를 명시적으로 호출.
		this.company = company;
		System.out.println("BusinessPerson(name, company) 생성자 호출");
	}

}
