package _Ex_01;

class Tv implements Product{
	boolean power;
	int channel;
	int volume;
	
	@Override
	public void power() {
		if(!power) {
			power = true;
			System.out.printf("전원 On\n");
		}
		else {
			power = false;
			System.out.printf("전원 Off\n");
		}
	}

	@Override
	public void sound(int volume) {
		this.volume = volume;
		System.out.printf("현재 볼륨: %d\n",this.volume);
	}
	
	void channelChange(int num) {
		this.channel=num;
		System.out.println("현재 채널: "+this.channel);
	}
	
	@Override
	public void search(String search) {
		System.out.printf("오버라이딩 한 %s\n",search);
	}
}

class Game implements Product{
	boolean power;
	String game;
	int volume;
	
	@Override
	public void power() {
		if(!power) {
			power = true;
			System.out.printf("전원 On\n");
		}
		else {
			power = false;
			System.out.printf("전원 Off\n");
		}
	}

	@Override
	public void sound(int volume) {
		this.volume = volume;
		System.out.printf("현재 볼륨: %d\n",this.volume);
	}
	
	void gameChange(String game) {
		this.game = game;
		System.out.printf("현재 게임: %s\n",this.game);
	}
}

public class Product_Main {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		t1.power(); t1.channelChange(5); t1.sound(25); t1.power();
		t1.search("갤럭시로 바꾸고 싶네");
		// static 메소드는 객체를 생성하지 않고, 클래스 or 인터페이스 이름으로 접근 가능하다
		// 오버라이딩은 안된다
		Product.aiConversation();
		
		System.out.printf("\n");
		Game g1 = new Game();
		g1.power(); g1.gameChange("롤토체스"); g1.sound(40); g1.power();
		g1.search("아이폰으로 바꾸고 싶네");
	}
}




























