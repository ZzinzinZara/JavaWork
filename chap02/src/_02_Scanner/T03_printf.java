package _02_Scanner;

public class T03_printf {

	public static void main(String[] args) {
		int num1=10;
		int num2=15;
		
		double num3 = 1.0;
		
		// 10진수 출력
		System.out.printf("%d %d\n",num1,num2);
		
		// 8진수 출력
		System.out.printf("%o %o\n", num1,num2);
		
		// 16진수 출력
		System.out.printf("%x %x\n", num1,num2);
		
		// 실수형 출력
		System.out.printf("%f\n",num3);
		
		// 문자 1개 출력
		System.out.printf("%c\n",'a');
		
		// 문자열 출력
		System.out.printf("%s\n", "씨발 집 존나 가고 싶네;;");
		
		// boolean 출력
		System.out.printf("%b\n", false);
		System.out.printf("%b\n", 100>3);
		
		System.out.printf("현재는 %d년 %d이고, 우리나라의 평균 온도는 %.1f도 입니다.\n",2025,8,34.5);
		System.out.printf("이 과정의 정원은 %d명이고, 현재 %d명이 수강중입니다. %s 달성하였습니다.\n",25,19,"76%");
	}

}
