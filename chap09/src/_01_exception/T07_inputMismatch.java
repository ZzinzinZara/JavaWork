package _01_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T07_inputMismatch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.printf("정수 세 개 입력 >> \n");
		int sum=0;
		int arr[] = new int[3];
		for(int i=0;i<3;i++) {
			try {
				arr[i] = s.nextInt();
				sum += arr[i];
			} catch(InputMismatchException e) {
				System.out.printf("정수가 아닙니다\n");
				s.next();
				i--;
			}
		}
		System.out.printf("합계: %s\n",sum);
		
	}

}
