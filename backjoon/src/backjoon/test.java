package backjoon;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int sum1=0;
		
		for(int i=0;i<n;i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			System.out.printf("%d\n", a+b);
		}
	}
}
