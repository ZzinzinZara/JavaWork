package _05_TreeMap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class T01_TreeMap {

	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		treeMap.put("apple", 10);
		treeMap.put("forever", 60);
		treeMap.put("banana",20);
		treeMap.put("cat", 50);
		treeMap.put("egg", 100);
		
		System.out.println("c~f 사이 단어 검색");
		NavigableMap<String,Integer> rangeMap = treeMap.subMap("c",true,"f",true);
		
		for(Map.Entry<String, Integer> entry: rangeMap.entrySet()) {
			System.out.println(entry.getKey()+"-"+entry.getValue()+"원");
		}
	}

}
