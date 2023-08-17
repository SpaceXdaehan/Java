package edu.java.file01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 입/출력 스트림 (Input/Output/ Stream): 프로그램이 값(데이터)을 입력받거나 출력하는 통로.
 *  (예) System.in: 입력 스트림 객체, System. out: 출력 스트림 객체.
 *  프로그램 <== InputStream <== 입력 장치(키보드, 마우스, 터치스크린, 파일, ...)
 *  프로그램 ==> OutputStream ==> 출력 장치(모니터, 프린터, 프로젝터, 파일, ...)
 *  
 *  프로그램 <== FileInputStream <== 파일
 *  프로그램 ==> FileOutputStream ==> 파일
 *  
 *  java.io.InputStream: 데이터를 읽어오는 통로.
 *  |__ FileInputStream: 파일에서 데이터를 읽어오는 통로.
 *     (1) FileInputStream 객체 생성
 *     (2) FIS 객체의 read 관련 메서드를 사용
 *     (3) FIS 객체를 close 해야됨.
 *     
 * java.io.OutputStream: 데이터를 내보내는(쓰는, write) 통로.
 * |__ FileOutputStream: 파일에 데이터를 쓰는 통로.
 * 	  (1) FileOutputStream 객체 생성
 * 	  (2) FOS 객체의 write 관련 메서드를 사용
 * 	  (3) FOS 객체를 close.
 */

public class FileMain01 {

	public static void main(String[] args)  {
		// 파일 이름(경로)
		String filrName = "data/hello.txt";  	// file이 저장된 폴더 이름/확장자가 텍스트인 파일
		String copyFile = "data/hello-copy.txt";	// 복사할 파일 이름(경로)
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			// 파일을 읽기 위한 스트림 객체 생성.
			in = new FileInputStream(filrName);			
			// 파일에 데이터를 쓰기 위한 스트림 객체 생성.
			out = new FileOutputStream(copyFile);
					
			while (true) {
			int read = in.read();	// 파일에서 1byte를 읽음
			if (read == -1) {	// 파일 끝 (EOF, end of file)에 도달한 경우
				break;	// 반복문 종료
			}
			// System.out.print((char) read);
			out.write(read);	// 파일에 1byt를 씀.
			}		
			System.out.println("파일 복사 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();		// FileInputStream을 닫음 (파일을 닫음)
				out.close();	// FileOutputStream을 닫음 (파일을 닫음)
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	

}
