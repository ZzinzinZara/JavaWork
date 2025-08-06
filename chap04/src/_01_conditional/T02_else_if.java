package _01_conditional;

import java.util.Scanner;

public class T02_else_if {

	public static void main(String[] args) {
		int n2= 100;
		if (n2 > -1) {
			System.out.printf("양수입니다\n");
		} else {
			System.out.printf("음수입니다\n");
		}
		
		// 사용자로부터 입력 받아 짝수, 홀수 구분
		System.out.printf("정수를 입력하세요 >> ");
		Scanner s = new Scanner(System.in);
		int score = s.nextInt();
		if(score%2==0) {
			System.out.printf("짝수\n");
		} else {
			System.out.printf("홀수\n");
		}	
	}

}
