package edu.java.class08;

import java.util.Scanner;

import java.util.Random;

/**
 * 은행 계좌 클래스.
 * 필드: 계좌번호, 잔액.
 * 메서드: 입금, 출금, 이체, 정보 출력.
 */

public class Account {
	// field
    int accountNo; // 계좌번호
    double balance; // 잔고
    
    // TODO: argument 2개를 갖는 생성자
    public  Account(int accountNo, double balance) {
    	this.accountNo = accountNo;
    	this.balance = balance;
    }
    
    /**
     * 입금(deposit)
     * 
     * @param amount 입금액(double).
     * @return 입금 후 잔액.
     */
   
    public double deposit(double amount) {
    	this.balance += amount;
    	return this.balance;
    }
    
    /**
     * 출금(withdraw)
     * 
     * @param amount 출금액(double).
     * @return 입금 후 잔액.
     */
   
    public double withdraw(double amount) {
    	this.balance -= amount;
    	return this.balance;
    }
    
    /**
     * 이체(transfer).
     * 
     * @param to 이체할 은행 계좌 객체(Accout 타입 객체).
     * @param amount 이체할 금액(double).
     * @return true.
     */
    // 클래스 - 변수를 생성(선언)할 때 사용하는 타입 이름으로 생각
   public boolean transfer(Account to, double amount) {
//	   this.balance -= amount; // (1)
//	   to.balance += amount;
	   
	   this.withdraw(amount);
	   to.deposit(amount);
	   return true;
   }
    	
    /**
     * 정보 출력(printInfo).
     * 계좌 번호와 잔고를 출력.
     */
    
    public void printInfo() {
    	System.out.printf("Account: %d, Balance: %f\n ", this.accountNo, this.balance);
    	
    }
  
    
    
}
