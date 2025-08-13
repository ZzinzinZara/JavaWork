package _05_interfaceDafault;
/*
 * default, static 메소드
 *  - jdk 8버전부터 추가된 메소드
 *  - 단점을 보완하기 위해서 만들어짐
 *    : interface를 만들어 implements한 클래스가 여러개 있는 경우
 *    	나중에 interface에 추상메소드를 추가하면 implements한 모든 클래스에서
 *    	나중에 추가한 추상메소드를 모두 구현해야하는 단점
 *    
 *    default 메소드: 구현부가 있다
 *    	- 오버라이딩이 필요하면 구현을 해도 되고, 안 해도 됨
 *    static 메소드: 구현부가 있다
 *    	- 오버라이딩을 할 수 없음
 */

interface Inter1 {
	int method1();
	static String stMe() {
		return "static 메소드";
	}
}

interface Inter2 {
	int method2();
	default String deMe() {
		return "default 메소드2";
	}
}

public interface Inter extends Inter1,Inter2 {
	int method();
	default String me() {
		return "default 메소드1";
	}
}













