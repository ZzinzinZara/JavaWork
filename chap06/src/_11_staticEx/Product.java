package _11_staticEx;

public class Product {
	String product;
	static int count;
	static int num=0;
	
	Product(){
		num++;
		this.product = "더조은 "+num;
		count++;
	}
}
