package _04_overroading;

public class OverOp {
	int num=1;
	int add() {
		return 0;
	}
	int add(int a) {
		return a;
	}
	int add(int a, int b) {
		return a+b;
	}
	int sub() {
		return 0;
	}
	int sub(int a) {
			return a;
	}
	int sub(int a, int b) {
		return a-b;
	}
	int mul() {
		return 0;
	}
	int mul(int a) {
		return a;
	}
	int mul(int a, int b) {
		return a*b;
	}
}
