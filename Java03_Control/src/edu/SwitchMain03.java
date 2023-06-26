package edu.java.switch03;

public class SwitchMain03 {

	public static void main(String[] args) {
		// enum 타입을 사용하는 switch-case 구문
		
		// enum Season 타입 변수를 선언하고, 값을 겨울(WINTER) 로 초기화. 
		Season s = Season.WINTER;
		switch (s) {
		case SPRING:
			System.out.println("봄");
			break;
		case SUMMER:
			System.out.println("여름");
			break;
		case FALL:
			System.out.println("가을");
			break;
		case WINTER:
			System.out.println("겨울");
			break;
		}

	}

}
