package edu.java.loop01;

public class LoopMain01 {

	public static void main(String[] args) {
		// for 반복문 
		// 증가 연산자(++), 감소 연산자(--): 변수의 값을 1 증가 or 감소.
		// 증가/감소 연산자는 변수 앞 또는 뒤에 사용. ex) x++, ++x
		// 단항 연산자: 두개의 항을 사용하지 않음 
		
		for (int n = 1; n <= 5; n++) {
			System.out.println(n);
		}
		
		System.out.println("-----------------");
		
		// 10부터 1까지 내림차순으로 출력.
		for (int i = 10; i > 0; i--) {
			System.out.println(i);			
		}
		
		// 지역 변수 (local variable): 메서드 public static void main(String[] args) {} 블록 안에서 선언한 변수.
		// 지역 변수는 선언된 위치에서 부터 그 변수가 속한 블록({}) 안에서만 사용 가능.
		// for () 구문에서 선언하는 변수는 for 블록 안에서만 사용 가능한 지역 변수.
		// 서로 다른 for (), if () 등등에서 같은 변수 사용가능
	}

}
