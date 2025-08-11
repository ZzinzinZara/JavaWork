package _12_singleton;

/*
 * 싱글톤: 전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 기법
 * 		- 사용하는 이유: 최초로 만들어진 객체를 재활용하는 패턴
 * 					  생성자를 통해 여러 번 호출이 되더라도 객체는 새로 생성하지 않음
 * 		- 장점: 메모리 낭비 방지
 * 		- 단점: 
 * 			1. 의존성이 높아짐
 * 			2. private 생성자
 * 			3. 테스트 하기 힘듦
 */

class Singleton{
	private static Singleton s = new Singleton();
	
	// 객체를 생성하지 못하도록 private로 막아 놓음
	private Singleton(){
		System.out.printf("객체 생성\n");
	}
	
	// getter 메소드, static이 붙지 않은 인스턴스 메소드 사용못함(객체를 생성할 수 없기에)
	static Singleton getSingleton() { // 정적 메소드
		return s;					  // static으로 정적 메소드를 만들어야 
	}								  // 객체를 생성하지 않고 접근 가능하다.
}

public class SingleTonRun {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getSingleton();
		Singleton s2 = Singleton.getSingleton();
		System.out.println(s1);
		System.out.println(s2);
	}
}
