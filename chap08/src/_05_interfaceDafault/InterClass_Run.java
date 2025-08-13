package _05_interfaceDafault;

public class InterClass_Run {

	public static void main(String[] args) {
		InterClass ic = new InterClass();
		System.out.println(ic.method());
		System.out.println(ic.method1());
		System.out.println(ic.method2());
		System.out.println("deMe -> "+ic.deMe());
		System.out.println("me -> "+ic.me());
		System.out.println("stMe -> "+Inter1.stMe());
		
		System.out.printf("\n");
		InterClass2 ic2 = new InterClass2();
		System.out.println("deMe -> "+ic2.deMe());
		System.out.println("me -> "+ic2.me());
	}
}
