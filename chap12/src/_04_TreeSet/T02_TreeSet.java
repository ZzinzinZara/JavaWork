package _04_TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class T02_TreeSet {

	public static void main(String[] args) {
		Integer[] arr = {1,4,6,7,3,2,8,9,5,4,2,6,7,9};
		
		TreeSet<Integer> set = new TreeSet<>();
		for(Integer i: arr) {
			set.add(i);
		}
		System.out.println(set);
		
		/*
		 *  NavigableSet
		 *  	Java의 set 인터페이스를 확장한 컬렉션 인터페이스
		 *  	정렬된 순서로 저장하고, 그 요소에 다양한 탐색작업을 지원하는 메소드 제공
		 *  	SortedSet 인터페이스도 확장하고 있기에, 정렬된 순서로 데이터를 다룰 수 있음
		 *  
		 *  lower
		 *  floor
		 *  ceiling
		 *  higher
		 *  pollFirst(): 첫번째 요소를 제거하고 그 요소를 반환
		 *  pollLast(): 마지막 요소를 제거하고 그 요소를 반환
		 *  descendingSet(): 내림차순으로 정렬한 요소를 반환
		 *  headSet(기준, true): true면 기준 값 포함, flase면 기준 값 미포함
		 */
		
		NavigableSet<Integer> desending = set.descendingSet();
		System.out.println(desending);
		
		Integer[] score = { 100,12,64,97,88,45,50};
		TreeSet<Integer> setScore = new TreeSet<>();
		for(Integer i: score) {
			setScore.add(i);
		}
		System.out.println(setScore);
		
		// headSet은 false가 기본값
		System.out.println("88점 미만: "+setScore.headSet(88));
		// tailSet은 true가 기본값
		System.out.println("88점 이상: "+setScore.tailSet(88));
		//
		System.out.println("50점 이상 100점 미만: "+setScore.subSet(50,true,100,false));
	}

}
