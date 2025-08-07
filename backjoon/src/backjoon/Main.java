package backjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		
		int sum=n2+n3;
		int fin=sum%60;
		n1 += sum/60;
		n1 %= 24;
		
		System.out.printf("%d %d\n",n1,fin);
	}
}
