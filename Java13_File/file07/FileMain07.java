package edu.java.file07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Random;

public class FileMain07 {

	public static void main(String[] args) {
		// 1. ArrayList<Student> 학생타입의 원소를 갖는 객체 생성
		// 2. 1,000,000개의 Student 객체를 리스트에 저장. -Random 클래스 이용
		// 3. 리스트를 students.dat 파일에 (직렬화 해서) 작성.
		
	
		Random random = new Random();
		ArrayList<Student> students = new ArrayList<>();
				
		for (int i = 0; i < 1_000_000; i++) {
//			int y = random.nextInt(99);
//			System.out.println("y = " + y);
			Score score = new Score(random.nextInt(101), random.nextInt(101), random.nextInt(101));
			Student stu = new Student( random.nextInt(), "Name_" +  random.nextInt(), score);
			// Student s = new Student(i, random.nextInt(99), random.nextInt(99), random.nextInt(99));
			students.add(stu);		
		}
		System.out.println();
		System.out.println();
		
		String file = "data/students.dat";
		
		try ( FileOutputStream out = new FileOutputStream(file);
				BufferedOutputStream bout = new BufferedOutputStream(out);
				ObjectOutputStream oout = new ObjectOutputStream(bout);
				){
			
			long start = System.currentTimeMillis();
			oout.writeObject(students);
			long end = System.currentTimeMillis();
			System.out.println("write 경과 시간" + (end - start) + "ms");
		
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
		
		
		// 4. 파일에서 데이터를 읽어서 역직렬화 -> 쓰기전 데이터와 역직렬화한 읽은 데이터를 확인
		try (
				FileInputStream in = new FileInputStream(file);
				BufferedInputStream bin = new BufferedInputStream(in);
				   ObjectInputStream oin = new ObjectInputStream(bin);){
			
			long start = System.currentTimeMillis();
			ArrayList<Student> result = (ArrayList<Student>)oin.readObject();  		// Object를 읽기 위해 ArreayList로 케스팅 해줌
			long end = System.currentTimeMillis();
			System.out.println("read 경과 시간" + (end - start) + "ms");
			
			
			System.out.println("students = " + students.size());
			int index = random.nextInt(1_000_000);
			System.out.println("students = " + students.get(index));
			
			System.out.println("result size = " + result.size());
			System.out.println("result size = " + result.get(index));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
