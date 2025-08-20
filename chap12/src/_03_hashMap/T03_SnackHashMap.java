package _03_hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class T03_SnackHashMap {

	public static void main(String[] args) {
		Map<String, Snack> hm = new HashMap<>();
		
		hm.put("새우깡",new Snack("짠맛", 500));
		hm.put("감자칩",new Snack("짠맛", 700));
		hm.put("허니버터칩",new Snack("단맛", 400));
		hm.put("원칩",new Snack("매운맛", 600));
		
//		System.out.println(hm);
		
		// 1. put(): 키 값이 없으면 추가, 키 값이 있으면 값 변경
		hm.put("새우깡", new Snack("매운맛",700));
//		System.out.println(hm);
		
		// 2. get(Object key): 키에 해당하는 값 반환
		Snack s = hm.get("원칩");
//		System.out.println(s);
		
		// 3. size(): 객체의 개수 반환
		int size = hm.size();
//		System.out.println(size);
		
		// 4. replace(K key, V value): 해당 키를 찾아서 전달한 값 
		//                             만약 키가 없으면 아무것도 안 함
		// put을 사용해도 돼서 잘 사용하지 않음. put은 없으면 추가됨
		// 추가하고 싶지 않고, 변경만 하고 싶은 경우 사용(실수를 방지)
		hm.replace("감자칩",new Snack("짠맛",100));
		hm.replace("원썬",new Snack("짠맛",100)); // 아무것도 안 함
		System.out.println(hm);
		
		Set keySet = hm.keySet();
		Iterator itKey = keySet.iterator();
		
		while(itKey.hasNext()) {
			String key = (String)itKey.next();
			Snack value = hm.get(key);
			System.out.println(key+": "+value.getFlavor()+", "+value.getCalory());
		}
	}

}
