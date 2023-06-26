package edu.java.array02;

public class ArrayMain02 {

	public static void main(String[] args) {
		// 문자열 3개를 저장할 수 있는 배열 (names)을 선언, 초기화.
		String[] names = new String[3];

		// 배열 names에 문자열을 저장.
		names[0] = "이찬희";
		names[1] = "지댕댕";
		names[2] = "김다훈";

		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();

		for (String n : names) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		String[] subjects = {"Java", "Sql", "Html", "JavaScript"};
		for (String s : subjects) {
			System.out.print(s + " ");
		}
		
	}
}
