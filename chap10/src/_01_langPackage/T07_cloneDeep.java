package _01_langPackage;

import java.util.Arrays;

class Point3 implements Cloneable {
	int x, y;
	A a = new A();
	Point3() { }
	Point3(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	// 인스턴스변수가 기본자료형이면 깊은 복사(값 복사)
	// 인스턴스변수가 참조자료형이면 얕은 복사(주소 복사)
	
	@Override
	public String toString() {
		return "x: "+x+", y:"+y+", a.num: "+a.num;
	}
}

class Circle implements Cloneable {
	Point3 p; //중심점
	double r; //반지름
	Circle(Point3 p, double r){
		this.p = p;
		this.r = r;
	}
	
	@Override 
	public Circle clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (Circle)obj;
	}
	
	public Circle deepClone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Circle c =(Circle)obj;
		c.p = new Point3(this.p.x, this.p.y);
		
		return (Circle)obj;
	}
	
	@Override
	public String toString() {
		return "p: [" + p + "], r:"+r;
	}
}

public class T07_cloneDeep {

	public static void main(String[] args) {
		// 얕은 복사 (주소 복사)
		String str[] = {"a","b","c"};
		String copyStr[] = str;
		
		System.out.println(str[0]);
		System.out.println(copyStr[0]);
		str[0] = "d";
		
		System.out.println(str[0]);
		System.out.println(copyStr[0]);
		System.out.printf("======================================\n");
		
		// 깊은 복사 (값 복사)
		String deepCopy[] = new String[5];
		for(int i=0;i<str.length;i++) {
			deepCopy[i] = str[i];
		}
		System.out.println("str: "+Arrays.toString(str));
		System.out.println("deep: "+Arrays.toString(deepCopy));
		System.out.printf("======================================\n");
		
		str[0] = "a";
		System.out.println("str: "+Arrays.toString(str));
	}

}
