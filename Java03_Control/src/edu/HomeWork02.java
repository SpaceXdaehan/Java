package edu.java.homework;

public class HomeWork02 {

	public static void main(String[] args) {
		   // 369 게임 출력
        /* 실행 결과
            1   2   *   4   5   *   7   8   *   10  
            11  12  *   14  15  *   17  18  *   20  
            21  22  *   24  25  *   27  28  *   *   
            *   *   *   *   *   *   *   *   *   40  
            41  42  *   44  45  *   47  48  *   50  
            51  52  *   54  55  *   57  58  *   *   
            *   *   *   *   *   *   *   *   *   70  
            71  72  *   74  75  *   77  78  *   80  
            81  82  *   84  85  *   87  88  *   *   
            *   *   *   *   *   *   *   *   *   100
         */
		
		for (int i = 1; i <= 100; i++) {
			int n = i % 10; // i를 10으로 나눈 나머지 1의 자릿수
			int n10 = i / 10; // n을 10으로 나눈 몫 10의 자릿수
			
			boolean condition1 = (n == 3) || (n == 6) || (n == 9); // 1의 자릿수가 3 또는 6 또는 9인 경우
			boolean condition2 = (n10 == 3) || (n10 == 6) || (n10 == 9); // 10의 자릿수가 3 또는 6 또는 9인 경우
			
			// 숫자를 출력할 것인지, " * "를 출력할 것인 지.
			if (condition1 && condition2) {
				System.out.print("**\t");
			} else if (condition1 || condition2) {
				System.out.print("*\t");
			}	else {
				System.out.print(i + "\t");
			}
			
			
			// 줄바꿈을 할 것인 지, 아닌 지.
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		
		
		
		
		
	}

}
