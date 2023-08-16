package edu.java.map03;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapMain03 {

	public static void main(String[] args) {
		 // 단어 개수 세기(word counting):
         // 문자열에 등장하는 단어를 key로 하고, 그 단어의 등장 횟수를 value로 하는 Map을 만들고 출력하세요.
         // 결과> {하늘=3, 땅=2, sky=2}
        String sentence = "하늘 땅 하늘 땅 하늘 sky sky";
        
        // 문자열을 공백(" ")을 기준으로 자름.
        String[] words = sentence.split(" ");
        
        // 단어(key)- 빈돗수(value) 저장하는 Map 변수를 선언, 초기화(객체 생성)
        HashMap<String, Integer> wordCounts = new HashMap<>();              
        
        for (String w : words) {	// 배열의 첫번째 원소부터 마지막 원소까지 순서대로 반복하면서 
        	// System.out.println(w);
        	
        	Integer count = wordCounts.get(w);	// 배열의 단어 w에 매핑된 값(빈돗수)를 찾음.
        	if(count == null) {	// 단어에 매핑된 빈돗수가 없을 때 
        		wordCounts.put(w, 1);
        	} else {	// 단어에 매핑된 빈돗수가 있을 때 
        		wordCounts.put(w, count + 1);
        	}
        	System.out.println(wordCounts);
        }
        
        HashMap<String, Integer> wordCount2 = new HashMap<>();
        for (String w : words) {
        	Integer count = wordCount2.getOrDefault(w, 0);
        	wordCount2.put(w, count + 1);
        }
        System.out.println(wordCount2);
        
        		
 
	}

}
