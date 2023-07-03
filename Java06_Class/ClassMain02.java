package edu.java.class02;

public class ClassMain02 {

	public static void main(String[] args) {
		// Tv 객체 사용 - Tv를 켜거나/끔, 채널 변경, 볼륨, ...
		
		// (1) Tv 객체를 생성.
		BasicTv tv1 = new BasicTv(); // 생성자 호출 -> 객체 생성.
		
		// (2) 생성된 Tv 객체(instance)의 필드 또는 메서드를 사용.
		// tv1.powerOn: 생성된 객체(=인스턴스) tv1의 필드 맴버 변수powerOn
		System.out.println("tv1 전원: " + tv1.powerOn);
		tv1.powerOnOff(); // 객체의 메서드 호출.
		
		System.out.println("tv1 채널: " + tv1.channel);
		System.out.println("tv1 음량: " + tv1.volume);
		tv1.channelDown();
		tv1.volumeUp();
	
		
		System.out.println("=================================" );
					
		BasicTv tv2 = new BasicTv();
		System.out.println("tv2 전원: " + tv2.powerOn);
		tv2.powerOnOff();
		for (int i = 0; i < 10; i++) {
			tv2.channelUp();
		}
		for (int i = 0; i < 10; i++) {
			tv2.channelDown();
		}
		
		for (int i = 0; i < 10; i++) {
			tv2.volumeUp();
		}
		for (int i = 0; i < 10; i++) {
			tv2.volumeDown();
		}
		
		
		
		
	}

}
