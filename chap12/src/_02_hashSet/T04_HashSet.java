package _02_hashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class T04_HashSet {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		// 1~45 숫자중 6개(중복X) 추출하여 set에 넣기
		
		int random=0;
		
		while(set.size() < 6) {
			set.add(((int)(Math.random()*45))+1);
		}
		System.out.println(set);
		
		// 뭘 써도 상관 없음
		List list1 = new ArrayList(set);
		List list2 = new Vector(set);
		List list3 = new LinkedList(set);
		
		Collections.sort(list1);
		System.out.println(list1);
		
	}
}
