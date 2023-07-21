package edu.java.class05;

// 직사각형 

public class Rectangle {
	// field - 객체 속성
	double width; // 직사각형의 가로 길이
	double height; // 직사각형의 세로 길이
	
	// 생성자 - 필드 초기화
	// (1) 기본 생성자
	// (2) 직사각형의 가로 세로 길이를 전달받은 값으로 초기화 하는 생성자
	
	public Rectangle() {
		
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// 메서드 - 객체의 기능
	// (1) perimeter - 직사각형의 둘레 길이를 리턴.
	// (2) area - 직사각형의 넓이를 리턴.
	public void printRectangle() {
		System.out.printf("width: %f, height: %f\n", width, height);
	}

	public double perimeter() {
		return (this.width + this.height) * 2;
	} // 다른 지역변수와 필드의 같은 이름의 변수가 없어서 this생략 가능
	
	public double area() {
		return (this.width * this.height); 
	}
	
	
}
