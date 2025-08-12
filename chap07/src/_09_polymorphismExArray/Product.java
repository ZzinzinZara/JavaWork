package _09_polymorphismExArray;

public class Product {
	int price;
	int bonusPoint;
	Product(int price){
		this.price = price;
		this.bonusPoint = (int)(price * 0.05);
	}
}
