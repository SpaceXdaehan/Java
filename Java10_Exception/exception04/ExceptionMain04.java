package edu.java.exception04;

import java.util.Scanner;

public class ExceptionMain04 {

	public static void main(String[] args) {
		// multi-catch 블록 (Java 7 버전부터 생김):
		// 하나의 catch 블록에서 여러개의 예외들을 처리하기 위한 문법.
		// catch (Exception1 | Exception2 | ... 변수 이름) {...}
		// multi-catch 블록은 상속 관계(Super-Sub관계)에 있는 예외 클래스들은 함께 사용할 수 없음!
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("x를 입력> ");
			int x = Integer.parseInt(sc.nextLine());
			
			System.out.println("y를 입력> ");
			int y = Integer.parseInt(sc.nextLine());
			
			System.out.printf("%d / %d = %d\n", x, y, x / y);
			
		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println(e.getMessage());
		} 
		

	}

}
