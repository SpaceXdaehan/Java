package edu.java.file06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import edu.java.file05.Product;

public class FileMain06 {

	public static void main(String[] args) {
		
		// Product 타입 객체를 1,000,000개 생성하고 ArrayList에 저장.
		ArrayList<Product> products = new ArrayList<>();
		for (int i = 0; i < 1_000_000; i++) {
			Product p = new Product(i, "NAME_" + i, i * 10);
			products.add(p);
		}
		System.out.println("size = " + products.size()); 
		System.out.println(products.get(999)); 
		
		// 1,000,000개의 원소를 갖는 리스트를 (직렬화해서)파일에 씀.
		String file = "data/product-list.dat";
		
		FileOutputStream out = null;
		BufferedOutputStream bout = null;
		ObjectOutputStream oout = null;
		try {
			out = new FileOutputStream(file);		// 파일 쓰기 통로
			bout = new BufferedOutputStream(out);	// 메모리(RAM) 쓰기 통로
			oout = new ObjectOutputStream(bout);
			
			long start = System.currentTimeMillis();	// 쓰기 시작 시간
			oout.writeObject(products);		// 리스트를 직렬화
			long end = System.currentTimeMillis();	// 쓰기 종료 시간
			
			System.out.println("write 경과 시간:" + (end - start) + "ms");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oout.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// 파일에 저장된 데이터를 읽어서 ArrayList<Product> 타입으로 역직렬화. 
		// 리소스 생성 close가 자동으로 호출
		try (FileInputStream in = new FileInputStream(file);
				BufferedInputStream bin = new BufferedInputStream(in);
				 ObjectInputStream oin = new ObjectInputStream(bin);) {
			
			long start = System.currentTimeMillis();
			ArrayList<Product> result = (ArrayList<Product>)oin.readObject();
			// 데이터를 읽고 직렬화
			long end = System.currentTimeMillis();		// 읽기 종료 시간
			System.out.println("read 경과 시간" + (end - start) + "ms");
			System.out.println("size = " + result.size());
			System.out.println(result.get(999));
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
