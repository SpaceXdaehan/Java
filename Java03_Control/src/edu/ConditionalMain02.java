package edu.java.conditional02;

public class ConditionalMain02 {

    public static void main(String[] args) {
        // 중첩 조건문: if 블록 또는 else 블록 안에서 조건문을 작성.

        int number = 123;
        if (number > 0) { // number의 값이 0보다 크다면
            System.out.println("양수");
        } else { // 그렇지 않다면(number의 값이 0보다 크지 않다면)
            if (number < 0) {
                System.out.println("음수");
            } else {
                System.out.println("영");
            }
        }

    }

}
