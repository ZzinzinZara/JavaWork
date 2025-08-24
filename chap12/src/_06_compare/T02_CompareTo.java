package _06_compare;

import java.util.Arrays;
import java.util.Comparator;

class Descending implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {

		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			// return c1.compareTo(c2) 오름차순
			// return c2.compareTo(c1) 내림차순
			return c2.compareTo(c1);
			/*
			 * c2가 c1보다 작으면 음수를 반환
			 * c2가 c1보다 크면 양수를 반환
			 */
		}
		return -1; 
		/*
		 * -1: o1이 o2보다 앞에옴
		 * 0 : o1과 o2의 위치가 같음
		 * 1 : o1이 o2보다 뒤에옴
		 */
	}

}

public class T02_CompareTo {

	public static void main(String[] args) {
		String strArr[] = {"cat","Dog","lion","tiger"};
		
		Arrays.sort(strArr); // String의 Comparable 구현에 의해 정렬 (유니코드 순)
		System.out.println("strArr: "+Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분하지 않음
		System.out.println("strArr: "+Arrays.toString(strArr));
		
		// 내림차순 정렬의 class api 만들어서 구현
		// sort에 1이 들어오면 순서를 바꿔야 된다고 판단
		Arrays.sort(strArr, new Descending());
		System.out.println("strArr: "+Arrays.toString(strArr));
	}
}
