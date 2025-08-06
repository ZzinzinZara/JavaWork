package _02_repetitive;

public class T08_random {

	public static void main(String[] args) {
		// Math 클래스(수학에 관련된 클래스)
		double ran1 = Math.random(); // 실수형: 0~0.9999999999999,,,
		System.out.printf("%f\n",ran1);
		System.out.printf("============================\n");
		
		double ran2 = Math.random() * 10;
		System.out.printf("%f\n",ran2);
		System.out.printf("============================\n");
		
		// 0-10 정수
		int ran3 = (int)(Math.random() * 10)+1;
		System.out.printf("%d\n",ran3);
		System.out.printf("============================\n");
		
		// 1~n 정수
		int n = 3;
		int threeN = (int)(Math.random()*n) + 1;
		System.out.printf("%d\n",threeN);
		System.out.printf("============================\n");		
	}
}
