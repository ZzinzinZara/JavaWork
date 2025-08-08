package _04_overroading;

public class Overroading {
	// 오버로딩 조건
	// 1. 메서드의 이름이 같아야 한다.
	// 2. 매개변수의 개수가 다르던지 자료형이 달라야 한다.
	
	int add() {
		return 0;
	}
	
	int add(int n1) {
		return n1;
	}
	
	int add(int n1, int n2) {
		return n1+n2;
	}
	
	double add(double n1, double n2) {
		return n1+n2;
	}
	
	String add(String name) {
		return "이름: "+name;
	}
}
