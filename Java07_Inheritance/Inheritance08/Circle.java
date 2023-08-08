package edu.java.inheritance08;

public class Circle extends Shape{
	// field
	private double radius;	// 원의 반지름

	public Circle(String type, double radius) {
		super(type);
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}

}


