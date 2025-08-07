package _01_String;

public class T02_casting {

	public static void main(String[] args) {
		// 문자 -> 숫자 변환
		String str = "100";
		int n1 = Integer.parseInt(str);
		System.out.printf("%d\n",n1+100);
		
		double d1 = Double.parseDouble(str);
		System.out.printf("%.1f\n",d1+100.1);
		
		boolean b1 = Boolean.parseBoolean(str);
		System.out.printf("%b\n",b1); // 왜 false? -> 문자열이 true와 동일한 경우만 true를 반환
		
		// 숫자 -> 문자 변환
		int n2 = 50;
		String str1 = String.valueOf(n2);
		System.out.printf("%s\n",str1);
		
		double b2 = 3.14;
		String str3 = String.valueOf(b2);
		System.out.printf("%s\n",str3);
		
	}

}
