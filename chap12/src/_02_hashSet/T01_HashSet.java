package _02_hashSet;
/*
 * Set
 *  1. 순서가 없다
 *  2. 데이터가 중복될 수 없다
 * 1. HashSet
 * 2. TreeSet
 * 3. LinkedHashSet
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Hash1 {
	String str;
	Hash1(String str){
		this.str=str;
	}
	
	@Override
	public String toString() {
		return str;
	}
}

public class T01_HashSet { 

	public static void main(String[] args) {
		HashSet set1 = new HashSet();
		Set set2 = new HashSet();
		
		Hash1 h1 = new Hash1("A");
		set2.add(h1);
		set2.add(new Hash1("B"));
		set2.add(new Hash1("C"));
		set2.add(new Hash1("D"));
		set2.add(new Hash1("E"));
		
		System.out.println("총 개수: "+set2.size());
		
		Iterator<Hash1> iterator = set2.iterator();
		// hasNext -> 남아있는 객체가 있으면 true, 없으면 false
		while(iterator.hasNext()) {
			Hash1 h = iterator.next();
			System.out.print(h.str+" ");
		}
		System.out.println();
		System.out.println(set2);
		
		System.out.print("set2 출력: "); 
		iteratorPrint(set2.iterator());
		
		set2.remove(h1);
		System.out.print("h1(A) 삭제 후: ");
		iteratorPrint(set2.iterator());
		
		// "C" 삭제하고 출력
		iterator = set2.iterator();
		while(iterator.hasNext()) {
			Hash1 h = iterator.next();
			String st = h.str;
			if (st.equals("C"))
				iterator.remove();
		}
		System.out.print("h1(C) 삭제 후: ");
		iteratorPrint(set2.iterator());	
	}
	static void iteratorPrint(Iterator<Hash1> h) {
		while(h.hasNext()) {
			Hash1 ha = h.next();
			System.out.print(ha.str + " ");
		}
		System.out.println();
	}
}
