package backjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum[] = new int[10];
		int n1 = 0, n2=0, count=0;
		while(n1!=0&n2!=0) {
			n1 = s.nextInt();
			n2 = s.nextInt();
			sum[count] = n1+n2;
			count++;
		}
		
	}
}
