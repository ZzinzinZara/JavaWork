package _01_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T10_exception {

	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			
			System.out.printf("정수 세 개 입력 >> \n");
			int sum=0;
			int arr[] = new int[3];
			for(int i=0;i<3;i++) {
				arr[i] = s.nextInt();
				sum += arr[i];
			}
			arr[3] = 5;
			System.out.printf("합계: %s\n",sum);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.printf("배열의 범위를 넘어섰당께\n");
		} // 최상위 클래스는 항상 맨 밑에 넣어야 됨
		catch (Exception e) { // exception은 모든 예외클래스의 최상위 클래스
			System.out.printf("예외 발생!!\n");
			e.printStackTrace();
		}
	}
}
