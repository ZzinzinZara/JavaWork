package _02_generic;

class Box<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
}

class Apple { 
	@Override 
	public String toString() { 
		return "Apple";
		}
	}
class Banana {
	@Override
	public String toString() {
		return "Banana";
	}
}


public class T01_nonGenerice {

	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.set("hello");
//		box1.set(new Apple());
//		box1.set(3);  // 자료형이 일치하지 않아 오류 발생
		System.out.println(box1.get());
		
		Box<Integer> box2 = new Box<>();
//		box2.set('a');
//		box2.set("a"); 
//		box2.set(12.12); // 자료형이 일치하지 않아 오류 발생
		box2.set(10);
		System.out.println(box2.get());
		
		Box<Apple> box3 = new Box<>();
		box3.set(new Apple());
		System.out.println(box3.get());
		
//		box3.set(new Banana()); // Apple 타입만 가능
		
		
	}

}
