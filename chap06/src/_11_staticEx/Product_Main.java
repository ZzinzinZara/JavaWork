package _11_staticEx;

public class Product_Main {

	public static void main(String[] args) {
		Product p1 = new Product(); 
		System.out.printf("%s \n",p1.product);
		Product p2 = new Product();
		System.out.printf("%s \n",p2.product);
		Product p3 = new Product();
		System.out.printf("%s \n",p3.product);
		System.out.printf("생산된 총 제품의 개수: %d\n",p3.count);
		
		Product p4 = new Product();
		System.out.printf("%s \n",p4.product);
		Product p5 = new Product();
		System.out.printf("%s \n",p5.product);
		System.out.printf("생산된 총 제품의 개수: %d\n",p3.count);
	}

}
