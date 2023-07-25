package edu.java.class07;

public class Score {
	// 필드 - 객체의 속성(데이터)
	int java; // java 과목 점수
	int sql; // sql 과목 점수
	int html; // html 과목 점수
	
	// 생성자 - 객체 생성 & 속성 초기화
	public Score() {
		
	}
	
	public Score(int java, int sql, int html) {
		this.java = java;
		this.sql = sql;
		this.html = html;
	}
	
	// 메서드 - 객체 기능 
	// (1) printScore - 세 과목 점수 출력
	// (2) getTotal - 세 과목의 총점 리턴
	// (3) getAverage - 세 과목의 평균(double) 리턴
	
	public void printScore() {		
		System.out.println("Java: " + this.java);
		System.out.println("Sql " + this.sql);
		System.out.println("Html " + this.html);
		
	}
	
	public int getTotal() {
		return this.java + this.sql + this.html;
	}
	
	public double getAverage() {
		return (double) getTotal() / 3;
	}
	
	
	
	
	
}
