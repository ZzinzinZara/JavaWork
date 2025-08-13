package _02_interface;

public class InterClass implements Inter{
	@Override
	public void print(int a) {
		System.out.printf("받은 값: %d\n",a);
	}
	public void method() {
		System.out.printf("매개변수 없는 메소드 호출\n");
	}
	public String str(String name) {
		return "이름: "+name;
	}
}	
