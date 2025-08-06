package _02_repetitive;

import java.util.Scanner;

public class T03_while {

	public static void main(String[] args) {
		// for -> while
		System.out.printf("==for==\n");
		for(int i=1;i<=5;i++) {
			System.out.printf("%d\n",i);
		}
		
		int i=1;
		while(i<=5) {
			System.out.printf("%d\n",i);
			i++;
		}
		
		i = 1;
		int sum = 0;
		while(i<101) {
			sum += i;
			i++;
		}
		System.out.printf("%d\n",sum);
		
		int sum1 =0;
		while(true) {
			Scanner s = new Scanner(System.in);
			System.out.printf("더하려는 정수를 입력하세요(종료하려면 -1 입력) >> ");
			int n = s.nextInt();
			if(n==-1) break;
			sum1 += n;
			System.out.printf("%d\n",sum1);
		}
		System.out.printf("종료되었습니다.\n");
	}

}
