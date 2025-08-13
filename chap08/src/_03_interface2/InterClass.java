package _03_interface2;

public class InterClass implements Inter,Inter2{
	@Override
	public void print(int a) {
		System.out.printf("받은 값: %d\n",a);
	}
	@Override
	public void method() {
		System.out.printf("매개변수 없는 메소드 호출\n");
	}
	@Override
	public String str(String name) {
		return "이름: "+name;
	}
	@Override
	public int add(int a) {
		return a+1;
	}
	@Override
	public int add(int a, int b) {
		return a+b;
	}
}	
