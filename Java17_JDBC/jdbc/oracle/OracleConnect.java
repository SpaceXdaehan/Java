package edu.java.jdbc.oracle;

public interface OracleConnect {
	// 인터페이스의 필드는 public static final만 가능. 생략 가능.
	
	// 오라클 데이터베이스 서버 접속 주소(IP, port, SID)
	// localhost: 현재 개인 PC.
	// localhost자리에 192.168.20.2 개인 PC IP주소를 넣어도 됨.
	String URL = "jdbc:oracle:thin:@192.168.20.2:1521:xe";
	
	// 오라클 데이터베이스 서버 계정
	String USER = "scott";
	
	// 오라클 데이터베이스 계정 비밀번호
	String PASSWORD = "tiger";
	
}
