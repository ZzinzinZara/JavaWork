package _02_StringMethod;
/*
 * lastIndexOf(): indexOf와 달리 얘는 뒤에서부터 탐색함
 * lastIndexOf(char): 앞에서부터 찾아서 char의 문자의 index 번호 반환
 * lastIndexOf(char, fromIndex): fromIndex 번호부터 탐색 시작
 * lastIndexOf(String): 앞에서부터 문자열의 시작 index번호 반환
 * lastIndexOf(String, fromIndex): fromIndex 번호부터 찾아서 문자열의 시작 index번호 반환
 */

public class T07_lastIndexOf {

	public static void main(String[] args) {
		String str = "abcabcabca";
		System.out.println(str.lastIndexOf('a'));
		System.out.println(str.lastIndexOf("abc"));
		
		// fromIndex는 index 앞을 보고, 문자열이 걸쳐져 있으면 그 문자열도 찾는다
		System.out.println(str.lastIndexOf("abc",6));
		System.out.println(str.lastIndexOf("abc",4));
		System.out.println(str.lastIndexOf("abc",5));
	}

}
