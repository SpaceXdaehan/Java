package edu.java.date;

// java.lang.String, java.lang.System, ... -> import문장 생략

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {

	public static void main(String[] args) {
		// Java 8 버전에서 새로 추가된 날짜/시간 관련 클래스와 매서드
		LocalDate now = LocalDate.now();	// LocalDate 클래스의 static 메서드 호출.
		System.out.println(now);	// LoclaDate 클래스는 toString() 메서드를 override 하고 있음
		System.out.println(now.getYear());
		System.out.println(now.getMonth());		// java.time.Month.enum 상수를 리턴.
		System.out.println(now.getMonthValue()); // 월을 숫자(int)로 리턴.
		System.out.println(now.getDayOfWeek());	// java.time.DayOfWeek enum 상수를 리턴.
		System.out.println(now.plusDays(7));
		System.out.println(now.plusWeeks(1));
		
		LocalDate date = LocalDate.of(2023, 2, 28);
		System.out.println(date);

		LocalDateTime now2 = LocalDateTime.now();
		System.out.println(now2);
		System.out.println("Hour = " + now2.getHour());
		
		// Timestamp: 1970 - 01 - 01 00:00:00를 기준으로 1/1000초(1 milli-second)마다 
		// 1씩 증가하는 정수를 기반으로 날짜와 시간 정보를 저장하는 클래스.
		// LocalDataTime 객체를 Timestamp 타입 객체로 변환:
		Timestamp ts = Timestamp.valueOf(now2);
		System.out.println(ts);
		System.out.println(ts.getTime());
		
		// Timestamp 객체를 LocalDateTime 타입 객체로 변환:
		LocalDateTime dt = ts.toLocalDateTime();
		System.out.println(dt);
	}

}
