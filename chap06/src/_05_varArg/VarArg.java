package _05_varArg;

public class VarArg {

	public static void main(String[] args) {
		// VarArg v = new VarArg(); 
		// 같은 클래스 내에 있는데 객체 생성을 해야되나?
		// static을 붙이면 됨
		method1("남궁","용진","짱짱","맨");
		method1("집","가고","싶어","맨");
	}
	
	void method(String s1) {
		System.out.printf("%s\n",s1);
	}
	void method(String s1,String s2) {
		System.out.printf("%s %s\n",s1,s2);
	}
	void method(String s1,String s2,String s3) {
		System.out.printf("%s %s %s\n",s1,s2,s3);
	}
	
	static void method1(String...str) {
		for(String s : str) {
			System.out.printf("%s ",s);
		}
		System.out.printf("\n");
	}

}
