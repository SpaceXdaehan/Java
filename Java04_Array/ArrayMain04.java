
package edu.java.array04;

import java.util.Random;

public class ArrayMain04 {

	public static void main(String[] args) {

		int[] num = new int[5]; 				// 정수 5개를 저장할 수 있는 배열을 선언.

		Random random = new Random(); 			// 0 이상 9 이하의 정수 난수 5개를 배열에 저장.
		for (int i = 0; i < num.length; i++) {
			num[i] = random.nextInt(10);
		}

		for (int i : num) { 					// 배열의 내용을 출력.
			System.out.print(i + " ");
		}
		System.out.println();

		int sum = 0; 							// 배열의 모든 원소의 합을 계산하고 출력. sum = 0;
//		for (int i = 0; i < num.length; i++) {
//			sum += num[i]; // sum = sum + num[i];
//			System.out.println("sum = " + sum); // 출력문을 안 쪽에 넣으면 더해지는 과정을 확인할 수 있음
//		}
//		System.out.println("sum = " + sum);		// 출력문을 바깥쪽에 넣으면 총 합게만 출력
		
		for (int x : num) {
			sum += x;
		}
		System.out.println("sum = " + sum);
		
		double average = (double) sum / num.length;	// 배열 원소들의 평균을 double 타입으로 계산하고 출력.
		System.out.println("average " + average);
		
		// 배열의 원소들 중 최댓값을 찾고 출력.
		int max = num[0];         				// 배열의 첫번째 (0번째 인덱스 위치) 원소를 최댓값이라고 가정.
		for (int i : num) {						// 배열 num의 모든 원소들을 순회하면서 
			if (i > max) {						// 배열에서 읽은 값이 max보다 크다면
				max = i;						// max의 값을 i로 변경.
			}
		}
		System.out.println("max = " + max);
				
		// 배열의 원소들 중 최솟값을 찾고 출력.
		int min = num[0];						// 배열의 첫번째 원소를 최솟값이라고 가정.
		for (int x : num) {						// 배열의 모든 원소를 순서대로 반복하면서,
			if (x < min) {						// 배열에서 읽은 값이 min보다 작다면,
				min = x;						// min의 값을 x(배열에 읽은 더 작은 값)로 변경.
			}
		}
		System.out.println("min = " + min);
		
		
		
		
		
		
	}
	
}
