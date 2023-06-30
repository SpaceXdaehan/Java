package edu.java.method03;

import java.util.Random;


public class MethodMain03 {
	
	public static int[] makeTestData(int n) {
		int[] array = new int[n];
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			array[i] = random.nextInt(10);
			}
		return array;
	}
	
	public static void printTestArray(int[] array) {
		System.out.print("[");
		for (int x : array) {
			System.out.print(x + " ");
		}
		System.out.println("]");
		// void 타입의 메서드에서는 return; 문을 생략가능
		return;
	}

	public static void main(String[] args) {
		// 메서드 기능 테스트를 위한 배열 만들기
		int[] array = makeTestData(5);
		
		// 테스트 데이터 출력하기
		printTestArray(array);
				
		int total = sum(array);
		System.out.println("sum = " + total);
		
		double average = mean(array);
		System.out.println("average = " + average);
		
		int maxValue = max(array);
		System.out.println("max = " + maxValue);
		
		int maxIndex = maxAt(array);
		System.out.println("max index = " + maxIndex);
		
		int minValue = min(array);
		System.out.println("min = " + minValue);
		
		int minIndex = minAt(array);
		System.out.println("minIndex = " + minIndex);
				
	}
	
	/**
     * sum
     * 정수 배열의 모든 원소들의 합을 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 모든 원소들의 합.
     */
	public static int sum(int[] arr) {
		int total = 0;
		for (int x : arr) {
			total += x;
		}
		return total;
	}
    /**
     * mean
     * 정수 배열의 모든 원소들의 평균을 (double) 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 모든 원소들의 평균.
     */
	public static double mean(int[] arr) {
		return (double) sum(arr) / arr.length;
	}
    
    /**
     * max
     * 정수 배열에서 최댓값을 찾아서 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최댓값.
     */
    public static int max(int[] arr) {
    	int max = arr[0];
    	for (int x : arr) {
    		max = (x > max) ? x : max;
    		}
    	return max;
    	}
    
    
    /**
     * maxAt
     * 정수 배열에서 최댓값의 인덱스 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최댓값의 인덱스.
     * 최댓값이 여러개 있는 경우, 첫번째 최댓값의 인덱스.
     */
    public static int maxAt(int[] arr) { 
    	int max = arr[0];  						 // 배열의 최댓값을 저장할 변수.
    	int index = 0; 							 // 배열의 최댓값의 인덱스를 저장할 변수.
    	/* if (arr[i] > arr[index]) {
    	 * index = i;
    	 * }
    	 */
    	for (int i = 1; i < arr.length; i++) {   // 배열의 원소들을 순서대로 반복하면서
    		if (arr[i] > max) {					 // 배열에서 읽은 값이 max보다 크다면
    			max = arr[i];					 // max 값을 배열에서 읽은 값으로 변경
    			index = i;						 // 최댓값의 인덱스를 현재 인덱스로 변경.
    		}
    	}
    	return index;
    }

    /**
     * min
     * 정수 배열에서 최솟값을 찾아서 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최솟값.
     */
    public static int min(int[] arr) {
    	int minVal = arr[0];
    	for (int x : arr) {
    		if (x < minVal) {
    			minVal = (x < minVal) ? x : minVal;
    		}
    	} 
    	return minVal;
    }
    
    /**
     * minAt
     * 정수 배열에서 최솟값의 인덱스 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최솟값의 인덱스.
     * 최솟값이 여러개 있는 경우, 첫번째 최솟값의 인덱스.
     */
    public static int minAt(int[] arr) {  	
    	int minVal = min(arr);							 // 최솟값을 찾음. 
    	int index = 0;       				 			 // 배열의 인덱스  											
    	for (index = 0; index < arr.length; index++) {  // 배열의 원소들을 순서대로 반복하면서, 그 원소가 최솟값인 지 검사.
    		if (arr[index] == minVal) {
    			break;									// 최솟값을 찾았으면 반복을 종료.
    		}	
    	}    	
    	return index; 									// 반복문이 종료됐을 때의 인덱스가 리턴.
    }
    
    
    
    
    
    
    
    
}
