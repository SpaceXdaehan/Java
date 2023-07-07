package edu.java.class05;

public class ClassMain05 {

	public static void main(String[] args) {
		// 기본 생성자를 이용한 Rectangle 객체 생성
		
		Rectangle Rectangle1 = new Rectangle();
		Rectangle1.printRectangle();	
		System.out.println(Rectangle1);
		System.out.println(Rectangle1.width + "," + Rectangle1.height);
		
		Rectangle1.width = 1.0; // 생성된 Rectangle1 직사각형 객체의 가로(width) 길이를 변경
		Rectangle1.height = 2.0; // 생성된 Rectangle1 직사각형 객체의 세로(height) 길이를 변경
		
		System.out.println(Rectangle1.perimeter());
		System.out.println(Rectangle1.area());
		
		System.out.println("=========================================");
		
		// argument를 갖는 생성자를 이용한 Rectangle 객체 생성
		
		Rectangle Rectangle2 = new Rectangle(4, 3);
		System.out.println(Rectangle2);
		System.out.println(Rectangle2.width + "," + Rectangle2.height);
		
		System.out.println(Rectangle2.perimeter());
		System.out.println(Rectangle2.area());
		
	}

}
