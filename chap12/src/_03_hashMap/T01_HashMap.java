package _03_hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map
 *  키와 값의 쌍으로 이루어짐
 * 	값을 얻어올 때 키 값으로 얻어옴 그러므로 키는 중복 불가, 값은 중복 허용
 *  Map계열은 Collection을 구현한 클래스가 아님
 *  	: 넣을 때는 put() 사용
 *  	: 가져올 때는 get() 사용
 * 1. HashMap
 * 2. TreeMap
 */

public class T01_HashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		// 객체 넣기
		map.put("아무개", 97);
		map.put("더조은",100);
		map.put("홍길동",86);
		map.put("남궁용진",76);
		
		// Entry 개수
		System.out.println("entry의 수: "+map.size());
		
		// 객체 찾기
		System.out.println("홍길동: "+map.get("홍길동")); // 키 "홍길동"을 통해 값을 얻어옴
		System.out.println(map);
		
		// 객체 삭제
		map.remove("홍길동"); System.out.println("entry의 수: "+map.size());
		
		// 키만 얻어오기
		Set<String> keySet = map.keySet();
		System.out.println(keySet);
		
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key+": "+value);
		}
		
		System.out.printf("――――――――――――――――――――――――――――――\n");
		
		// 키와 값이 들어있는 entrySet
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key=entry.getKey(); // 키 가져오기
			Integer value=entry.getValue(); // 값 가져오기
			System.out.println(key+": "+value);
		}
	} 

}
