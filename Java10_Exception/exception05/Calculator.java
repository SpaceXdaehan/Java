package edu.java.exception05;

public class Calculator {
	public int divide(int x, int y) throws Exception {
		if (y != 0) {
			return x / y; 	// return 문: 메서드 종료. 값을 메서드 호출한 곳에 반환.	
		}
		throw new Exception("y는 0이 될 수 없음!");
		// throw: 메서드를 호출한 곳으로 예외 객체를 던짐.
		// 의도적으로 예외를 만들어서 JDK로 던짐 
		
		
	}

	
}
