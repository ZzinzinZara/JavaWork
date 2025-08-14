package _01_langPackage;

class Point implements Cloneable {
	int x, y;
	Point() { }
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public Point clone() {
		Object obj = null;
		
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}	
		return (Point)obj;
	}
	
	@Override
	public String toString() {
		return "x: "+x+", y:"+y;
	}
}


public class T05_clone_Run {

	public static void main(String[] args) {
		Point p = new Point(3,4);
		Point pCopy = p.clone();
		
		System.out.println("원본: "+p);
		System.out.println("복제: "+pCopy);
		
		p.x =10;
		
		System.out.println("원본: "+p);
		System.out.println("복제: "+pCopy);
	}
}

/*
 * clone() 복제
 * 1. 반드시 clone하고자 하는 클래스에 implements Clonable을 반드시 넣어줘야 함
 *  ==> 이 클래스는 복제할 수 있는 클래스이다를 알려주려는 목적
 * 2. clone()을 오버라이딩 하지 않아도 됨
 * 	==> Object 클래스의 clone() 메소드의 접근제어자가 protected임
 *  ==> 같은 java.lang 패키지 안에 있어야 함
 * 3. 2번과 같은 이유로 clone()을 오버라이딩 해야 됨
*/