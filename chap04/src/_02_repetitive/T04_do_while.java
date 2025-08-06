package _02_repetitive;

import java.util.Scanner;

public class T04_do_while {

	public static void main(String[] args) {
		// 조건을 나중에 확인하므로 무조건 한 번은 실행
		
		boolean b1 = false;
		while(b1) {
			System.out.printf("while문\n");
		}
		
		do {
			System.out.printf("do-while문\n");
		} while(b1);
		System.out.printf("=========================\n");
		
		Scanner s = new Scanner(System.in);
		System.out.printf("1. for문 설명, 2. while문 설명, 3. do-while문 설명 >> ");
		int n = s.nextInt();
		do {
			switch(n){
			case 1: System.out.printf("정해진 조건이 있을 때 사용\n"); break;
			case 2: System.out.printf("정해진 조건이 없을 때 사용\n"); break;
			case 3: System.out.printf("한 번은 실행 할 문장이 있을 때 사용\n"); break;
			}
		} while(n == 0);
		
		
		
		System.exit(1);
		s.close();
	}

}
