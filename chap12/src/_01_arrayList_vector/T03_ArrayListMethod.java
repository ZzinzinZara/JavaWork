package _01_arrayList_vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class T03_ArrayListMethod {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
//		List<Integer> list2 = List.of(1,2,3);
//		List<Integer> list3 = new ArrayList<>();
		
		/*
		 * for(int i=1;i<101;i++) { list.add(i); }
		 */
		
		System.out.println(list);
		
		List<Integer> list1 = new ArrayList<>(list.subList(1, 4)); // index -> 1~3
		System.out.println(list1);
		
		Collections.reverse(list); // 반환형이 void
		System.out.println("내림자순 >> "+list);
		Collections.sort(list); // 반환형이 void
		System.out.println("오름차순 >> "+list);
		System.out.printf("――――――――――――――――――――――――――――――――\n");
		
		System.out.println("list는 list1의 요소를 모두 갖고 있? "+ list.containsAll(list1));
		System.out.printf("――――――――――――――――――――――――――――――――\n");
		
		List<String> slist = new ArrayList<>();
		
		slist.add("B");
		slist.add("C");
		slist.add(2,"A");
		slist.add(3,"AA");
		System.out.println(slist);
		
		List<String> slist2 = new ArrayList<>();
		slist2.add("A");
		slist2.add("B");
		slist2.add("F");
		slist2.add("Z");
		System.out.println(slist2);
		
		// 겹치는 부분만 남기고 나머지 삭제
		System.out.println("겹치는 부분 남기고 삭제: "+slist.retainAll(slist2));
		System.out.println(slist);
	}

}
