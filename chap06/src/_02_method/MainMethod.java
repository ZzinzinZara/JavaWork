package _02_method;

public class MainMethod {

	public static void main(String[] args) {
		T01_apiMethod aMet = new T01_apiMethod();
		aMet.print1();
		// 주의: 반환형이 없는 메소드는 값을 저장할 수 없다.
		// 		출력문 사용도 안됨
		int n = aMet.print2();
		System.out.printf("%d\n",n); // 반환형을 받은 변수를 출력
		String str = aMet.print3();
		System.out.printf("%s\n",str);
		
		aMet.print4(200);
		int sum = aMet.print5(100,20);
		System.out.printf("반환값: %d\n",sum);
		
		String name = aMet.print6(27,"남궁용진");
		System.out.printf(", 이름: %s \n",name);
		
		System.out.printf("==================================\n");
		
		T02_apiOp oper = new T02_apiOp();
		System.out.printf("%d\n", oper.add(3,4));
		System.out.printf("%d\n",oper.sub(100,200));
		System.out.printf("%d\n",oper.mul(5,5));
		System.out.printf("%.2f\n",oper.div(10,2));
		System.out.printf("%d\n",oper.remainder(100,3));
		
	}
}
