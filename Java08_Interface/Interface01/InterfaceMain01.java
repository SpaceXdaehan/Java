package edu.java.interface01;

// 인터페이스(interface):
// 사용 목적: 팀/회사 간의 분업/협업 하기 위해서 메서드(기능)들의 프로토타입(prototype, signature)을 약속하는 것.
// 메서드를 어떻게 만들 것인지 어떻게 사용할 것인지 정의만 내리는 것
// 인터페이스가 가질 수 있는 멤버들:
//  (1) public static final 필드. 보통 필드를 선언할 때는 public static final은 생략 가능.
//  (2) public abstract 메서드. 메서드 선언할 때 보통 public abstract는 생략 가능.
// 인터페이스를 작성할 떄는 interface 키워드를 사용.
// 인터페이스는 객체를 생성할 수 없음.
// 인터페이스를 "구현"하는 클래스를 작성하고, 그 클래스의 객체를 생성함.

// import static문장: static으로 선언된 필드(변수), 메서드, 클래스 이름을 가져올 떄 사용.
import static edu.java.interface01.DatabaseModule.DB_VERSION;

public class InterfaceMain01 {

	public static void main(String[] args) {
		

		System.out.println(DB_VERSION);
		//-> import static 문장을 사용하면 DatabaseModule.DB_VERSION를 간단히 DB_VERSION으로 사용할 수 있음.
		// DatabaseModule.DB_VERSION = 2; final이기 때문에 사용불가
		// new DatabaseModule(); 인터페이스는 객체를 생성할 수 없다.
		
		// 인터페이스를 구현하고 있는 클래스의 객체는 생성할 수 있음.
		// OracleDatabaseModule db = new OracleDatabaseModule();
		// MariaDBModule db = new MariaDBModule();
		
		// 다형성: superType var = new SubType();
		// 인터페이스 이름도 구현 클래스의 상위 타입으로 사용할 수 있음.
		DatabaseModule db = new MariaDBModule();
		
		db.insert("aaa", 100);
		db.select();
		
	}

}
