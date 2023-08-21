package edu.java.inner02;

public class BuilderExample01 {

	public static void main(String[] args) {
		// Book 타입의 객체 생성
		Book book1 = new Book("자바의 정석", "남궁성", "한빛미디어");
		System.out.println(book1);
		
		Book book2 = new Book("홍길동", "허균", "조선");
		System.out.println(book2);
		
		Book book3 = new Book("허균", "홍길동전", "모름");
		System.out.println(book3);
		
		Book book4 = Book.builder().author("허균").title("홍길동전").build();
		System.out.println(book4);
		
		Book book5 = Book.builder()
				.author("이순신")
				.publisher("세종대왕")
				.title("거북선")
				.build();
		System.out.println(book5);
		
		
	}

}
