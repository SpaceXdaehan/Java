package edu.java.file02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileMain02 {

	public static void main(String[] args) {
		// 대용량 파일 복사:
        // data/ratings.dat 파일을 읽고 data/ratings-copy.dat 파일에 복사.
        // (1) read(), write(int b) 사용할 때 복사 시간 측정.
        // (2) read(byte[] b), write(byte[] b, int off, int len) 사용할 때 복사 시간 측정.
        
        String origin = "data/ratings.dat"; 		// 원본 파일 경로, 이름
        String dest = "data/ratings-copy.dat"; 		// 복사할 파일 경로, 이름
        
        FileInputStream in = null;		 // 파일 읽기 통로
        FileOutputStream out = null;	 // 파일 쓰기 통로
        try {
            in = new FileInputStream(origin);
            out = new FileOutputStream(dest);
            
            long start = System.currentTimeMillis();	// 파일 복사 시작 시간.
            // 파일 복사
            while (true) {
            	// int read = in.read();	// (1) 파일에서 1byte 읽기.
            	byte[] buffer = new byte[4 * 1024];		// 4,096 Byte = 4KB
            	int read = in.read(buffer);		// (2) 파일에서 1바이트씩 읽기.
            	// buffer: 파일에서 읽은 내용(데이터)을 저장하기 위한 배열.
            	// 리턴 값 read: 파일에서 실제로 읽은 바이트 수.
            	
    
            	if (read == -1) {		// 파일 끝 (EOF)에 도달하면
            		break;				// 읽은 byte가 -1이면 반복문을 종료
            	}
            	
            	// out.write(read);		// (1) 파일에서 1byte 쓰기.
            	
            	out.write(buffer, 0, read); 		// (2) 파일에 4KB씩 쓰기.
            	// buffer: 파일에 쓸 데이터를 가지고 있는 (byte[])타입 배열.
            	// 0: 배열 buffer에서 읽기 시작할 인덱스.
            	// read: 파일에 쓸 바이트 수.
            	
            			
            }
            
            long end = System.currentTimeMillis();		// 파일 복사 종료 시간.
            long elapsedTime = end - start; 			// 복사 경과 시간
			System.out.println("복사 경과 시간:" + elapsedTime + "ms");
            
            
        } catch (Exception e) {
            e.printStackTrace(); 		// 예외 이름, 내용, 발생한 코드 위치를 콘솔창에 출력.
        } finally {
            try {
                in.close();
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

		
		
		
	}

}
