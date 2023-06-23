package edu.java.loop08;

public class LoopMain08 {

	public static void main(String[] args) {
		// 구구단 2단은 2x2까지, 3단은 3x3까지, ........, 9단은 9x9까지 출력.
		for (int i = 2; i < 10; i++) {
			System.out.println();
			System.out.println(" --- " + i + "단 ---");

			for (int y = 1; y < 10; y++) {
				System.out.printf("%d * %d = %d\n", i, y, i * y);
				if (i == y) {
					break;
				}
			}
		}
		System.out.println("\n============\n");

		for (int i = 2; i < 10; i++) {
			System.out.println(" --- " + i + "단 ---");
			for (int y = 1; y <= i; y++) {
				System.out.printf("%d * %d = %d\n", i, y, i * y);
			}
		}
		System.out.println("\n============\n");

		int a = 2;
		while (a < 10) {
			System.out.println("--- " + a + "단 ---");

			int b = 1;
			while (b < 10) {
				System.out.printf("%d * %d = %d\n", a, b, a * b);
				if (a == b) {
					break;
				}
				b++;
			}
			a++;
		}
		System.out.println("\n============\n");

		a = 2;
		while (a < 10) {
			System.out.println("--- " + a + "단 ---");

			int b = 1;
			while (b <= a) {
				System.out.printf("%d * %d = %d\n", a, b, a * b);
				b++;
			}

			a++;
		}

	}

}
