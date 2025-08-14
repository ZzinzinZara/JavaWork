package _01_langPackage;

public class Api_Run {

	public static void main(String[] args) {
		Api a1 = new Api();
		Api a2 = new Api();
		
		a1.name = "남궁용진";
		a1.age = 27;
		
		a2.name = "남궁용진";
		a2.age = 26;
		
		System.out.println(a1.equals(a2));
		System.out.println("============================");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println("============================");
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println("============================");
		System.out.println(a1.hashCode() == a2.hashCode());
	}

}
