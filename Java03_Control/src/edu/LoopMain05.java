package edu.java.loop05;

public class LoopMain05 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// while 반복문
		int n = 1;
		while (n <= 10) {
			System.out.print(n + " ");
			n++;
		}
		System.out.println();
		
		// 출력 결과가 1 3 5 7 9
		for (int i = 1; i < 10; i += 2) {			
				System.out.print(i + " ");			
			}
		
		System.out.println();
		
		int y = 1;
		while (y < 10) {
			System.out.print(y + " ");
			y += 2;
		}
		System.out.println();
			
		
	}

}
