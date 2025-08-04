package _02_Scanner;

public class T04_printf_digit {

	public static void main(String[] args) {

		System.out.printf("%7d\n",32000);
		System.out.printf("%7d\n", 3200000);
		System.out.printf("%7d\n",3200);
		System.out.println("----------------------------");
		
		System.out.printf("%07d\n",32000);
		System.out.printf("%07d\n", 3200000);
		System.out.printf("%07d\n",3200);
		System.out.println("----------------------------");
		
		System.out.printf("%10s\n", "abcdefg");
		System.out.printf("%-10s", "abcdefg");
		System.out.printf("%s\n", "123");
		System.out.println("----------------------------");
		
		System.out.printf("%.1f\n", 123.45); // 뒤에서 반올림
	}

}
