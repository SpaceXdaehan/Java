package edu.java.switch01;

public class SwitchMain01 {

	public static void main(String[] args) {
		String time = "아침";
		switch (time) {
		case "아침" :
			System.out.println("breakfast");
			break;
		case "점심" :
			System.out.println("lunch");
			break;
		case "저녁"	:
			System.out.println("dinner");
			break;
		default: // Default는 항상 마지막에 와야됨 생략도 가능 
			System.out.println("snack");	
		}
		
		// switch-case 구문은 해당 case 위치로 이동해서 break를 만날 때까지 코드들을 실행.
		// switch-case 구문에서 case에 사용 가능한 변수의 타입은 
		// (1) 정수 byte, short, int, long, char
		// (2) 문자열: String
		// (3) enum: 열거형 자료 타입.
		// (주의) switch-case 구문에서 실수 타입(float, double)은 사용할 수 없음!
		/*
		double x = 1.0;
		switch (x) {
		case 1.0:
			break;
		case 2.0:
			break;
		}
		*/

	}

}
