package edu.java.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
		// 가위바위보 게임
        // 가위-0, 바위-1, 보-2

        // 컴퓨터의 가위/바위/보는 (정수) 난수로 만듦.
        Random random = new Random();
        int computer = random.nextInt(3);

        // 사용자는 콘솔창에서 키보드로 가위/바위/보에 해당하는 정수를 입력.
        System.out.println("가위/바위/보 게임");
        System.out.println("-----------------");
        System.out.println("[0] 가위");
        System.out.println("[1] 바위");
        System.out.println("[2] 보");
        System.out.println("-----------------");
        System.out.print("선택>>>");

        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();

        // print(computer : user)
        System.out.println("computer(" + computer + ") : user(" + user + ")");

        // TODO: 누가 이겼는 지 결과를 출력하세요.
        // 방법 2
        
      if (user == computer) {
    	  System.out.println("비김");
      }	else if (user == 0) {
    	  if (computer == 1) {
    		  System.out.println("컴퓨터 승");    		  
    	  }	else {
    		  System.out.println("사용자 승");    		      		  
    	  }
      } else if (user == 1) {
    	  if (computer == 0) {
    		  System.out.println("사용자 승"); 
    	  }	else {
    		  System.out.println("컴퓨터 승");
    	  }
      }	else {
    	  if (computer == 0) {
    		  System.out.println("컴퓨터 승");
    	  }	else {
    		  System.out.println("사용자 승");
    	  }
      }
        
      // 방법 3
      if (user == computer) { // 비긴 경우 (공통된 조건을 한번에 묶음)
    	  System.out.println("비김");
      }	else if ((user == 0 && computer == 2) 
    		  || (user == 1 && computer == 0) 
    		  || (user == 2 && computer == 1)) {
    	  System.out.println("사용자 승");
      }	else { // 사용자가 진 경우 (컴퓨터 이긴 경우)
    	  System.out.println("컴퓨터 승");
      }
      
      // 방법 4
      
      
      
      
	}

}
