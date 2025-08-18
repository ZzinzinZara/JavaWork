package _02_StringMethod;

public class T08_replace {

	public static void main(String[] args) {
		// replace: 글차 치환
		String str = "남궁용진";
		String newStr = str.replace("남궁", "이");
		System.out.println(newStr);
		
		str = "javaprogram java aws java dajava";
		newStr = str.replace("java","자바");
		System.out.println(newStr);
		
		// replaceFirst 처음 하나만 바뀜
		newStr = str.replaceFirst("java","자바");
		System.out.println(newStr);
		
		// replaceAll 결과는 replace와 동일하지만, 정규표현식 지원함
		str = "javaprogram java aws java dajava";
		newStr = str.replaceAll("java","자바");
		System.out.println(newStr);
	}

}
