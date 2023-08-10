package edu.java.interface01;

public class MariaDBModule implements DatabaseModule {

	@Override
	public int select() {
		System.out.println("MariaDB select()");
		return 0;
	}

	@Override
	public int insert(String strVal, int intVal) {
		System.out.printf("MariaDB insert(%s, %d)\n", strVal, intVal);
		return 0;
	}

}
