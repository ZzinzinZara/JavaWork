package _01_abstract;

abstract class Pet {
	private String kind;
	private String color;
	private String feature;
	
	Pet(String kind, String color, String feature){
		this.kind = kind;
		this.color = color;
		this.feature = feature;
	}
	// 추상메소드: 상속받는 곳에서 반드시 구현해야 됨
	abstract void sound();
	abstract void info();
	
	String getKind() {
		return this.kind;
	}
	String getColor() {
		return this.color;
	}
	String getFeature() {
		return this.feature;
	}
	@Override
	public String toString() {
		return "종류: "+kind+", 색상: "+color+", 특징: "+feature;
	}
}

class Cat extends Pet {
	Cat() {this("길 고양이","검정색","더러움");}
	Cat(String kind, String color, String feature) {
		super(kind, color, feature);
	}
	
	@Override
	void sound() {System.out.printf("야옹\n");}
	@Override
	void info() {}
	
}

class Dog extends Pet {
	Dog() {this("비숑","흰색","귀여움");}
	Dog(String kind, String color, String feature) {
		super(kind, color, feature);
	}
	
	@Override
	void sound() {System.out.printf("멍멍\n");}
	@Override
	void info() {
		System.out.printf("종류: %s\n",super.getKind());
	}
	
}

class Frog extends Pet {
	Frog() {this("독개구리","혼합","치명적임");}
	Frog(String kind, String color, String feature) {
		super(kind, color, feature);
	}
	
	@Override
	void sound() {System.out.printf("개굴\n");}
	@Override
	void info() {
		System.out.printf("특징: %s\n",getFeature());
	}
}

public class Pet_Run {

	public static void main(String[] args) {
//		추상클래스는 객체를 생성할 수 없다
//		Pet pet1 = new Pet("비숑","흰","귀여움");
		Pet p1 = new Frog("황소개구리","갈색","못생김"); // 다형성: 추상클래스는 형변환은 가능
		System.out.println(p1); // 패키지명.클래스@주소 but, toString을 override해놔서 toString을 출력
		System.out.printf("울음소리: "); p1.sound();
		System.out.printf("종류: %s, 색상: %s, 특징: %s\n",p1.getKind(),p1.getColor(),p1.getFeature());
		System.out.printf("==================================================\n");
		
		p1 = new Dog("말티즈","흰색","좆만함");
		System.out.println(p1); // 패키지명.클래스@주소 but, toString을 override해놔서 toString을 출력
		System.out.printf("울음소리: "); p1.sound();
		System.out.printf("종류: %s, 색상: %s, 특징: %s\n",p1.getKind(),p1.getColor(),p1.getFeature());
		System.out.printf("==================================================\n");
		
		p1 = new Cat("길 고양이","검정색","더러움");
		System.out.println(p1); // 패키지명.클래스@주소 but, toString을 override해놔서 toString을 출력
		System.out.printf("울음소리: "); p1.sound();
		System.out.printf("종류: %s, 색상: %s, 특징: %s\n",p1.getKind(),p1.getColor(),p1.getFeature());
		System.out.printf("==================================================\n");
	}

}

/*
 * 추상 클래스: 클래스 앞에 abstract 키워드 사용 
 * 			 추상 메서드가 한 개 이상 포함되면, 추상 클래스로 만들어야 됨
 * 추상 메소드: 메서드에 선언부만 있고 내용이 없는 메소드
 * 			ex) abstract void 함수명(매개변수); // 추상 메소드 앞에 abstract을 붙임 
 * 				추상클래스는 객체를 생성할 수 없다(상속 받아서 사용)
*/

