package edu.java.string;



public class StringMain {

	
	
	public static void main(String[] args) {
		// Ex 1. 아래의 주민번호 문자열에서 성별을 표시하는 위치의 문자만 출력.
		String ssn = "940417-1234567";	
	        char ch = ssn.charAt(7);
	        System.out.println(ch);
	        
	        String[] array = ssn.split("-");
	        System.out.println(array[0]);
	        System.out.println(array[1]);
	        System.out.println(array[1].charAt(0));
		
		// Ex 2. 아래의 문자열 배열에서 "홍길동" 문자열이 처음 등장하는 인덱스를 출력.
		// 만약에 홍길동 문자열이 배열에 없으면 -1을 출력.
		String[] names = {"오쌤", "John", "Jane", "홍길동", "허균", "홍길동"};
		System.out.println(names);
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("홍길동")) {
				System.out.println(i);
				break;
			}
		}
		 		
		
		// Ex 3. 아래의 문자열 배열에서 5글자 이상인 문자열들을 찾아서 출력.
		String[] languages = {"Java", "SQL", "HTML", "CSS","JavaScript", "Python"};
		for (String s : languages) {
            if (s.length() >= 5) {
                System.out.print(s + " ");
            }
        }
        System.out.println();
	
		
		// Ex 4. 아래의 문자열 배열에서 대소문자 구별 없이 "est"가 포함된 문자열들을 찾아서 출력.
		String[] tests = {"TEST", "test", "TeSt", "tEST", "테스트"};
		System.out.println("TEST".toLowerCase());
		System.out.println("test".toUpperCase());
		System.out.println("test".contains("est"));
		for (String s : tests) {
			if (s.toLowerCase().contains("est")) {
				System.out.print(s + " ");				
			}
		}
		System.out.println();
		
		
		// Ex 5. 아래의 "YYYY-MM-DD"형식의 날짜 문자열에서 연/월/일 정보를 int타입 변수에 저장하고 출력.
		String date = "2023-03-22";
		String[] dateStrings = date.split("-");
		int year = Integer.parseInt(dateStrings[0]);
		int month = Integer.parseInt(dateStrings[1]);
		int day = Integer.parseInt(dateStrings[2]);
		
		System.out.println("year = " + year);
		System.out.println("month = " + month);
		System.out.println("day = " + day);
		
		
		
	}

}
