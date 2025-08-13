package _01_exception;

public class T01_exception {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			// 예외가 발생할 수 있는 프로그램
			System.out.println(3);
			System.out.println(4);
			
		} catch (Exception e) {
			System.out.printf("예외발생\n");
		}
		System.out.println(5);
	}
}
