package _03_casting;

public class T03_castingOp {

	public static void main(String[] args) {
		// int형 보다 작은 자료형의 연산은 모두 int형으로 자동 형변환된다.
		byte b1 = 10;
		byte b2 = 20;
		
		// 연산은 int로 자동 형변환 돼서, byte로 만든 변수에 넣으면 오류
		int result = b1 + b2; 
		
		char c1 = 'A';
		// char c2 = c1 + 5; 오류
		int c3 = c1 + 5;
		
		System.out.println((char)c3);
		
		
		int n1 = 100;
		int n2 = 3;
		System.out.println(n1/n2); // 몫만 나옴
		
		double do1 = 3;
		System.out.println(n1/do1); // double로 자동 형변환
		
		
		
		
	}

}
