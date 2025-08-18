package _02_StringMethod;

public class T12_trim {

	public static void main(String[] args) {
		// 문자의 맨앞과 맨뒤의 공백 제거
		String str = "     react    program    ";
		System.out.println(str+";");
		System.out.println(str.trim()+";"); // 중간에 있는 공백은 제거하지 않음
	}

}
