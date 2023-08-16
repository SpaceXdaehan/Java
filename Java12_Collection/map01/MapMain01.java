package edu.java.map01;

import java.util.HashMap;
import java.util.Set;

/**
 * Collection<E> E = Element(원소타입이라는 뜻)
 * |__ List<E>, Set<E>, ...
 * List, Set의 공통점: 한가지 타입의 객체들을 여러개 저장할 수 있는 데이터 타입.
 * List: 인덱스가 있음. 저장하는 순서가 중요(add를 호출할 때 마다 인덱스는 자동 증가), 중복된 값을 저장할 수 있음. 
 * Set: 인덱스가 없음. 저장할 때마다 저장되는 인덱스가 없기 때문에 중복된 값을 저장할 수 없음.
 * 
 * Map<K, V> 두개의 타입을 이용해서 두개의 타입을 알아야됨
 * |__ HashMap<K, V>, Tree<K, V>
 * Map: 키(key)와 값(value)의 쌍으로 구성된 데이터를 저장하는 데이터 타입.
 * 	(예) 1-지대한 (키 = 숫자(정수타입) 값 = 이름(문자열타입)) 
 *  (1) Map에서 Key의 역할은: 중복된 값을 가질 수 없고 연속된 값을 가질 필요는 없음.
 *  리스트에서 인덱스의 역할을함(데이터를 저장하거나 검색하거나 수정하거나 삭제할 때 값을 찾기 위한 용도).
 *  (2) Value: 중복된 값을 가질 수 있음.
 *  (3) HashMap: 검색을 빠르게 할 수 있는 Map.
 *  (4) TreeMap: 정렬을 빠르게 할 수 있는 Map.
 *  
 */

public class MapMain01 {

	public static void main(String[] args) {
		// 정수를 Key로 하고 문자열을 Value로 하는 HashMap변수 선언하고 초기화
		HashMap<Integer, String> students = new HashMap<>();
		
		// put(key, value): Map에 key-value 쌍의 데이터를 저장.
		students.put(1, "지대한");
		students.put(2, "거북이");
		students.put(3, "김도현");
		students.put(4, "한지민");
		
		System.out.println("map size = " + students.size());
		System.out.println(students);
		System.out.println();
		
		System.out.println(students.get(1));
		System.out.println(students.get(5)); 	// get(key): key에 해당하는 value를 리턴. key에 맵핑된 value가 없으면 null을 리턴.
		System.out.println();
		
		// getOrDefault(key, defaultValue)
		// key에 매핑된 value를 리턴 key에 매핑된 value가 없으면 defaultValue를 리턴.
		System.out.println(students.getOrDefault(3, "지대한"));
		System.out.println(students.getOrDefault(7, "지대한"));
		System.out.println();
		
		
		// remove(key): key에 매핑된 key-value 원소를 삭제.
		students.remove(3);
		System.out.println("map size = " + students.size());
		System.out.println(students);
		System.out.println();
		
		System.out.println(students.keySet());
		System.out.println();

		// put(key, value):
		// (1) Map에 key가 존재하지 않으면 key-value 데이터를 저장.
		// (2) Map에 key가 존재하면, key에 매핑된 value를 변경.
		students.put(1, "DaeHan Ji");
		System.out.println(students);
		System.out.println();
		
		// Map에서 향상된 for문장을 사용하는 방법:
		Set<Integer> keySet = students.keySet();	// (1)Map의 key들로만 이루어진 set을 만듫.
		for (Integer k : keySet) {		// (2) key들을 처음부터 끝까지 순회하면서
			System.out.println(k + " : " + students.get(k));	// (3) key에 매핑된 value를 찾음.
		}
			
		

	}

}
