package _01_exception;

public class T03_nullPoint {

	public static void main(String[] args) {
		String data = null;
		/*
		 * 참조변수를 출력하면 -> toString() 호출 -> 패키지이름.클래스명@주소
		 * but, 참조변수에 null이 있으면 toString()을 호출하지 않고, null 출력
		 */
		System.out.println(data);
		try {
			System.out.println(data.toString());
		} catch (Exception e) {
			System.out.printf("데이터가 들어있지 않습니다\n");
			System.out.printf("예외 메시지: %s\n",e);
		}
	}

}
