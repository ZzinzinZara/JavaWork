package _04_overriding;

class Over{
	void show(String str) {
		System.out.printf("부모 클래스 메소드: %s\n",str);
	}
}

class OverChild extends Over {
	// 오버라이딩: 부모의 메소드와 원형은 같고, 내용은 다름
	void show(String str) {
		System.out.printf("자식 클래스 메소드: %s\n",str);
	}
}

public class Overriding_Run {

	public static void main(String[] args) {
		OverChild oc = new OverChild();
		oc.show("자바 프로그래밍");
		
		Over o = new Over();
		o.show("오라클");
		

	}

}
