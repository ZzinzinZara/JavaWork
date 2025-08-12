package _09_polymorphismExArray;

public class Product_Run {

	public static void main(String[] args) {
		Buyer b1 = new Buyer();
		b1.buy(new Tv());
		b1.buy(new Computer());
		b1.buy(new Game());
		b1.info();
		
		b1.buy(new Game());
	}
}
