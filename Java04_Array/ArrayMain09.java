package edu.java.array09;

import java.util.Random;

public class ArrayMain09 {

	public static void main(String[] args) {
		// 1차원 정수(int) 배열 3개를 갖는 2차원 배열을 선언.
        // 첫번째 배열에는 난수 2개, 두번째 배열에는 난수 3개, 세번째 배열에는 난수 4개 저장.
        // 저장하는 난수의 범위는 0 이상 100 이하.
        // 2차원 배열의 원소들을 출력.
		
        // 2차원 배열의 모든 원소들의 합을 계산하고 출력.
        // 2차원 배열의 모든 원소들의 평균을 계산하고 출력.
        // 최댓값을 찾고 출력.
        // 최솟값을 찾고 출력.
		
		Random random = new Random();
		
		
		int[][] num = new int[3][];										// 1차원 정수(int) 배열 3개를 갖는 2차원 배열을 선언.
//		num[0] = new int[2];
//		num[1] = new int[3];
//		num[2] = new int[4];
		for (int i = 0; i < num.length; i++) {			
			num[i] = new int[i + 2] ;
			for (int j = 0; j < num[i].length; j ++) {
				num[i][j] = random.nextInt(101);						 // 첫번째 배열에는 난수 2개, 두번째 배열에는 난수 3개, 세번째 배열에는 난수 4개 저장.																					// 저장하는 난수의 범위는 0 이상 100 이하.
			}															// 저장하는 난수의 범위는 0 이상 100 이하.
		}
		for (int[] arr : num) {
			for (int x : arr) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
				
		int sum = 0;   				// 배열의 원소들의 합을 저장하기 위한 변수
		int count = 0; 				// 배열의 원소들의 개수를 저장하기 위한 변수
		for (int[] arr : num) {
			for (int x : arr) {
				sum += x;  			// 배역에서 읽은 값은 합계에 더함.
				count++; 			// 배열의 원소의 개수는 1 증가.
			}
		}
		System.out.println("sum = " + sum);     		// 2차원 배열의 모든 원소들의 합을 계산하고 출력.
		System.out.println("count = " + count);			 
		
		double average = (double) sum / count;			
		System.out.println("average = " + average);		// 2차원 배열의 모든 원소들의 평균을 계산하고 출력.
		
		
		int max = num[0][0]; 					// 최댓값을 찾고 출력.
		for (int[] arr : num) {					// 2차원 배열의 원소인 1차원 배열들에 대해서
			for (int x : arr) {					// 그 1차원 배열의 각 원소(정수)들에 대해서
//				if (x > max) {
//					max = x;
//				}
				max = (x > max) ? x : max;
			}
		}
		System.out.println("max = " + max);
		
		int min = num[0][0];					// 최소값을 찾고 출력.
		for (int[] arr : num) {
			for (int x : arr) {
				min = (x < min) ? x : min;
			}
		}
		System.out.println("min = " + min);
		
		
		
		
		
		
	}

}
