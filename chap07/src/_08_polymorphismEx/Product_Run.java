package _08_polymorphismEx;

public class Product_Run {

	public static void main(String[] args) {
		Buyer b1 = new Buyer();
		b1.buy(new Tv());
		b1.buy(new Computer());
		b1.buy(new Game());
		System.out.printf("남은 돈: %d만원\n",b1.money);
		System.out.printf("보너스 점수: %d점\n",b1.bonusPoint);
		
		b1.buy(new Game());
		System.out.printf("남은 돈: %d만원\n",b1.money);
		System.out.printf("보너스 점수: %d점\n",b1.bonusPoint);
	}

}
