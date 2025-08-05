package _01_operation;

public class T04_logical {

	public static void main(String[] args) {
		// 논리곱과 논리합
		/*
		 * x y  논리곱(&&)	논리합(||)
		 * 0 0		0			0
		 * 0 1 		0			1
		 * 1 0		0			1
		 * 1 1		1			1
		 */
		
		int n1 = 10;
		int n2 = 20;
		
		boolean b1 = n1 > n2 && n1 < n2;
		System.out.println(b1);
		
		boolean b2 = n1 > n2 || n1 < n2;
		System.out.println(b2);
		System.out.println("=============================");
		
		// ! : not
		boolean b3 = n1 > n2;
		System.out.println(!b3);
		System.out.println(!!b3);
		
		// A: 65, a: 97
		// 대문자: 65 ~ 97
		// 소문자: 97 ~ 128
	}

}
