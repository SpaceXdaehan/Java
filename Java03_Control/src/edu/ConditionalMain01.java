package edu.java.conditional01;

public class ConditionalMain01 {

    public static void main(String[] args) {
        // 조건문(conditional statement)
        
        int number = -10;
        if (number > 0) {
            // 조건식이 참일 때 실행할 문장(들).
            System.out.println("양수"); 
        }
        
        if (number % 2 == 0) {
            // 짝수일 때 실행할 문장
            System.out.println("짝수");
        } else {
            // 홀수일 때 실행할 문장
            System.out.println("홀수");
        }
        
        if (number > 0) {
            // (1) 양수인 경우 실행할 문장.
            System.out.println("양수입니다.");
        } else if (number < 0) {
            // (2) 음수인 경우 실행할 문장.
            System.out.println("음수입니다.");
        } else {
            // (3) 양수도 아니고, 음수도 아닌 경우 실행할 문장.
            System.out.println("영입니다.");
        }
        
        System.out.println("=== 프로그램 끝 ===");

    }

}
