package edu.java.modifier02;

import edu.java.modifier01.AccessTest;

// 1. 같은 패키지에 있는 클래스는 import 선언문 변수 선언에서 사용할 수 있음.
// 2. 다른 패키지에 있는 클래스는
//  (1) import 선언문을 작성하고 변수 선언에서 사용할 수 있음.
//  (2) import 선언문 없이, 
// 패키지를 포함한 클래스 전체 이름(full name)을 변수 선언과 생성자 호출에서 사용.
// 3. JDK의 패키지 중에서 java.lang 패키지의 클래스들은 import 선언문 없이 클래스 이름을 사용.
// (예) String, System, Math, ...
// 패키지 이름을 회사 도메인 (naver.com, kakao.com, googl.com)을 사용하는 이유는
// 클래스 이름이 같더라도 다른 패키지 이름으로 구별할 수 있도록 하기 위해서.

public class ModifierMain02 {

	public static void main(String[] args) {
		// edu.java.modifier01.AccessTest test = new edu.java.modifier01.AccessTest(1, 2, 3, 4);
		// import 사용 목적 변수 와 생성자 이름이 길기 때문에 줄여부르기 위함 (import문이 없을 때)
		AccessTest test = new AccessTest(1, 2, 3, 4);
		// ctrl + shift + O = import 선언문 최적화(optimize)
		// - 필요한 import문은 자동으로 작성, 필요 없는 import문은 자동으로 삭제.
		
		// test.c = 100; -> not visible
		test.printInfo();
	}

}
