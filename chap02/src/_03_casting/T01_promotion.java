package _03_casting;

import java.awt.Window.Type;

public class T01_promotion {

	public static void main(String[] args) {
		byte b1 = 20;
		short s1 = b1;
		
		int int1 = b1;
		int1=s1;
		
		char ch1 = '김';
		int intch=ch1;
		
		System.out.println(ch1);
		System.out.println(intch);
		
		double d1 = int1;
		
		System.out.println(d1);
		
		int int2=s1+1;
		int int3=ch1+1;
		int s2=b1+s1;
		
		System.out.println(int2+" "+int3);
		
	}

}
