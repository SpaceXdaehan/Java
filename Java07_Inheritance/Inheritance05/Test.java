package edu.java.inheritance05;

public class Test {
	private int x;
	protected int y;
	
	public Test(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
}

class TestChild extends Test {
	private int z;

	public TestChild(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public void printIndo() {
		System.out.printf("x=%d, y=%d, z=%d", getX(), y, z);
		// private: 자기 자신 클래스에서만 직접 접근(사용)
		// -> 상속하는 하위 클래스에서도 보이지 않음(not visibla)
		// protected: 같은 클래스 또는 상속하는 클래스에서 직접 접근(사용).
	}
	
}
