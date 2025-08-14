package _02_StringMethod;

import java.util.Scanner;

public class T01_charArray {

	public static void main(String[] args) {
		String str1 = new String("java program");
		String str2 = "남궁용진";
		
		char[] chArr = {'남','궁','용','진'};
		String str3 = new String(chArr);
		System.out.println(str3);
		
		char ch = str3.charAt(1);
		System.out.println(ch);
		
		// 주민번호 넣은 변수
		// 1234567-X << X의 번호로 남자 or 여자 확인
		
		Scanner s = new Scanner(System.in);
		
		System.out.printf("주민등록번호를 입력하세요 >> ");
		char num = s.next().charAt(7);
		System.out.printf("%c\n",num);
		if(num=='1'||num=='3')System.out.println("남자");
		else System.out.println("여자");
	}

}
