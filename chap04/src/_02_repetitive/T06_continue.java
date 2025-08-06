package _02_repetitive;

import java.util.Scanner;

public class T06_continue {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum=0;
		
		for(int i=1;i<101;i++) {
			if(i%3==0) continue;
			sum += i;
		}
		System.out.printf("%d\n",sum);
		
		s.close();
	}

}
