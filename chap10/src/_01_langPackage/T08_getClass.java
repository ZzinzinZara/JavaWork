package _01_langPackage;

class Card2 {
	String kind;
	int num;
	Card2() {
		this("heart",7);
	}
	Card2(String kind, int num){
		this.kind = kind;
		this.num = num;
	}
	
	@Override
	public String toString() {
		return kind+", "+num;
	}
}

public class T08_getClass {

	public static void main(String[] args) {
		Card2 card1  = new Card2("spade", 3);
		System.out.println(card1);
		
		System.out.println(card1.getClass());
		System.out.println(card1.getClass().getName()); // 이름만 따오기
		
	}

}
