package _01_exception;

import java.util.Scanner;

public class T08_arithmetic {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.printf("나누기할 정수 두 개 입력 >> \n");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		
		try {
			System.out.printf("몫: \n",n1/n2);
			System.out.println("나머지: "+n1%n2);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없당께요~?");
			e.printStackTrace();
		}
	}

}
