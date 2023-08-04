package edu.java.inheritance06;

import java.util.Objects;

public class Point {
	// 필드
	private int x;
	private int y;
	
	// 생성자: (1)기본 생성자, (2) argument가 2개인 생성자.
	public Point() {
		
	}
	
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}

	//  getters & setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	// toString override: "Point(x=0, y=0)"	
	@Override
    public String toString() {
        //return "Point(x="+ x+", y=" + this.y +")";
		String s = String.format("Point(x=%d, y=%d)", this.x, this.y);
		return s;
	}

	@Override
	// hashCode() 메서드는 반드시 int 타입을 리턴.
	// equals()가 true를 리턴하는 두 객체는 hashCode()의 리턴값이 같아야함.
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) { // Object obj = new Point();
		boolean result = false;
		if (obj instanceof Point) { 	// obj가 point 타입의 인스턴스이면
			Point other = (Point) obj;	// 안전한 타입 변환(casting)
			result = (this.x == other.x) && (this.y == other.y);
		} 
		return result;
	}
	
	
	
	
}
