package edu.java.inheritance08;

public abstract class Shape {
	// field
	protected String type;
	
	// constructor - 추상 클래스의 생성자는 하위 클래스에서만 호출할 수 있음.
	protected Shape(String type) {
		this.type = type;
	}
	
	// method
	// 추상 메서드
	public abstract double area(); // 도형의 넓이를 리턴.
	public abstract double perimeter(); // 도형의 둘레 길이를 리턴.
	
	// final 메서드 - 하위 클래스에서 override(재정의)하지 못하도록 하기 위해.
	public final void draw() {
		String info = String.format("%s: 넓이 =%f, 둘레=%f", this.type, area(), perimeter());
		System.out.println(info);
	}
}
