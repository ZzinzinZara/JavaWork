package _01_arrayList_vector;

import java.util.ArrayList;
import java.util.List;

public class T02_ArrayList2 {

	public static void main(String[] args) {
		// 권장하는 방법은 아님
		// 모든 객체를 받을 수 있음
		List list = new ArrayList();
		
		list.add(1);
		list.add(3.14);
		list.add("5");
		
		Object num = list.get(0);
		int num1 = (int)list.get(0);
		
		System.out.println(num1);
		
		double num2 = (double)list.get(1);
		System.out.println(num2+1); // 소수점 왜 늘어남?
		
		String num3 = (String)list.get(2);
		System.out.println(num3);
		
		int num4 = Integer.parseInt((String)list.get(2));
		System.out.printf("합계: %.2f\n",(num1+num2+num4));
	}

}
