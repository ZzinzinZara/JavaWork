package _01_nonGeneric;

class Box {
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
}

class Apple {}
class Banana {}


public class T01_nonGeneric {

	public static void main(String[] args) {
		Box box = new Box();
		box.setObj("더조은");
		String name = (String)box.getObj();
		
		box.setObj(new Apple());
		Apple apple = (Apple)box.getObj();
		
		// 예외가 발생할 확률이 높음
		// 모든 객체를 받아 형변환시 다른 객체로 변환할 수 있음
		
		
	}

}
