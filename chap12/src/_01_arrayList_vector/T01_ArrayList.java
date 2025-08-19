package _01_arrayList_vector;

import java.util.ArrayList;
import java.util.List;

public class T01_ArrayList {

	public static void main(String[] args) {
//		ArrayList<String> alias = new ArrayList<>();
		List<String> list = new ArrayList<>();
		
		list.add("java");
		list.add("JDBC");
		list.add("servlet/JSP");
		list.add(2,"DataBase");
		list.add("iBatis");
		System.out.println("총 객체수: "+list.size());
		System.out.println(list);
		
		// 얻어올 때
		System.out.println("index 2번: "+list.get(2));
		System.out.println();
		
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(str);
		}
		System.out.printf("-----------------------\n");
		
		for (String str:list) {
			System.out.println(str);
		}
		
		System.out.printf("-----------------------\n");
		/*
		 * 삭제
		 * Object remove(index)
		 * boolean remove(객체)
		 * void clear(): 모두 삭제
		 */
		System.out.println("삭제한 객체: "+list.remove(1));
		System.out.println(list.size());
		
		list.remove("Java");
		for(String str: list) {
			System.out.println(str);
		}
	}

}
