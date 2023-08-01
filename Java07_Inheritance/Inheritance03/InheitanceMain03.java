package edu.java.inheritance03;

public class InheitanceMain03 {

	public static void main(String[] args) {
		// Car 타입의 객체 생성
		
		Car car1 = new Car(100, 30);
		car1.drive();
		
		// HybridCar 타입의 객체 생성.
		HybridCar car2 = new HybridCar(90, 50, 100);
		car2.drive();
		
		// 다형성(polymorphism): 하나의 객체를 두 개 이상의 타입으로 부를 수 있는 것.
		// 객체를 자기 자신 타입 뿐만 아니라 그 상위 타입 변수에도 할당할 수 있는 것. 
		// 하이브리드 자동차는 하이브리드 자동차이다.
		// 하이브리드 자동차는 자동차이다.
		Car car3 = new HybridCar(100, 50, 100);
		car3.drive(); //-> 다형성이 적용된 경우에도, override되어 있는 메서드가 실행됨.
		
		// 다형성은 코드의 재사용성(resuse)을 높여줌.
		// 변수 선언, 배열/리스트 선언, 파라미터 선언, 메서드 리턴 타입 선언, ...
		// SuperType var = new SuperType();
		// SuperType var = new SubType();
		// SuperType[] arr = {new SuperType(), newSubType()}
		
		Car[] cars = {car1, car2, car3};
		for (Car c : cars) {
			c.drive();
		}
		
		// 다형성을 사용해서 정의된 메서드.
		// System.out.println(Object o); - 어떤 타입의 객체도 모두 argument로 전달할 수 있음.
		System.out.println(car1);
		System.out.println(car2);
		
		

	}

}
