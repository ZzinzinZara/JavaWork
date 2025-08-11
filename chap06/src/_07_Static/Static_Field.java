package _07_Static;

public class Static_Field {
	// 인스턴스 필드
	String name="인스턴스 필드";
	int num=3;
	
	// 정적 필드
	static int stNum=10;
	static String stName="정적 필드";
	
	// 인스턴스 메서드
	void method() {
		System.out.printf("인스턴스 메소드 method()\n");
		System.out.printf("%d\n",num); // 인스턴스 필드 호출 가능
		System.out.println(stNum); // 정적 필드 호출 가능
	}
	
	String method2() {
		System.out.printf("인스턴스 메소드 method2()\n");
		return name;
	}
	
	// 정적 메서드
	static void stMethod() {
		System.out.printf("정적 메소드 stMethod()\n");
		System.out.println(stNum);
		System.out.println(stName);
		// System.out.println(num); 인스턴스 변수인 num은 사용불가
	}
	
	static String stMethod2() {
		System.out.printf("정적 메소드 stMethod2()\n");
		return stName;
	}
}
