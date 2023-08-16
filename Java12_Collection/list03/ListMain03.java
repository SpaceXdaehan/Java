package edu.java.list03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListMain03 {

	public static void main(String[] args) {
		// 문자열들을 원소로 갖는 리스트 생성과 동시에 초기화를 할 수 있음.
		// Arrays.asList(....) - 아규먼트로 전달된 값들을 원소로 갖는 리스트 객체를 생성.
		List<String> subjects = Arrays.asList("Java", "Sql", "Html", "JavaScript", "CSS", "Spring", "Servlet", "phyton");
		System.out.println(subjects);
		
		// 리스트 subjects에서 5글자 이상인 문자열들만 저장하는 리스트를 만들고 출력.
		// ArrayList<String> list = new ArrayList<>();
		// 다형성: SuperType var = new SubType();
		List<String> longWords = new ArrayList<>();
		
//      for (int i = 0; i < subjects.size(); i++) {
//      String word = subjects.get(i);
//      if (word.length() >= 5) {
//          longWords.add(word);
//      }
//  }
  
//  for (String s : subjects) {
//      if (s.length() >= 5) {
//          longWords.add(s);
//      }
//  }
			
		Iterator<String> itr = subjects.iterator();	
		while (itr.hasNext()) {
			String s = itr.next();
			if (s.length() >= 5) {
				longWords.add(s);
			}
		}
		
		// 리스트 subjects의 원소들의 글자수를 저장하는 리스트를 만들고 출력.
		List<Integer> wordLengths = new ArrayList<>();
		for (String s : subjects) {
			wordLengths.add(s.length());
		}
		System.out.println(wordLengths);
		
		
		// 정수(0, 1)을 저장하는 리스트를 생성.
		List<Integer> codes = Arrays.asList(0, 1, 0, 0, 1, 1);
		System.out.println(codes);
		
		
		// 리스트 codes의 원소가 0이면 "Male", 1이면 "Female"을 원소로 갖는 리스트를 만들고 출력.
		List<String> genders = new ArrayList<>();
		for (Integer n : codes) {
//			if (n == 0) {
//				genders.add("Male");
//			} else {
//				genders.add("Feamle");
//			}
			
			genders.add((n == 0) ? "Male" : "Female");
		}
		System.out.println(genders);
		
		
	}

}
