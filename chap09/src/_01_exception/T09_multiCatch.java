package _01_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T09_multiCatch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num[] = new int[2];
		System.out.printf("나누기할 정수 두 개 입력 >> \n");
		
		try {
			num[0] = s.nextInt();
			num[1] = s.nextInt();
			System.out.printf("몫: \n",num[0]/num[1]);
			System.out.println("나머지: "+num[0]%num[1]);
			num[2] = 10;
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없당께요~?");
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.printf("정수를 입력하지 않았구만요~?\n");
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e) {
			System.out.printf("배열 범위를 넘어섰구만요~?\n");
			e.printStackTrace();
		}
	}

}
