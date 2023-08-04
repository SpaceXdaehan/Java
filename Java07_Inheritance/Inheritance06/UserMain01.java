package edu.java.inheritance06;

public class UserMain01 {

	public static void main(String[] args) {
		User user = new User("admin", "admin1234");
		System.out.println("user: " + user);
		
		User user2 = new User("admin", "0000");
		System.out.println("user2: " + user2);
		
		System.out.println("== 연산자: " + (user == user2));
		System.out.println("equals 메서드: " + user.equals(user2));
		
		System.out.println("user hashCode: " + user.hashCode());
		System.out.println("user2 hashCode: " + user2.hashCode());
		
		

	}

}
