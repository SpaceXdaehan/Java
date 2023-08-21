package edu.java.inner01;

public class Outer {
	// field
	private int x;
	private int y;
	private String s;
	
	// constructor
	public Outer(int x, int y, String s) {
		this.x = x;
		this.y = y;
		this.s = s;
	}
	
	// method
	@Override
	public String toString() {
		return String.format("Outer(x=%d, y=%d, s=%s)", this.x, this.y, this.s);
	}
	
	
	
	// static이 아닌 멤버 내부 클래스(인스턴스 내부 클래스)
	public class Inner {
		// field
		private int y;
		
		// constructor
		public Inner(int y) {
			this.y = y;
		}
		
		// method
		public void printInfo() {
			System.out.println("--- Inner Class ---");
			System.out.println("y = " + y);		// -> 내부 클래스(지역변수)의 멤버 y를 출력
			// this.y: 내부 클래스의 멤버 y를 사용!
			System.out.println("Outer x = " + x); // Outer.this.x: 내부 클래스는 외부 클래스의 멤버들을 사용할 수 있다.
		    System.out.println("Outer y = " + Outer.this.y);  // 외부 클래스의 변수 y 를 출력하는 문법
			System.out.println("Outer s = " + s);
		
		}
	}
	
	
	
	
	
}
