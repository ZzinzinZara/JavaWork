package _05_interfaceDafault;

public class InterClass2 implements Inter{

	@Override
	public int method1() {
		return 1;
	}

	@Override
	public int method2() {
		return 2;
	}

	@Override
	public int method() {
		return 0;
	}
	
	@Override
	public String deMe() {
		return "오버라이딩한 메소드 deMe()";
	}
	
	@Override
	public String me() {
		return "오버라이딩한 메소드 me()";
	}
	
//	static 붙은 메소드는 오버라이딩 안됨
//	@Override
//	public String stMe() {
//		return "오버라이딩한 메소드 stMe();
//	}
}















