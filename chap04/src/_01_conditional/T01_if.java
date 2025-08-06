package _01_conditional;

import java.util.Scanner;

public class T01_if {

	public static void main(String[] args) {
		int n1 = 100;
		
		// if문
		if(n1 == 100) {
			System.out.printf("집 가고 싶어요 ver.1\n");
		}
		
		if(n1 > 80) {
			System.out.printf("집 가고 싶어요 ver.2\n"); 
			System.out.printf("집 가고 싶어요 ver.3\n");
		}
		
		if(n1 >200) {
			System.out.printf("집 가고 싶어요 ver.4\n");
		}					
	}
}
