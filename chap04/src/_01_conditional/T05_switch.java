package _01_conditional;

import java.util.Scanner;

public class T05_switch {

	public static void main(String[] args) {
		// switch - case
		int n1=2;
		
		switch (n1) {
			case 1: {
				System.out.printf("1입니다\n");
				break;
			}
			case 2:{
				System.out.printf("2입니다\n");
				break;
			}
			default:{
				System.out.printf("값이 없어요\n");
			}
		}
		
		System.out.printf("=========================================\n");
		
		char ch = 'k';
		
		switch(ch) {
			case 'k':{
				System.out.printf("김씨입니다\n");
				break;
			}
			case 'l':{
				System.out.printf("이씨입니다\n");
				break;
			}
			case 'p':{
				System.out.printf("박씨입니다\n");
				break;
			}
		}
		
		System.out.printf("=========================================\n");
		
		String str = "더조은";
		switch(str) {
			case "더조은":{
				System.out.printf("집 가고 싶어요\n");
				break;
			}
			default:{
				System.out.printf("학원 가고 싶어요\n");
			}
		}
		
		System.out.printf("=========================================\n");
		
		int month =7;
		switch(month) {
			case 1:
			case 2:
			case 12: System.out.printf("겨울\n"); break;
			case 3:
			case 4:
			case 5: System.out.printf("봄\n"); break;
			case 6:
			case 7:
			case 8: System.out.printf("여름\n"); break;
			case 9:
			case 10:
			case 11: System.out.printf("가을\n"); break;
		}
		
		// 문1) 사용자로부터 연산자와 2숫자를 입력 받아 연산한 결과를 출력
		Scanner s = new Scanner(System.in);
		System.out.printf("연산자를 입력하세요 >> ");
		char ch1 = s.next().charAt(0); //String으로 받으면 "", char로 받으면 ''
		System.out.printf("숫자 두 개를 입력하세요 >> ");
		int nn1 = s.nextInt();
		int nn2 = s.nextInt();
		
		// switch version
		switch(ch1) {
			case '+': System.out.printf("%d\n",nn1+nn2); break;
			case '-': System.out.printf("%d\n",nn1-nn2); break;
			case '*': System.out.printf("%d\n",nn1*nn2); break;
			case '/': System.out.printf("%.1f\n",(double)nn1/nn2); break;
			default: System.out.printf("연산자를 잘못 입력했습니다\n");
 		}
		
		// if version
		if(ch1=='+') System.out.printf("%d\n",nn1+nn2);
		else if(ch1=='-') System.out.printf("%d\n",nn1-nn2);
		else if(ch1 =='*') System.out.printf("%d\n",nn1*nn2);
		else if(ch1=='/' ) System.out.printf("%.1f\n",(double)nn1/nn2);
		else System.out.printf("연산자를 잘못 입력했습니다\n");
	}

}
