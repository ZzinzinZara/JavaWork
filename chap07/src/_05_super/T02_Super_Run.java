package _05_super;

class Parent2{
	int x = 10;
	void show() {
		System.out.printf("부모클래스 메소드\n");
	}
}

class Child2 extends Parent2 {
	int x = 20;
	void show() {
		System.out.printf("자식클래스 메소드\n");
	}
	
	void display() {
		show();
		super.show();
		// 우선순위: 지역변수 -> 인스턴스변수 -> 부모변수
		System.out.printf("this.x: %d\n",this.x);
		System.out.printf("super.x: %d\n",super.x);
	}
}

public class T02_Super_Run {

	public static void main(String[] args) {
		Child2 c = new Child2();
		c.display();
	}

}
