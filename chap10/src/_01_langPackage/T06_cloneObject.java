package _01_langPackage;

class A {
	int num = 3;
}

class Point2 implements Cloneable {
	int x, y;
	A a = new A();
	Point2() { }
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public Point2 clone() {
		Object obj = null;
		
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}	
		return (Point2)obj;
	}
	
	/*
	 * A b = a; a = new A(); a.num = b.num;
	 */
	
	@Override
	public String toString() {
		return "x: "+x+", y:"+y+", a.num: "+a.num;
	}
}

public class T06_cloneObject {

	public static void main(String[] args) {
		Point2 original = new Point2(3,4);
		Point2 copy = original.clone();
		copy.a.num = 100; // 원본이나 복제나 같은 주소를 참조하고 있어서 같이 바뀜
		
		System.out.println("원본: "+original);
		System.out.println("복제: "+copy);
		
	}

}
