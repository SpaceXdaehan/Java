package edu.java.inheritance01;

// 스마트 TV는 TV이다.
// TV: 상위 클래스, 스마트TV: 하위 클래스

public class BasicTv {
	// 필드
	private boolean powerOn;
	private int channel;
	private int volume;

	// 메서드
	public void powerOnOff() {
		if (powerOn) {
			powerOn = false;
			System.out.println("TV OFF");			
		} else {
			powerOn = true;
			System.out.println("TV ON");
		}
	}
	
	public void printInfo() {
		System.out.printf("TV powerOn=%s, channel=%d, volume=%d\n",
				this.powerOn, this.channel, this.volume);
	}
	
	
	
	
	

}
