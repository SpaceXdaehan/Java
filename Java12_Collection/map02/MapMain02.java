package edu.java.map02;

import java.util.Set;
import java.util.TreeMap;

public class MapMain02 {

	public static void main(String[] args) {
		// 문자열을 key로 하고 정수를 value로 하는 TreeMap을 선언, 초기화(객체 생성).
		TreeMap<String, Integer> menu = new TreeMap<>();
		
		menu.put("김밥", 8000);
		menu.put("라면", 5000);
		menu.put("강", 9000);
		menu.put("더덕", 702000);
		System.out.println(menu);

		System.out.println(menu.get("강"));
		System.out.println(menu.get("냉면")); 	// 메뉴판에 없는 값을 출력하면  null을 리턴해줌
		System.out.println(menu.getOrDefault("냉면", 0));	//	getOrDefault메서드는 
		
		// TreeMap은 정렬 알고리즘이 적용된 Map이기 때문에, 오름차순/내림차순 키 집합을 제공.
		Set<String> keySet = menu.keySet();
		for (String k : keySet) {
			System.out.println(k + " : " + menu.get(k));
		}
		System.out.println();
		
		Set<String> descKeySet = menu.descendingKeySet();
		for (String s : descKeySet) {
			System.out.println(s + " : " + menu.get(s));
		}
		
		
	}

}
