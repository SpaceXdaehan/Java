package edu.java.inheritance01;

// 스마트 Tv는 Tv이다. 스마트 Tv는 기본 Tv를 확장한다.
public class SmartTv extends BasicTv {
	private String ip;
	
	public String getIp() {
		return this.ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
	}


}
