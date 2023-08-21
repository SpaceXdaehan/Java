package edu.java.inner02;

public class Book {
	// field
	private String title;	// 책 제목
	private String author;	// 책 저자
	private String publisher; // 책 출판사
	
	// constructor
	public Book (String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	// method
	@Override
	public String toString() {
		return String.format("Book: (title=%s, author=%s, publisher=%s)", 
				title, author, publisher);
	}
	
	
	// ============== Factory(Builder) 디자인 패턴 =============
	
	public static BookBuilder builder() {
		return new BookBuilder();
		// -> 외부 클래스는 static 내부 클래스의 private 생성자를 호출할 수 있다.
	}
	

	public static class BookBuilder {
		private String title;
		private String author;
		private String publisher;
		
		private BookBuilder() {
			
		}
		
		public BookBuilder title(String title) {
			this.title = title;
			return this;	// this: BookBuilder 타입으로 생성된 객체 (인스턴스)
		}
		
		public BookBuilder author(String author) {
			this.author = author;
			return this;
		}
		
		public BookBuilder publisher(String publisher) {
			this.publisher = publisher;
			return this;
		}
		
		public Book build() {
			return new Book(title, author, publisher);
		}
		
	}
	
	
	

}
