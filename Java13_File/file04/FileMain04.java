package edu.java.file04;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 
 * FIS, FOS와 같은 클래스의 객체들은 사용한 이후에 반드시 close()메서드를 호출해서 리소스를 해제해야만 한다.
 * try-catch-finally 구문에서는,
 * 리소스 생성은 try 블록에서 하고, 리소스 해제는 finally 블록에서 작성.
 * 실수로 close 메서드를 호출하지 않는 경우들이 생길 수 있음.
 * 리소스만 생성하면 close 메서드를 자동으로 호출해 주는 문법이 필요.
 * -> try-with-resource 구문:
 * 
 * try (리소스 생성:) {
 * 	 정상적인 상황에서 실행한 코드 블록;
 * } catch (Exception타입 변수 선언) {
 * 	 예외 상황을 처리하는 코드 블록;
 * }
 */

public class FileMain04 {

	public static void main(String[] args) {
		// data/hello.txt 파일 복사를 try-with-resource를 사용해서 작성.
        String origin = "data/hello.txt";
        String dest = "data/hello-copy2.txt";
        
        try (   // close 메서드를 호출해야 하는 변수들만 선언, 초기화
                //-> close는 try-catch가 끝난 후 자동으로 호출.
                FileInputStream in = new FileInputStream(origin);
                FileOutputStream out = new FileOutputStream(dest);
        ) {
            while (true) {
                byte[] buf = new byte[10]; // 파일에서 읽은 내용을 저장할 byte 배열
                int read = in.read(buf);
                //-> 파일에서 읽은 내용을 배열 buf에 저장하고, 실제로 읽은 바이트 수를 리턴.
                System.out.println(read + "바이트 읽음.");
                if (read == -1) { // EOF
                    break;
                }
                
                out.write(buf, 0, read);
                //-> 배열 buf의 인덱스 0번 위치부터 길이 read만큼을 파일에 씀.
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

		
	}

}
