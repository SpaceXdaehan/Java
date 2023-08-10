package edu.java.interface01;

public interface DatabaseModule {
	// public static final 필드를 가질 수 있다.
	int DB_VERSION = 1; // public static final이 생략되어있음.
	
	// public abstract 필드를 선언할 수 있다.
	/**
	 * 데이터베이스 테이블에서 자료를 읽어서 검색하는 기능.
	 * 
	 * @return 검색된 자료의 개수(int타입으로 리턴)
	 */
	int select();	//-> public abstract 생략되어있음. (사용해도 되고 안 해도 되는데 보통 생략)
	
	/**
	 * 데이터베이스 테이블에 자료들을 저장하는 기능.
	 * @param strVal 저장할 문자열.
	 * @param intVal 저장할 정수.
	 * @return 테이블에 저장된 행(row)의 개수(int).
	 */
	int insert(String strVal, int intVal);
	
}
