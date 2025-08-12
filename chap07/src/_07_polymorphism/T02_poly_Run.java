package _07_polymorphism;

class Parent {
	void method1() {
		System.out.printf("Parent method1()\n");
	}
	
	void method2() {
		System.out.printf("Parent method2()\n");
	}
}

class Child extends Parent {
	@Override
	void method2() {
		System.out.printf("Child method2()\n");
	}
	
	void method3() {
		System.out.printf("Child method3()\n");
	}
}

public class T02_poly_Run {

	public static void main(String[] args) {
		Parent p = new Child();
		p.method1();
		p.method2(); // 오버라이딩한 메소드는 형변환과 상관없이 
//		p.method3(); // 무조건 오버라이딩한 메소드 호출
		
	}

}
