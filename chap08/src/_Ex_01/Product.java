package _Ex_01;

public interface Product {
	void power();
	void sound(int volume);
	
	static void aiConversation() {
		System.out.println("AI와 우리는 친긔친긔");
	}
	
	default public void search(String search) {
		System.out.printf("오버라이딩 안 한 %s\n",search);
	}
}
