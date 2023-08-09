package edu.java.inheritance09;

// enum
// (1) 열거형 상수(들)을 정의하는 특별한 종류의 클래스.
// (2) java.lang.Enum 클래스를 상속하는 특별한 하위 클래스.
// (3) field, 생성자, 메서드를 선언(정의)할 수 있음.
// (4) enum 생성자는 반드시 private으로!

class Test {
	public static final Test AM = new Test("오전");
	public static final Test PM = new Test("오후");
	
	private String meaning;
	
	private Test(String meaning) {
		this.meaning = meaning;
	}
}

enum Time {
	AM("오전"), PM("오후");
	
	private String meaning;
	
	// Enum의 생성자는 반드시 private으로!
	private Time(String meaning) {
		this.meaning = meaning;
	}
	
	// 메서드
	public String getMeaning() {
		return this.meaning;
	}
	
	
}

public class EnumTestMain {

	public static void main(String[] args) {
		Time t = Time.PM;
		System.out.println(t); 				// am.toString()의 리턴 값을 출력.
		System.out.println(t.name()); 		// Enum 클래스에서 상속받은 메서드
		System.out.println(t.ordinal()); 	// ""
		System.out.println(Time.values());	// Enum 클래스에서 상속받은 static메서드
		Time[] times = Time.values();
		for (Time x : times) {
			System.out.println(x + ":" + x.getMeaning());
		}		
	}

}
