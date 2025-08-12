package _05_super;

class Parent{
	int x = 10;
}

class Child extends Parent {
	int x = 20;
	void show() {
		int x = 30;
		// 우선순위: 지역변수 -> 인스턴스변수 -> 부모변수
		System.out.printf("x: %d\n",x);
		System.out.printf("this.x: %d\n",this.x);
		System.out.printf("super.x: %d\n",super.x);
	}
}

public class T01_Super_Run {

	public static void main(String[] args) {
		Child c = new Child();
		c.show();
	}

}
