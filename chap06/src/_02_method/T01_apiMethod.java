package _02_method;

public class T01_apiMethod {
	// 반환형이 없는 함수
	void print1() {
		System.out.printf("반환값이 없고, 매개변수도 없은 함수\n");
	}
	
	// 반환형이 있는 함수
	int print2() {
		System.out.printf("반환값이 int형이고, 매개변수가 없는 함수\n");
		return 10;
	}
	
	String print3() {
		System.out.printf("반환값이 String이고, 매개변수가 없는 함수\n");
		return "집 가고싶다";
	}
	
	// 매개변수
	void print4(int n) {
		System.out.printf("매개변수로 받은 숫자: %d\n",n);
	}
	
	int print5(int x, int y) {
		int result = x+y;
		return result;
	}
	
	String print6(int age, String name) {
		System.out.printf("나이: %d",age);
		return name;
	}
}
