package _01_arrayList_vector;

import java.util.LinkedList;
import java.util.List;

/*
 * LinkedList 
 *  배열의 단점을 보완하여 나옴
 *  연속적으로 붙어있지 않고, 다음 데이터를 연결하는 참조주소를 가지고 있음
 */

public class T06_LinkedList {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(10); // 맨끝에 추가
		list.add(0,20); // 첫번째인자(인덱스번호) 위치에 추가
		list.addFirst(30); // 맨 앞에 추가
		list.addLast(1); // 맨 끝에 추가
		System.out.println(list); // 이건 왜 이렇게 출력이 되지? 
		// ==> 이건 값을 추가한거고 T05는 객체를 추가한거라서 주소값으로 출력됨
		
		// 삭제
		list.remove(1); // 인덱스번호에 있는 값 삭제
		System.out.println(list);
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		
		// 검색시 비효율적
		for(int i=0;i<list.size();i++) {
			list.get(i);
		}
	}

}
