package _10_Ex;

public class Pet_Run {

	public static void main(String[] args) {
		Pet p1 = new Cat();
		Pet p2 = new Dog();
		
		p1.sound();
		p1.info();
		System.out.printf("종류: %s, 색상: %s, 특징: %s\n",p1.getKind(),p1.getColor(),p1.getFeature());
		System.out.println(p1.toString());
		System.out.printf("\n");
		p2.sound();
		p2.info();
		System.out.printf("종류: %s, 색상: %s, 특징: %s\n",p2.getKind(),p2.getColor(),p2.getFeature());
		System.out.println(p2.toString());
	}
}

class Pet {
	private String kind;
	private String color;
	private String feature;
	Pet(String kind, String color, String feature){
		this.kind = kind;
		this.color = color;
		this.feature = feature;
	}
	
	String getKind() { return this.kind;}
	String getColor() { return this.color;}
	String getFeature() { return this.feature;}
	
	void sound() {
		System.out.printf("허허허허!!\n");
	}
	
	void info() {
		System.out.printf("종류: %s, 색상: %s, 특징: %s\n",this.kind, this.color, this.feature);
	}
	
	public String toString() {
		return "종류: "+getKind()+", 색상: "+getColor()+", 특징: "+getFeature();
	}	
}

class Cat extends Pet{
	Cat(){
		this("길바닥출신","검정","더러움");
	}
	Cat(String kind, String color, String feature){
		super(kind,color,feature);
	}
	@Override
	void sound() {
		System.out.printf("야옹~~\n");
	}
}

class Dog extends Pet{
	Dog(){
		this("비숑","흰색","눈물 냄새 심함");
	}
	Dog(String kind, String color, String feature){
		super(kind,color,feature);
	}
	@Override
	void sound() {
		System.out.printf("멍멍!!\n");
	}
}
