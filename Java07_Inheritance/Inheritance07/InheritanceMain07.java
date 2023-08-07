package edu.java.inheritance07;

// 추상 메서드(abstract method):
// 메서드 signature(수식어, 리턴 타입, 이름, 파라미터 선언)만 선언되어 있고.
// 메서드의 Body ({...})가 구현되지 않은 메서드.
// 추상 메서드는 반드시 abstract 키워드로 수식해야 함.
// 추상 메서드 선언은 반드시 세미콜론(;)으로 끝내야함.

// 추상 클래스(abstract class):
// abstract로 선언된 클래스.\
// 추상 메서드를 갖는 클래스는 반드시 추상 클래스로 선언해야 함. 
// 추상 클래스는 객체를 생성할 수 없음.

// 추상 메서드와 추상 클래스는 상속하는 하위 클래스에서 메서드 구현을 목적으로 함.

abstract class Animal { // class 앞에 abstract를 붙여서 수식
	public abstract void move(); // public 뒤에 리턴 타입 앞에 abstract를 수식
}

class Dog extends Animal {
	@Override	// 구현(implementation): 추상 메서드를 override 해서 메서드 바디를 작성.
	public void move() {
		System.out.println("강아지 멍멍");
	}	
}

class Fish extends Animal{
	@Override
	public void move() {
		System.out.println("물고기 꼬물꼬물");
	}
}

class Bird extends Animal{
	@Override
	public void move() {
		System.out.println("새는 짹짹");
	}
}

public class InheritanceMain07 {

	public static void main(String[] args) {
		// Animal animal = new Animal();
		//-> 추상 클래스 타입의 객체는 생성할 수 없다.

		Dog dog = new Dog();
		//-> 추상 클래스를 구현하는 하위 타입의 객체는 생성할 수 있음.
		dog.move();
		
		Fish fish = new Fish();
		fish.move();
		
		Bird bird = new Bird();
		bird.move();
		
		// 다형성: SuperType var = SubType object;
		Animal[] animals = {dog, fish, bird};
		for (Animal a : animals) {
			a.move();
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
