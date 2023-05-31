package edu.java.conditional05;

import java.util.Random; // java.util 패키지의 Random 타입을 (변수 선언에서) 사용.

public class ConditionalMain05 { 

    public static void main(String[] args) {
        // 난수(random number) 만드는 방법:
        Random random = new Random(); // Random 타입의 변수를 선언하고 초기화.
        int x = random.nextInt(5); // 0 이상 5 미만의 정수 난수를 만듦.
        System.out.println("x = " + x);
        
        int y = random.nextInt(5); 
        System.out.println("y = " + y);
        
        // int 타입의 bigger 변수에 x와 y 중에서 더 큰 수를 저장하고 출력.
        int bigger = 0;
        if (x > y) {
            bigger = x;
        } else {
            bigger = y;
        }
        System.out.println("bigger = " + bigger);
        
        // 삼항 연산자
        int bigger2 = (x > y) ? x : y;
        System.out.println("bigger2 = " + bigger2);
        
        // int 타입의 diff 변수에 x와 y의 차이(|x - y|)를 저장.
        int diff = 0;
        if (x > y) {
            diff = x - y;
        } else {
            diff = y - x;
        }
        System.out.println("diff = " + diff);
        
        // 삼항 연산자
        int diff2 = (x > y) ? (x - y) : (y - x);
        System.out.println("diff2 = " + diff2);
         
        // 10 이하의 정수 난수를 만들어서 변수 number에 저장.
        // String 타입 변수 evenOrOdd에 number가 짝수이면 "짝수", 홀수이면 "홀수" 문자열을 저장.
        int number = random.nextInt(11);
        System.out.println("number = " + number);
        String evenOrOdd = ""; // 문자열(String) 타입의 변수를 선언하고 초기화.
        if (number % 2 == 0) {
            evenOrOdd = "짝수";
        } else {
            evenOrOdd = "홀수";
        }
        System.out.println(evenOrOdd);
        
        String evenOrOdd2 = (number % 2 == 0) ? "짝수" : "홀수";
        System.out.println(evenOrOdd2);
         
    }

}
