package edu.java.loop06;

public class LoopMain06 {

	public static void main(String[] args) {
		// do-while 반복문 (do = 참이든 거짓이든 무조건 실행)
		
		int n = 1;
		do {
			// int n = 1; 지역변수 안에서만 유효해서 while문 까지 도달하지 못함
			System.out.print(n + " ");
			n++;
		}	while (n <= 10);
		System.out.println();
		
		// do-while문은 반복 여부를 검사하기 전에 무조건 블록을 한 번 실행함!
		// for 문과 while 문은 반복 여부를 먼저 검사하고, 조건이 참이면 블록을 실행함.
		n = 1;
		while (n < 5) {
			System.out.print(n + " ");
			n++;
		}
			System.out.println();
		
			
		n = 1;
		do {
			System.out.println(n + " ");
			n++;
		} while (n > 5); {
			System.out.println();
			
		}
		
		
		
	}

}
