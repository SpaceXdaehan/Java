package edu.java.inheritance04;

public class InheritanceMain04 {

	public static void main(String[] args) {
		// 다형성과 타입 변환(casting) 연산자
		// 다형성: SuperType var = new SubType();
		Parent ch1 = new Child();
		ch1.testParent();
		
		//-> 실제 생성된 객체는 Child 타입이지만, 변수 선언이 Parent 타입으로 되어 있어서
		// Parent 타입에서 정의된 메서드들만 보이고 사용할 수 있다.
		((Child)ch1).testChild();
		//-> Parent 타입으로 선언된 변수를 Child 타입으로 강제 타입 변환(casting)을 하면
		// Child 타입에서 정의된 메서드들도 보이고 사용할 수 있음.
		
		Parent ch2 = new AnotherChild();		
		// ((Child) ch2).testChild(); 문법적으로는 오류가 발생하지 않지만,
		// Child와 AnotherChild는 서로 casting할 수 없는 타입이기 때문에 실행중에 에러가 발생.
		// instanceof 연산자: 변수 instanceof 클래스 이름.
		// 변수 클래스 타입의 인스턴스이면 true, 그렇지 않으면 false.
		
		if (ch2 instanceof Child) {
			((Child) ch2).testChild();
		} else if (ch2 instanceof AnotherChild) {
			((AnotherChild) ch2).tesAnotherChild();
		} else {
			ch2.testParent();
		}
		
	}
}

class Parent {
	public void testParent() {
		System.out.println("I'm your father!");
	}
}

class Child extends Parent {
	public void testChild() {
		System.out.println("child");
	}
 }

class AnotherChild extends Parent {
	public void tesAnotherChild() {
		System.out.println("another child");
	}
}