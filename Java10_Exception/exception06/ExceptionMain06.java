package edu.java.exception06;


import java.util.Scanner;

import edu.java.exception01.ExceptionMain01;

public class ExceptionMain06 {
	
	private Scanner scanner = new Scanner(System.in);
					
	public static void main(String[] args) {
        // inputInteger() 메서드 테스트 코드
        ExceptionMain06 app = new ExceptionMain06();
        int x = app.inputInteger();
        System.out.println("x = " + x);
    }

    public int inputInteger() {
        // Scanner를 사용해서 입력받은 정수를 리턴.
        // Integer.parseInt(scanner.nextLine()) 과정에서 NumberFormatException을 처리.
        int result = 0; // 콘솔에서 입력받은 값을 저장할 변수
        while (true) {
            try {
                System.out.print("정수 입력> ");
                result = Integer.parseInt(scanner.nextLine());
                break; // 반복문을 끝냄.
            } catch (NumberFormatException e) {
                System.out.println("정수로 입력해주세요...");
            }
        }
        System.out.println("프로그램을 종료합니다");
        
        return result;
	}

}
