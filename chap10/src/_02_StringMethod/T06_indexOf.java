package _02_StringMethod;
/*
 * indexOf 오버로딩이 되어있고, 찾는 문자가 없으면 -1 반환, 있으면 index번호 반환
 * indexOf(): 앞에서부터 탐색함
 * indexOf(char): 앞에서부터 찾아서 char의 문자의 index 번호 반환
 * indexOf(char, fromIndex): fromIndex 번호부터 탐색 시작
 * indexOf(String): 앞에서부터 문자열의 시작 index번호 반환
 * indexOf(String, fromIndex): fromIndex 번호부터 찾아서 문자열의 시작 index번호 반환
 */

public class T06_indexOf {

	public static void main(String[] args) {
		String str = "java programing";
		System.out.println(str.indexOf('r'));
		System.out.println(str.indexOf('x')); // 없으면 -1 반환
		System.out.println(str.indexOf('a',5));
		System.out.println(str.indexOf("va pro"));
		System.out.println(str.indexOf("va",5));
		
		if(str.indexOf("java")<0) System.out.println("자바 프로그램이 아닙니다");
		else System.out.println("자바 프로그램 입니다");
	}

}
