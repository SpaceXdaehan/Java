package edu.java.class03;

// 클래스: 속성(field) + 생성자(constructor) + 기능(method) => 데이터 타입
// 생성자(constructor):
// - 객체를 메모리에 생성하고 초기화(initialize)해 주는 기능을 담당하는 특별한 함수.
// - 모든 클래스에는 반드시 적어도 1개 이상의 생성자가 있어야 함!
// - 클래스를 작성할 때 생성자를 하나도 정의(선언)하지 않으면,
// 자바 컴파일러가 "기본 생성자(default constructor)"를 자동으로 만들어줌.
// - 클래스를 작성할 때 생성자를 1개 이상을 정의하면,
// 자바 컴파일러는 기본 생성자를 자동으로 만들지 않음!
// - 생성자의 이름은 반드시 클래스 이름과 동일해야 함!
// - 생성자는 리턴 타입을 사용하지 않음! (void도 사용하지 않음.)

// 기본 생성자(default constructor): argument를 갖지 않는 생성자.
// - 일반적으로 필드의 값들을 필드 타입의 기본값으로 초기화함.
// - 기본값: boolean - false, 정수 - 0, 실수 - 0.0, 참조 타입(클래스 타입) - null.

public class User {
	// field
	String userId;
	String userPassword;
	int userAge;
	
	// constructor
	public User() {
		// 코드를 작성하지 않아도, 각 필드들을 그 타입의 기본 값으로 초기화를 해줌.		
	}
		
	public User(String userId, String userPassword, int userAge) {
		// field를 초기화
		// this - field userId와 parameter userId를 구별하기 위해서 사용.
		this.userId = userId; 
		this.userPassword = userPassword;
		this.userAge = userAge;
	}
	
	public User(String userId, String userPassword) {
//		this.userId = userId;
//		this.userPassword = userPassword;
//		this.userAge = 0;
		this(userId, userPassword, 0); // 위의 3줄 코드를 1줄로
	}
	
	// 생성자 오버로딩(overloading): 파라미터가 다른 생성자를 여러개 정의하는 것.
	// this의 의미(기능):
	// (1) 생성된 객체(인스턴스) - 인스턴스의 필드와 지역 변수를 구별하기 위한 용도.
	// (2) overloading된 다른 생성자 호출.
	
	// method
	public void printUserInfo() {
		System.out.printf("ID: %s, PWD: %s, AGE: %d\n ", userId, userPassword, userAge);
	}
		
}
