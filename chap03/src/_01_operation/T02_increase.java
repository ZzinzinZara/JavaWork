package _01_operation;

public class T02_increase {

	public static void main(String[] args) {
		// ++ 하나 증가
		int n1 = 10; 
		n1++;
		System.out.println(n1);
		
		// 단항 일 때는 연산자가 앞에 붙으나 뒤에 붙으나 동일 
		n1--;
		--n1;
		
		int n2 = 10;
		int n3 = 10;
		// 앞에 붙으면 선 증가, 뒤에 붙으면 후 증가
		int result = ++n2 + n3++;
		System.out.println(result); // 21 예상 
		System.out.printf("%d %d\n",n2, n3 ); // 11, 11 
	}
}
