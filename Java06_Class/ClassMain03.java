package edu.java.class03;

public class ClassMain03 {

	public static void main(String[] args) {
		// User 타입 변수 선언, User 타입(클래스) 객체를 생성하고 저장.
		User user1 = new User(); // 기본 생성자 호출 -> user 객채 생성.
		user1.printUserInfo();
 
		// argument 3개를 갖는 생서자를 호출해서 객체를 생성.
		User user2 = new User("daehan", "daehan1234", 20);
		user2.printUserInfo();
		
		// argument 2개를 갖는 생성자를 호출해서 객체를 생성.
		User user3 = new User("daehan", "daehan0000");
		user3.printUserInfo();
	}

}
