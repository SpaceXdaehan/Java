package edu.java.array03;

public class ArrayMain03 {

	public static void main(String[] args) {
		// Ex 1.
		// 정수 (int) 10개를 저장할 수 있는 배열 선언.
		// 배열에 순서대로 0, 2, 4, 6, 8, 10, ...... , 18을 저장.
		// 배열의 원소들을 한 줄로 출력.
		
		int[] score = new int[10];

		for (int i = 0; i < score.length; i++) {
			score[i] = i * 2;
		}	
		for (int i : score) {
			System.out.print(i+ " ");
		}
		System.out.println();
		
		
		
//		int[] numbers = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18};
//			for (int i : numbers) {
//				System.out.print(i+ " ");
//			}
//			System.out.println();
						
		// Ex 2.
		// boolean 10개를 저장할 수 있는 배열 선언.
		// 배열에 순서대로 true, false, true, false, ......, false 를 저장.
		// 배열의 원소들을 한 줄로 출력.
		
		boolean[] isEven = new boolean[10]; 
//		for (int i = 0; i < isEven.length; i++) {
//			if (i % 2 == 0) {
//				isEven[i] = true;
//			}	else {
//				isEven[i] = false;
//			}
//		}
		
		for (int i = 0; i < isEven.length; i++) { // boolean 의 기본 값은 false
			if (i % 2 == 0) {
				isEven[i] = true;
			}	
		}		
		for (boolean b: isEven) {
			System.out.print(b + " ");	
		}
		System.out.println();	
			
		

	}

}
