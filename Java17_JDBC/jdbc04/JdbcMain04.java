package edu.java.jdbc04;

import static edu.java.jdbc.model.Blog.Entity.*;
import static edu.java.jdbc.oracle.OracleConnect.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

public class JdbcMain04 {
	
	public static void main(String[] args) {
		
		// 과제 JDBC delete:
		// delete from BLOGS where ID = ?
	
		Scanner scanner = new Scanner(System.in);
		Connection con = null;
		PreparedStatement stmt = null;
		
				
		try {
			DriverManager.registerDriver(new OracleDriver());
			
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			
			String sql = String.format("DELETE FROM %s BLOGS WHERE %s = ?");
			System.out.println(sql);
			
			stmt = con.prepareStatement(sql);
			
			System.out.println("삭제할 행 번호를 입력하세요");
			int id = Integer.parseInt(scanner.nextLine());
			
			stmt.setInt(1, id);
			int result = stmt.executeUpdate();
			System.out.println(result + "개 행이 삭제되었습니다");
						
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// 리소스 해제
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}
