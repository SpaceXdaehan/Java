package edu.java.singleton;

public class SingletonMain {

	public static void main(String[] args) {
		// Captain 타입 변수 선언, Captain 타입 객체 생성, 객체 (주소값) 저장.
		// Captain 생성자는 private으로 선언되어 있기 때문에 호출할 수 없지만,
		// public static으로 선언된 메서드는 호출할 수 있음.
		Captain captain1 = Captain.getInstance();
		System.out.println(captain1.getName());
		
		Captain captain2 = Captain.getInstance();
		System.out.println(captain2.getName());
		
		captain2.setName("아이언맨");
		System.out.println(captain2.getName());
		System.out.println(captain1.getName());
		
	}

}
