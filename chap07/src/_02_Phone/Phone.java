package _02_Phone;

public class Phone {
	String model;
	String color;
	
	Phone(String model, String color){ // 부모 생성작 인자를 받는 생성자니까 
		this.model = model;			   // super를 통해 부모한테 넘기라는거지?
		this.color = color;
	}
	
	void bell() {
		System.out.printf("벨이 울립니다\n");
	}
	
	void hangUp() {
		System.out.printf("전화를 받습니다\n");
	}
	
	void sendVoice(String message) {
		System.out.println("나: "+message);
	}
	
	void receveVoice(String message) {
		System.out.printf("상대방: %s\n",message);
	}
	
	void hangOut() {
		System.out.printf("전화를 끊습니다\n");
	}
}
