package edu.java.lambda01;

public class Calculator {
	// 중첩 인터페이스
	@FunctionalInterface // 함수형 인터페이스: 추상 메서드가 오직 1개인 인터페이스.
	public interface Calculable { 	
		double calculate(double x, double y);
	}
	
	// field
	private double x;
	private double y;
	
	// constructor
	public Calculator(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	// method
	public double calculate(Calculable calc) {
		return calc.calculate(x, y);
	}
	
}
