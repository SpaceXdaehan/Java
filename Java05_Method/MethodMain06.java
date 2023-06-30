package edu.java.method06;

public class MethodMain06 {

	public static void main(String[] args) {
		// 재귀 메서드: 메서드 안에서 자기 자신을 다시 호출하는 메서드.
		for (long n = -2; n < 6; n++) {
			System.out.printf("%d! = %d, %d\n", n, factorial(n), factorial2(n));
		}		
	}
	
	/**
	 * n factorial(n!) 을 계산해서 리턴하는 메서드.
	 * 0! = 1 = 0!의 약속, 정의
	 * 1! = 1 = 0! * 1
	 * 2! = 1 * 2 = 1! * 2
	 * 3! = 1 * 2 * 3 = 2! * 3
	 * n! = 1 * 2 * 3 * ....* (n-1) * n = (n-1)! * n
	 *@param n 정수 
	 *@return factorial 결과 값, n이 음의 정수이면 -1을 리턴.
	 */
		
	public static long factorial(long n) {
		long result = -1;
		
		if (n == 0) { // 0!
			result = 1;			
		} else if (n > 0) { // n! = (n-1)! x n
			result = factorial(n - 1) * n;  // 재귀 호출문
		}
		return result;
	}
	
	
	// 재귀 호출을 사용하지 않은 factorial
	public static long factorial2(long n) {
		long result = -1;
		if (n == 0) {
			result = 1;
		} else if (n > 0) {
			result = 1;
			for (long x = 1; x < n; x++) {
				result *= x;
			}
		}
		return result;
	}
	
	
	
	
}
