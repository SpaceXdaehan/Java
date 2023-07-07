package edu.java.class06;

public class ClassMain06 {

	public static void main(String[] args) {
		Circle cir1 = new Circle();
		cir1.printInfo();
		System.out.println(cir1);
		System.out.println(cir1.radius);
		System.out.println("둘레: " + cir1.perimeter());
		System.out.println("넓이: " + cir1.area());
		
		Circle cir2 = new Circle(1.0);
		cir2.printInfo();
		System.out.println("둘레: " + cir2.perimeter());
		System.out.println("넓이: " + cir2.area());
		
	}

}
