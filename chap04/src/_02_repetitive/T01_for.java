package _02_repetitive;

import java.util.Scanner;

public class T01_for {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// 반복문: 원하는 개수만큼 반복 실행
		// for(초기식;조건식;증감식)
		for(int i=0; i<10;i++) {
			System.out.printf("%02d. 안녕하시렵니까?\n",i+1);
		}
		
		for(int i=1;i<11;i=i+2)
			System.out.printf("%02d. 하이요\n",i);
		
		for(int i=11;i>0;i--)
			System.out.printf("%d 1감소\n",i);
		
		int sum = 0;
		for(int i=1;i<11;i++) {
			sum += i;
			if(i==10) System.out.printf("%d\n",sum);
		}
		
		s.close();
	}
}
