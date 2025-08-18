package _02_StringMethod;

import java.util.Arrays;

public class T09_split {

	public static void main(String[] args) {
		// split: 문자열을 기준 문자열로 분리하여 배열로 만듦
		String str = "더조은-홍길동-이순신-남궁용진";
		String newStr[] = str.split("-");

		for(int i=0;i<newStr.length;i++) {
			System.out.println(newStr[i]);
		}
		System.out.println(Arrays.toString(newStr));
		
		str = "더조은-홍길동/이순신,아무개@서민구";
		newStr = str.split("-|/|,|@"); // | 이거 사용해야 됨
		System.out.println(Arrays.toString(newStr));
		
		// split(분리문자, 배열의 개수)
		str = "더조은-홍길동-이순신-남궁용진";
		newStr = str.split("-",1);
		System.out.println(Arrays.toString(newStr));
		System.out.println(newStr[0]);
	}
}
