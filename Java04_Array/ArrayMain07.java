package edu.java.array07;

public class ArrayMain07 {

	public static void main(String[] args) {
		// 2차원 배열: 1차원 배열들을 원소로 갖는 배열.
		// 2차원 배열의 원소를 참조할 때 인덱스가 2개 필요함.
		
		int[][] array = {
				{1, 2, 3, 4},
				{5, 6, 7, 8, 9,},
				{10, 11, 12},
		};

		// 2차원 배열의 인덱스
		System.out.println(array);					// 2차원 배열
		System.out.println(array[0]);	     		// 2차원 배열의 인덱스 i번째 원소는 1차원 배열이 된다.
		System.out.println(array[0][0]);   			// 2차원 배열에서 인덱스 [i, j]원소는 값 1개
		System.out.println(array[1][3]);   			// 원소 8
//		
//		// 2차원 배열의 .length
//		System.out.println(array.length);
//		System.out.println(array[0].length);		
//		System.out.println(array[1].length);
//		System.out.println(array[2].length);
		
		// for구문을 사용한 2차원 배열 출력
		for (int i = 0; i < array.length; i++) {
			for (int j =0; j < array[i].length; j++) {
			System.out.print(array[i][j] + "\t");
		}
		System.out.println();
		}
		System.out.println("====================================");
		
		// for-each 구문을 사용한 2차원 배열 출력
		for (int[] num : array) {
			for (int number : num) {
				System.out.print(number + "\t");
			}
			System.out.println();
		}
		
	
		
	}

}
