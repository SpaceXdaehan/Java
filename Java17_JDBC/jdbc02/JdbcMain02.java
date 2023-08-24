package edu.java.jdbc02;

import static edu.java.jdbc.model.Blog.Entity.*;
import static edu.java.jdbc.oracle.OracleConnect.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

public class JdbcMain02 {

	public static void main(String[] args) {
		// DB 테이블에 insert 하기:
		Scanner scanner = new Scanner(System.in);
		
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// 오라클 드라이버를 등록.
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			
			// 오라클 DB에 접속.
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			// SQL 문장 (Statement문장)을 준비
			String sql = String.format("insert into %s (%s, %s, %s) values (?, ?, ?)", 
			TBL_NAME, COL_TITLE, COL_CONTENT, COL_AUTHOR);
			System.out.println(sql);
			
			// SQL 문장을 실행할 수 있는 Statement 타입 객체 생성.
			stmt = conn.prepareStatement(sql);
			
			// 제목과 내용을 입력받기
			System.out.println("제목>>> ");
			String title = scanner.nextLine();
			System.out.println("내용>>> ");
			String content = scanner.nextLine();
			
			// SQL 문장에서 "?" 인 부분을 채우는 부분.
			stmt.setString(1, title);
			stmt.setString(2, content);
			stmt.setString(3, "지대한");
			
			// SQL 문장을 실행
			int result = stmt.executeUpdate();
			System.out.println(result + "개 행이 삽입됐습니다.");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			// 사용했던 모든 리소스 해제
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
				
			}
		}
		
		
		
	}

}
