package _02_StringMethod;

public class T03_contains {

	public static void main(String[] args) {
		// contains: 문자열 안에 찾고자하는 문자열이 포함되어 있는지 검사
		String str="HTML 프로그래밍";
		System.out.println(str.contains("프"));
		System.out.println(str.contains("프로그래밍"));
		System.out.println(str.contains("가가"));
		
		if(str.contains("HTML")) System.out.printf("웹 페이지를 만드는 프로그램\n");
		else System.out.println("기타 프로그램");
	}

}
