package _02_interface;

/*
 *   interface: 일종의 추상클래스, 추상클래스보다 추상화가 더 높음
 * 				추상메소드만 포함되어 있음 (일반메소드 없음)
 * 				추상메소드와 상수만 멤버로 가질 수 있음
 * 				객체 생성 할 수 없음
 * 				상속 받는 곳에서는 implements 키워드를 사용 (extends XX)
 * 			-사용: 표춘 인터페이스를 만들어 어떠한 객체가 들어오더라도 호출 시 이름 동일하게 호출
 */
public interface Inter {
	// 상수만 사용
	public static final double PI = 3.14;
	int MAX=100; // 컴파일시 public static final을 자동으로 붙여줌
	
	public abstract void print(int a);
	public abstract void method();
	String str(String name); // 컴파일시 public abstract를 자동으로 붙여줌
}
