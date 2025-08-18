package _02_StringMethod;

import java.util.Scanner;

public class T11_toLowerCase_upper {

	public static void main(String[] args) {
		String str = "Java Program";
		String lower = str.toLowerCase();
		String upper = str.toUpperCase();
		System.out.println(lower);
		System.out.println(str.toUpperCase());
		
		Scanner s = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 >> ");
		String c = s.nextLine();
	
		String inputLower = c.toLowerCase(); // 입력한것을 바꾸면 됨
		
		if(lower.contains(inputLower)) {
			System.out.printf("포함\n");
		} else System.out.printf("미포함\n");
	}
}
