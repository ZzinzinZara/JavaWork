package _01_arrayList_vector;

/*
 * List 계열
   - 특징 : 순서가 있다
   			중복저장 가능
   	 1. ArrayList : 싱글스레드에서 사용
   	    > 초기배열 10개를 만듬 -> 10개가 부족하면 그의 배수로 더 만들어 줌
   	    > 배열의 갯수를 지정할 수 있음 : new ArrayList<>(배열의 갯수)
   	    > 부모자료형으로 형변환하여 많이 사용함
   	      List<자료형> 변수명 = new ArrayList<자료형>();
   	      
   	 2. Vector : ArrayList와 사용방법 동일
   	 			 멀티스레드에서 사용
   	 3. LinkedList : 
   	 
 * 제네릭
   자료형을 제네릭으로 받음
   ArrayList<T>  => 모든 자료형을 받을 수 있다
   					클래스 객체가 들어올 때 사용자가 임의로 이름을 짓기때문에 이름 알수가 없다
 */

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
