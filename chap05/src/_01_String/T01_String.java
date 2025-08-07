package _01_String;

public class T01_String {

	public static void main(String[] args) {
		String name="남궁용진";
		String hobby="공부하기";
		
		System.out.printf("name==hobby: %b\n",name==hobby);
		
		String str1 = "JAVA";
		String str2 = "JAVA";
		
		System.out.printf("str1==str2: %b\n",str1==str2);
		
		String str3 = new String("program");
		String str4 = new String("program");
		
		System.out.printf("str3==str4: %b\n",str3==str4);
		System.out.printf("str3==str4(값): %b\n",str3.equals(str4));
		
		String str5 = "남궁용진";
		System.out.printf("name==str5: %b\n",name==str5);
		
		// String -> 자료형
		// 자료형 변수 = 자료형.parse자료형("값");
		
		// 기본타입 -> 문자열
		// String.valueOf() 
	}

}
