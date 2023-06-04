package edu.java.conditional04;

public class ConditionalMain04 {

    public static void main(String[] args) {
        // 조건문과 논리 연산자(&&, ||, !)
        
        int score = -50;
        if (score >= 0 && score <= 100) {
            System.out.println("정상 점수");
        } else {
            System.out.println("비정상 점수");
        }
        
        if (score < 0 || score > 100) {
            System.out.println("비정상");
        } else {
            System.out.println("정상");
        }
         
        boolean running = true;
        if (running) {
            System.out.println("달리는 중...");
        } else {
            System.out.println("멈춤");
        }
        
        if (!running) {
            System.out.println("멈춤");
        } else {
            System.out.println("달리는 중...");
        }

    }

}
