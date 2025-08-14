package _01_langPackage;

/*
 * toString()
 * 참조변수를 출력하면 toString이 호출되고,
 * 패키지명.클래스명@hashCode로 출력됨 (hashCode는 16진수로 출력)
 */

class Card {
	String kind;
	int num;
	Card() {
		this("heart",7);
	}
	Card(String kind, int num){
		this.kind = kind;
		this.num = num;
	}
	
	@Override
	public String toString() {
		return kind+", "+num;
	}
}

public class T03_toString {

	public static void main(String[] args) {
		Card card1 = new Card();
		Card card2 = new Card("spade", 10);
		Card card3 = null;
		
		System.out.println(card1);
		System.out.println(card1.toString());
		
		System.out.println(card2);
		System.out.println(card2.toString());
		
		// 참조변수의 값이 null인 경우, null 출력 
		System.out.println(card3);
		//System.out.println(card3.toString());
	}

}
