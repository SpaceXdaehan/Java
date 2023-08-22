package edu.java.thread01;

public class ThreadMain01 {

	public static void main(String[] args) {
		/*
		 * Thread 사용방법 1:
		 * 1. Thread를 상속하는 클래스를 선언(정의)
		 * 2. Thread 상속하는 클래스에서 run()메서드를 overrid해줘야됨 - run()메서드에서는 쓰레드가 할 일을 만들어줌
		 * 3. Thread 상속하는 클래스의 객체를 생성.
		 * 4. 생성된 객체에서 start() 메서드를 호출.
		 *    (주의) override한 run() 메서드를 직접 호출하면 쓰레드가 실행되지 않고,
		 *    start() 메서드를 호출해야 -> 쓰레드가 초기화 되고(메모리 할당, 여러가지 작업들...) -> run()메서드 실행.
		 */
		
		// main 안에서 생성된 클래스 = local, inner class 지역클래스)
		// (1) Thread를 상속하는 클래스를 선언:
		
		class MyThread extends Thread {
			// field
			private String name;
			
			// constructor
			public MyThread(String name) {
				this.name = name;
			}
				
			// method
				@Override
				public void run() {
					for (int i = 0; i < 100; i++) {
						System.out.println(i + " - " + name);
						
						try {
							sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						} // 0.1 (10 / 1000)초를 멈춤.
					}	
				}
		}
		
		// (3) Thread를 상속하는 객체 생성.
		MyThread th1 = new MyThread("쓰레드"); 
		MyThread th2 = new MyThread("오쌤"); 
		
		// 쓰레드 시작 전 시간 기록:
		long start = System.currentTimeMillis();
		
		// (4) Thread를 실행 - start()메서드 호출
		th1.start();
		th2.start();
		
		try {
			// 쓰레드가 종료할 때까지 main 쓰레드는 기다림.
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 모든 쓰레드 종료 후 시간 기록
		long end = System.currentTimeMillis();
		System.out.println("경과 시간: " + (end - start) + "ms");
		
		System.out.println("***** main 메서드 종료 *****");
	}
}
