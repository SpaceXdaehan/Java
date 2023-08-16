
package edu.java.set01;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Collection<E>
 *|__ List<E>
 *	 |__ ArrayList<E>, LinkedList<E>, ...
 *
 * Collection<E>
 * |__ Set<E>
 * 	  |__ HashSet<E>, TreeSet<E>, ...
 * 
 * Set의 특징:
 * 1. 중복된 값을 저장하지 않음. (예) {1,2} = {1, 2, 1, 2}
 * 2. 저장하는 순서가 중요하지 않음. 인덱스가 없음. (예) {1, 2} = {2, 1}
 * 3. 알파벳 순서데로 출력됨
 * 
 * HashSet: Hash 알고리즘 (검색을 빠르게 할 수 있는 알고리즘)을 사용한 Set.
 * TreeSet: Tree 알고리즘 (정렬을 빠르게 할 수 있는 알고리즘)을 사용한 Set.
 * 
 */
 
public class SetMain01 {

	public static void main(String[] args) {
		// String을 원소로 갖는 TreeSet 변수 선언, 객체 생성.
		TreeSet<String> set = new TreeSet<>();	// 생성자 뒤에 원소의 타입을 생략해도 됨.
		System.out.println("set size = " + set.size());
		System.out.println(set);
		
		set.add("hello");
		set.add("apple");	// TreeSet은 정렬된 형태.
		set.add("hello");	// 중복된 값은 저장되지 않음.
		set.add("zip");
		set.add("banana");
		
		System.out.println(set);	// Set은 toString을 override 하고 있음.
		
		// Set은 index를 갖지 않기 때문에 get(int index) 메서드는 제공되지 않음.
		// for 문장을 사용할 수 없음. for-each 문장과 Iterator는 사용 가능.
		for (String s : set) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		Iterator<String> itr = set.iterator();	// 오름차순 반복 도구
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		
		// TreeSet은 정렬 알고리즘이 적용된 객체이기 때문에 내림차순 반복 도구도 제공.
		Iterator<String> itr2 = set.descendingIterator();	// 내림차순 반복 도구 Tree알고리즘에만 있음 Hash에는 없음
		while (itr2.hasNext()) {
			System.out.print(itr2.next() + " ");
		}
		System.out.println();
		
		
		
				
		
	}

}
