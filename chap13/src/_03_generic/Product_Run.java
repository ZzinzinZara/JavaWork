package _03_generic;

public class Product_Run {

	public static void main(String[] args) {
		Product<Tv, String> p1 = new Product<>();
		p1.setKind(new Tv());
		p1.setModel("Smart Tv");
		
//		p1.setKind(new Car()); // Tv만 넣을 수 있음
		System.out.println("─────────────────────────");
		Tv tv = p1.getKind();
		String toModel = p1.getModel();
		System.out.println(toModel);
		System.out.println("─────────────────────────");
		
		Product<Car, String> p2 = new Product<>();
		p2.setKind(new Car());
		p2.setModel("제네시스");
		String toModel1= p2.getModel();
		System.out.println(toModel1);
		System.out.println("─────────────────────────");
	}

}
