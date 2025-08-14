package _01_langPackage;

import java.util.Objects;

/*
 * 원래 Object 클래스에 있는 hashocde()는 객체의 주소로 해시코드를 만든다
 * 
 *  equals()를 오버라이딩하여 값으로 비교하도록 만들면
 *  hashcode()도 오버라이딩하여 논리적으로 두 객체가 같도록 만들어 줌
 */

class Equals {
	int value;
	
	Equals(int value) {
		this.value = value;
	}
	
	@Override
	public boolean equals(Object o) {
		return value == ((Equals)o).value; // Equals객체 안에 value변수가 있기에 형변환
	}
	
	@Override
	public int hashCode() {
									// 원래는 주소를 hashCode를 만드는데,
		return Objects.hash(value); // value값 10으로 hashCode를 만듦
	}
	
} 

public class T02_hashcode {

	public static void main(String[] args) {
		Equals e1 = new Equals(10);
		Equals e2 = new Equals(10);
		
		System.out.printf("%b\n", e1.equals(e2));
		System.out.println("e1의 hashcode: "+e1.hashCode());
		System.out.println("e2의 hashcode: "+e2.hashCode());
		System.out.printf("%b\n", e1 == e2);
		
		System.out.printf("e1의 고유한 hashcode: %d\n",System.identityHashCode(e1));
		System.out.printf("e2의 고유한 hashcode: %d\n",System.identityHashCode(e2));
		
		// String 클래스는 equals()와 hashCode()를 오버라이딩 한 상태
		String s1 = new String("남궁용진");
		String s2 = new String("남궁용진");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
	}

}
