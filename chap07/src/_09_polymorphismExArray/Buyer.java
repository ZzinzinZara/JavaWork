package _09_polymorphismExArray;

public class Buyer {
	int money = 500;
	int bonusPoint;
	Product[] cart = new Product[10];
	int count=0;
	
	void buy(Product p) {
		if(money < p.price) System.out.printf("잔액부족\n");
		else {
			money -= p.price;
			bonusPoint += p.bonusPoint;
			cart[count++] = p;
			System.out.println(p +" 구입");
		}
	}
	
	void info() {
		int sum = 0;
		String list = "";
		
		for(int i=0;i<cart.length;i++) {
			if(cart[i] == null) break;
			sum += cart[i].price;
			list += cart[i] + " ";
		}
		System.out.printf("구입한 물품의 총액: %d\n",sum);
		System.out.printf("구입한 물품의 목록: %s\n",list);
	}
}


