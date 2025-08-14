package _01_langPackage;

import java.lang.reflect.Array;
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
		System.out.printf("======================================\n");
		
		// 2. Arrays.copyOf(원본 배열, 복사할 길이)
		String[] arrayCopy = Arrays.copyOf(str,str.length);
		System.out.println("str: "+Arrays.toString(str));
		System.out.println("arrayCopy: "+Arrays.toString(arrayCopy));
		System.out.printf("======================================\n");
		
		arrayCopy[2] = "z";
		System.out.println("str: "+Arrays.toString(str));
		System.out.println("arrayCopy: "+Arrays.toString(arrayCopy));
		System.out.printf("======================================\n");
		
		// 3. clone()
		Circle c1 = new Circle(new Point3(5,10),3);
		Circle c2 = c1.clone();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.printf("======================================\n");
		
		c1.r = 100;
		c1.p.x = 8;
		System.out.printf("c1의 r: %s\n",c1);
		System.out.printf("c2의 r: %s\n",c2);
		System.out.printf("======================================\n");
		
		Circle c3 = c1.deepClone();
		c1.r = 50;
		c1.p.x = 10000;
		System.out.println("c1: "+c1);
		System.out.println("c3: "+c3);
		System.out.printf("======================================\n");
		
		// 배열에서의 clone은 기본으로 되어 있음
		int[] num = {1,2,3};
		int[] numCopy = num.clone();
		numCopy[0] = 100;
		System.out.println("num[]: "+Arrays.toString(num));
		System.out.println("numCopy[]: "+Arrays.toString(numCopy));
	}
}
