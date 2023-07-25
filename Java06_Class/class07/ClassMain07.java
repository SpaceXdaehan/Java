 package edu.java.class07;

public class ClassMain07 {

	public static void main(String[] args) {
		// 기본 생성자를 사용해서 Score 객체 생성.
		Score sco1 = new Score();
		System.out.println(sco1);
		sco1.printScore();
		System.out.println("세 과목의 총점: " + sco1.getTotal());
		System.out.println("세 과목의 평균: " + sco1.getAverage());
		
		System.out.println("======================================");
		
		// argument를 갖는 생성자를 호출해서 Score 객체를 생성.
		Score sco2 = new Score(100, 97, 80);
		System.out.println(sco2);
		sco2.printScore();
		System.out.println("세 과목의 총점: " + sco2.getTotal());
		System.out.println("세 과목의 평균: " + sco2.getAverage());
		
		String emptyString = "";
		System.out.println("길이: " + emptyString.length());
		String nullString = null;
		
		// System.out.println("길이: " + nullString.length());
		// NullPointerException 발생
		// Null: 생성된 객체가 없다.
		// 데이터 타입의 기본값:
		// (1) boolean - false, (2) 정수 - 0 (3) 실수 - 0.0
		// (4) 참조(클래스)타입 - null 
		
		System.out.println("======================================");
		// 기본 생성자를 사용해서 Student 객체를 생성.
		
		Student stu1 = new Student();
		System.out.println(stu1);
		stu1.printStudent();
					
		Student stu2 = new Student(13, "대한", sco1);
		stu2.printStudent();
		
		Student stu3 = new Student(12, "대한", sco2);
		stu3.printStudent();
		
		Student stu4 = new Student(11, "대한", null);
		stu4.printStudent();
		
		Student stu5 = new Student(10, "대한", 100, 100, 100);
		stu5.printStudent();
		
	}   
        
	}
