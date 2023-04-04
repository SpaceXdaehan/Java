package edu.java.scanner.test;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        // Scanner 클래스의 메서드들
        Scanner scanner = new Scanner(System.in);
        
        // nextInt(): 토큰(공백, 탭, 엔터)으로 구분된 문자들을 읽어서 정수로 변환하고 리턴.
        // nextDouble(): 토큰(공백, 탭, 엔터)으로 구분된 문자들을 읽어서 실수로 변환하고 리턴.
        // next(): 토큰(공백, 탭, 엔터)으로 구분된 문자열을 읽고 리턴.
        // -> 공백 뒤에 다른 문자열 입력들이 있으면, 
        // 입력 버퍼에 읽지 않은 문자들이 남아 있을 수 있음.
        
        // nextLine(): 엔터(줄바꿈)을 만날 때까지 입력된 모든 문자들을 읽고 리턴.
        
        System.out.print("정수 입력> "); // 100 abc
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("n = " + n);
        
        System.out.print("문자열 입력> ");
        String s = scanner.next();
        scanner.nextLine();
        System.out.println("s = " + s);
        
        System.out.print("정수 입력> ");
        n = scanner.nextInt();
        scanner.nextLine();
        System.out.println("n = " + n);

        System.out.print("실수 입력> ");
        double x = Double.parseDouble(scanner.nextLine());
        //-> 콘솔창에서 엔터가 입력될 때까지 입력된 모든 문자들을 읽고, double 타입으로 변환.
        System.out.println("x = " + x);
    }

}
