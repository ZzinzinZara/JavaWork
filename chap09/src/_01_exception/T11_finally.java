package _01_exception;

public class T11_finally {

	public static void main(String[] args) {
		/*
		 * try { // 예외가 발생할 프로그램
		 * 
		 * } catch (Exception e) { // 예외가 발생했을 때 실행될 프로그램
		 * 
		 * } finally { // 예외와 상관없이 무조건 실행, try와 catch에 return문이 있어도 실행
		 * 
		 * } // 여기에 써도 예외와 상관없이 무조건 실행하긴 함 // try와 catch에 return문이 있으면 실행 안됨
		 */	
		
		try {
			int a[] = {1,2,3};
			System.out.printf("%d\n",a[0]);
			//System.out.printf("%d\n",a[6]);
			return;
		} catch (Exception e) {
			System.out.printf("예외 발생\n");
		} finally {
			System.out.printf("프로그램 종료\n");
		}
		System.out.printf("try 바깥 종료\n");
	}
}
