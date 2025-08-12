package _05_super;

class Parent3{
	int x;
	int z;
	Parent3(){
		System.out.printf("부모생성자 호출\n");
		x=10;
		z=10;
	}
}

class Child3 extends Parent3 {
	int x;
	int y;
	Child3(){
		System.out.printf("자식생성자 호출\n");
		x=10*10;
		y=10*10;
	}
}

class GrandChild3 extends Child3 {
	int x;
	GrandChild3() {
		System.out.printf("자손생성자 호출\n");
		x=10*10*10;
	}
	
	void xPrint() {
		System.out.printf("%d\n", super.x);
	}
}

public class T03_Super_Run {

	public static void main(String[] args) {
		GrandChild3 gc3 = new GrandChild3();
		System.out.println(gc3.x);
		System.out.println(gc3.y);
		System.out.println(gc3.z);
	}
}
