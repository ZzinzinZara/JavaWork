package _07_polymorphism;

class A { int a=1;}
class B extends A { int b=2;}
class C extends A { int c=3;}
class D extends B { int d=4;}
class E extends C { int e=5;}

public class T01_polymorphism {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1=b;
		A a2=c;
		A a3=d;
		A a4=e;
		
		System.out.printf("b.a: %d\n", b.a);
		System.out.printf("b.b: %d\n", b.b);
		System.out.println(a1.a);
//		System.out.println(a1.b); // b -> a, a클래스만 사용한다고 했기 때문에 
								  // b에 있는 변수는 접근하지 못한다.
	}
}
