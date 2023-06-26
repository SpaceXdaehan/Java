package edu.java.switch02;

public class SwitchMain02 {
	// 정수를 사용하는 switch-case
	// boolean (true or false) 사용불가

	public static void main(String[] args) {
		int n = 17;
		switch (n % 2) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
		}
		

	}

}
