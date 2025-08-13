package _Ex_01;

abstract class Phone {
	String owner;
	Phone(String owner){
		this.owner = owner;
	}
	abstract void hangUp();
	abstract void hangDown();
	void bell() {
		System.out.printf("델레레레레레렐레\n");
	}
}

class FolderPhone extends Phone {
	
	FolderPhone(String owner){
		super(owner);
	}
	void hangUp() {
		System.out.printf("펼칩니다\n");
	}
	void hangDown() {
		System.out.printf("접습니다\n");
	}
}

class SmartPhone extends Phone {
	SmartPhone(String owner){
		super(owner);
	}
	void hangUp() {
		System.out.printf("받기버튼을 터치합니다\n");
	}
	void hangDown() {
		System.out.printf("종료버튼을 터치합니다\n");
	}
}

public class Phone_Run {

	public static void main(String[] args) {
		Phone p1 = new FolderPhone("홍길동");
		Phone p2 = new SmartPhone("남궁용진");
		
		System.out.printf("owner: %s\n",p1.owner);
		p1.bell(); p1.hangUp(); p1.hangDown();
		System.out.printf("\n");
		System.out.printf("owner: %s\n",p2.owner);
		p2.bell(); p2.hangUp(); p2.hangDown();	
	}
}
