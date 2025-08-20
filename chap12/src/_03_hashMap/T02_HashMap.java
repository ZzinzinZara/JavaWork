package _03_hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class T02_HashMap {

	public static void main(String[] args) {
		/*
		 * HashMap 생성하여 3개 넣기
		 * 	Map<String, String>
		 * 		  id      pw
		 * 	1. 사용자로부터 id, pw를 입력받아서
		 * 		=> 아이디가 없으면 "id가 존재하지 않습니다" 출력 후 다시 실행
		 * 		=> 비밀번호가 없으면 "password가 존재하지 않습니다" 출력 후 다시 실행
		 * 		=> 아이디와 비밀번호가 일치하면 "로그인 되었습니다" 출력 후 종료
		 */
		
		Map<String, String> login = new HashMap<>();
		Scanner s = new Scanner(System.in);
		
		login.put("skarnddydwls","dydwls12");
		login.put("skarnd","dydwls");
		login.put("dydwls","skarnd");		
		
		while(true) {
			System.out.printf("아이디를 입력하세요 >> ");
			String id = s.nextLine();
			System.out.printf("비밀번호를 입력하세요 >> ");
			String pw = s.nextLine();
			
			// Key, Value안에 id, pw가 있는지 확인할 때 쓰는 메소드 
			if(!login.containsKey(id) || !login.containsValue(pw)) {
				System.out.println("로그인 실패");
			} else {
				System.out.println("로그인 성공");
				break;
			}
		}
				
//		Set<Map.Entry<String,String>> entrySet = login.entrySet();
//		Iterator<Map.Entry<String, String>> entryIterator = entrySet.iterator();
//		Map.Entry<String, String> entry = entryIterator.next();
//		String key=entry.getKey(); 
//		String value=entry.getValue();

		
		
//		if (!key1.equals(id)) {
//			System.out.println("id가 일치하지 않습니다");
//		}
//		
//		if (!value1.equals(pw)) {
//			System.out.println("password가 일치하지 않습니다");
//		} 
//		
//		else if (key1.equals(id) && value1.equals(pw))
//			System.out.println("로그인에 성공하였습니다");
	}

}
