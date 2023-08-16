package edu.java.list01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 리스트(list)의 특징:
 * 1. 한가지 타입의 값들을 여러개 저장할 수 있는 데이터 구조체.
 * 2. 값들을 저장하는 순서가 중요 - index를 가지고 있음.
 * 3. 값들을 저장할 때마다 인덱스는 자동으로 증가. - 배열과는 다르게 저장용량이 자동으로 증가.
 * 4. 중간에 있는 값을 삭제하면 인덱스는 자동으로 재배열됨.
 * 5. 같은 값을 여러번 저장할 수 있음. -> Set과 다른 점.
 * 
 * ArrayList의 특징:
 * 1. 배열(array)을 사용하는 리스트.
 * 2. 데이터를 저장(add)하거나 삭제(remove)할 때 속도가 느림.
 * 3. 데이터를 검색(get)할 때 속도가 빠름.
 * 
 * LinkedList의 특징:
 * 1. linked list 알고리즘을 사용한 리스트.
 * 2. 데이터를 저장하거나 삭제할 때 속도가 빠름.
 * 3. 데이터를 검색할 때 속도가 느림.
 * 
 * collection<E>
 * |__ List<E>
 * 	  |__ ArrayList<E>, LinkedList<E>, ...
 * 
 *
 */

public class ListMain01 { 

	public static void main(String[] args) {
		// 문자열을 저장하는 ArrayList 객체를 생성.
		// ArrayList <저장할   타입> 변수이름 = new ArrayList<>();
		// 생성자 호출에서는 리스트의 원소 타입을 생략해도됨.
		ArrayList<String> languages = new ArrayList<>();	// new ArrayList<String>();
		
		System.out.println("리스트 크기: " + languages.size());
		System.out.println("리스트 내용: " + languages);	// Array메서드는 toString()메서드가 override되어 있음.
		
		
		// 리스트에 원소를 추가: add()메서드를 이용
		languages.add("Java");
		languages.add("Sql");
		languages.add("Html");
		languages.add("python");
		
		System.out.println("리스트 크기: " + languages.size());
		System.out.println(languages);
		
		// 리스트에서 인덱스 위치의 원소를 리턴: get(int index)
		System.out.println(languages.get(0));	// 인덱스는 0부터 시작.(array배열과 동일)
		System.out.println(languages.get(1));
		
		for (int i = 0; i < languages.size(); i++) {
			System.out.println(languages.get(i) + " ");
		}
		System.out.println();
		
		// remove(Object o): 리스트에서 처음 등장하는 원소를 찾아서 삭제.
		// remove(int index i): 리스트에서 인덱스 위치에 있는 원소를 삭제.
		languages.remove("Java");
		System.out.println(languages);
		
		languages.remove(0);
		System.out.println(languages);
		System.out.println();
		
		// 향상된 for 구문(for-each): for (변수 선언 : 리스트 이름) {...반복할 이름}
		for (String s : languages) {
			System.out.println(s + " ");
		}
		System.out.println();
		
		// Iterator<E> 객체를 사용한 리스트 원소들 반복.
		Iterator<String> itr = languages.iterator();	// Iterator 객체 생성.
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

		
	}

}
