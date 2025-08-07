package _02_Array;

import java.util.Arrays;
import java.util.Scanner;

public class T02_etcArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		char chArr[]= {'a','b','c'};
		String strArr[]= {"홍길동","남궁용진","한빛나"};
		boolean booArr[]= {true, true, false, false};
		double bouArr[]= {3.14,56.78,14.45,22.22};
		
		// 문자열 3개를 넣을 수 있는 배열을 만들어 사용자로부터 입력받아 넣기
		String str11[]= new String[3];
		
		for(int i=0;i<str11.length;i++) {
			System.out.printf("%d번째 이름 입력 >> ",i+1);
			str11[i] = s.nextLine();
		}
		
		for(int i=0;i<str11.length;i++) {
			System.out.printf("%s  ",str11[i]);
		}
		System.out.printf("\n");
		
		// 배열 출력
		System.out.println(Arrays.toString(str11));
		System.out.println(str11); // 주소
		
		// char은 값이 나옴
		System.out.println(chArr);
	}
}
