package edu.java.array05;

import java.util.Random;

public class ArrayMain05 {

public static void main(String[] args) {			
	int count = 10;
	int[] genderCodes = new int[count];					// int 10개를 저장할 수 있는 배열을 선언.	
	Random random = new Random();
	
	for (int i = 0; i < genderCodes.length; i++) {      // 배열에 난수 (0, 1) 10개를 저장.
		genderCodes[i] = random.nextInt(2);
		}
	for (int y : genderCodes) { 		
		System.out.print(y + " ");				
	}	
	System.out.println();									// 배열의 내용을 출력.		
	String[] genders = new String[count];					// 문자열 10개를 저장할 수 있는 배열(genders)을 선언
	
	for (int i = 0; i < genders.length; i++) {				// genderCodes의 값이 0이면 "Male", 1이면 "Female"을 문자열 배열에 저장.
		if (genderCodes[i] == 0) {
			genders[i] = "Male";
		} else { 
			genders[i] = "Female";
		}
	}	
	for (String s : genders) {							// 문자열 배열 genders의 내용을 출력.
		System.out.print(s + " ");
	}
	System.out.println();
	
	// 숫자 x, y 가 같은 지 비교: x == y 2. 두 문자열 x,y 가 같은지 비교: x.equals(y)
	// 문자열 배열에 저장된 Male의 개수, Fmale의 개수를 출력.
	int numOfMales = 0;
	int numOfFmales = 0;
	for (String s : genders) {							// 배열 genders의 원소들을 순서대로 반복하면서 
		if (s.equals("Male")) {							// 배열에서 읽은 값이 Male과 같으면
			numOfMales++;								// Male의 숫자를 1 증가
		}	else if (s.equals("Female")) {				// 배열에서 읽은 값이 Fmale과 같으면
			numOfFmales++;								// Fmale의 숫자를 1 증가
		}
	}
	System.out.println(" # of male = " + numOfMales);
	System.out.println(" # of Female = " + numOfFmales);
	
	
	
	
	
	
	
	
	}
}

