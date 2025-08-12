package _08_polymorphismEx;

public class Buyer {
	int money = 500;
	int bonusPoint;
	
	void buy(Product p) {
		if(money < p.price) System.out.printf("잔액부족\n");
		else {
			money -= p.price;
			bonusPoint += p.bonusPoint;
			System.out.println(p +" 구입");
		}
	}
}


