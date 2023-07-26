package edu.java.class08;

import edu.java.class07.Score;

public class ClassMain08 {

	public static void main(String[] args) {
				
		 Account account1 = new Account(123456, 10000); // 계좌 생성
	        account1.printInfo(); // 계좌 정보 출력

	        double balance = account1.deposit(1000); // 1,000원 입금
	        System.out.println("balance = " + balance); // 입금 후 잔액
	        account1.printInfo();
	        
	        account1.withdraw(5000); // 5,000원 출금
	        account1.printInfo();
	        
	        Account account2 = new Account(123000, 10000); // 2번째 계좌 생성
	        account2.printInfo();
	        
	        account1.transfer(account2, 5000); // account1 계좌에서 account2 계좌로 5,000원을 이체.
	        account1.printInfo();
	        account2.printInfo();
	    
	    	
	}

}
