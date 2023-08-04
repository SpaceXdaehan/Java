package edu.java.inheritance06;

public class StringTest {

	public static void main(String[] args) {
		// 상수 (constant): final로 선언된 변수. ex) final int x = 1;
		// 리터럴 (literal): 만들어진 값. final int x = 1; 에서 x = 상수 1 = 리터럴.
		String s1 = "hello";	// s1 = final을 붙이지 않아서 변수, "hello" = 문자열 리터럴
		String s2 = "hello";	
		System.out.println(s1 == s2);
		// true: JVM(자바가상머신)은 같은 문자열 리터럴은 두 번 생성하지 않음.
		
		String s3 = new String("hello");
		String s4 = new String("hello");
		System.out.println(s3 == s4);
		// false: 생성자는 호출할 때마다 새로운 객체를 힙메모리에 새롭게 생성하기 때문에.
		// new 생성자는 호출할 때마다 주소값이 달라지기 때문에 false
		// 그렇기 때문에 문자열에서 같다를 비교할 때 등호를 쓰지 말고 equals를 쓰자.
	}

}
