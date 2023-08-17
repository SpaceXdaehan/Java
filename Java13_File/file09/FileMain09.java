package edu.java.file09;

import java.io.File;

public class FileMain09 {

	public static void main(String[] args) {

		// 파일, 폴더(디렉토리) 생성, 삭제, 관리
		
		// System.getProperty(key): Java Runtime이 실행 중인 컴퓨터의 여러가지 시스템 정보들을 리턴.
		String cwd = System.getProperty("user.dir");
		System.out.println(cwd); 		// CWD (Current Working Directory, 현재 작업 디렉토리): 현재 프로그램이 실행되는 위치.
		
		/**
		 * 절대 경로(absolute path):
		 * 	시스템의 루트 (C:\, D:\, ...)부터 파일 또는 폴더가 있는 위치를 찾아가는 방식.
		 * 	(예) C:\workspaces\lab-java\Java13_File\data\encoding-ansi.txt ==> 절대 경로
		 * 
		 * 상대 경로(relative path):
		 * 	현재 작업 디렉토리(CWD)를 기준으로 파일 또는 폴더가 있는 위치를 상대적으로 찾아가는 방식.
		 * 	(예) data\encoding-ansi.txt
		 * 	. - 현재 디렉토리(폴더)
		 * 		(예).\data\encoding-ansi.txt
		 * .. - 상위 디렉토리(폴더)
		 * 		(예) ..\Java11_MVC\src
		 * 
		 * 파일 구분자(file separator)
		 * 	 상위 폴더와 하위 폴더, 폴더와 파일을 구분하기 위한 문자.
		 * 	 MS-Windows - \ (backslash) 사용
		 *   MS-Windows를 제외한 다른 모든 OS - / (Slash) 를 사용
		 *   
		 *   문자열 ""안에서 backslash는 특별한 의미를 갖음(escape 문자)
		 *   "\n" - new line (줄바꿈)
		 *   "\t" - tap (탭)
		 *   문자열 안에서 출력하고싶으면 "\\" 써야됨
		 *   
		 *   
		 */
		
		// backslash가 포함된 문자열
		System.out.println("C:\\workspaces\\lab-java\\Java13_File");
		System.out.println();
		
		// 프로그램이 실행되는 OS에 따라서 자동으로 파일 구분자가 선택되도록 할 수 있음.
		String path = "data" + File.separator + "encoding-ansi.txt";
		System.out.println(path);
		System.out.println();
		
		// File 클래스: 파일(txt, jpg, mp4, ...)과 폴더(디렉토리)에 관련된 여러가지 기능들(method) 가지고 있는 클래스.
		
		// File 타입 객체 생성
		File f = new File(path);
		System.out.println("경로: " + f.getPath());
		// -> 파일 객체가 생성될 때 상대 경로로 생성된 경우 getPath() 메서드는 상대 경로를 리턴.
		// -> 파일 객체를 생성할 때 절대 경로로 생성하면 getPath() 메서드는 정대 경로를 리턴함.		
		System.out.println("절대 경로: " + f.getAbsolutePath());
		System.out.println("이름: " + f.getName());		// 파일 또는 폴더의 이름을 찾아서 출력
		System.out.println("존재? " + f.exists());		// 파일이 있는지 없는지 
		System.out.println("파일? " + f.isFile());		// 파일인지 아닌지
		System.out.println("폴더? " + f.isDirectory());	// 디렉토리인지 아닌지
		System.out.println("크기 " + f.length());		// -> byte 단위로 출력
		System.out.println();
		
		
		// data 폴더의 내용(하위, 폴더 파일들)을 출력
		File dataDir = new File("data");
		System.out.println(dataDir.getAbsolutePath());
		File[] files = dataDir.listFiles();		// 폴더의 하위 폴더와 파일들의 배열을 리턴.
		
		for (File file : files) {
			System.out.println(file.getName());
			String fileName = file.getName(); 	// 파일 또는 폴더 이름
			String info = null; 	// 화면에 출력할 정보
			
			if (file.isFile()) {
				info = fileName + "\t" + file.length() + "Byte";
			} else {		// 파일이 아닌 경우 (폴더인 경우)
				info = fileName + "\t<Dir>";
			}
			System.out.println(info);
		}
		

		// 새 폴더 생성: (1) File 객체 생성. (2) 폴더가 없으면, mkdir() 메서드 호출.
		File newFolder = new File("data", "temp"); 	// .\data\temp (현재 디렉토리에)
		if (newFolder.exists()) {		// 폴더가 이미 존재하면
			System.out.println("폴더가 이미 있습니다");
		} else {	// 폴더가 존재하지 않으면 
			newFolder.mkdir(); 	// make directory
			System.out.println("새 폴더 생성 성공");		
		}
		
		// 기존 폴더 삭제: (1) File 객체 생성. (2) 폴더가 있으면, delete() 메서드를 호출.
		if (newFolder.exists()) {
			newFolder.delete();
			System.out.println("폴더 삭제 성공");
		} else {
			System.out.println("삭제할 폴더가 없습니다.");
		}
		
		
		
		
		
		
		
	}

}
