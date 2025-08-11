package _07_Static;

public class Static_Run {

	public static void main(String[] args) {
		System.out.println(Static_Field.stNum);
		System.out.println(Static_Field.stName);
		System.out.printf("\n");
		
		Static_Field sf = new Static_Field();
		System.out.println(sf.num);
		System.out.println(sf.name);
		
		
		// 정적 필드나 정적 메소드
		// - 클래스명.정적필드명
		// - 클래스명.정적메소드명
		// 정적 필드는 참조변수, 정적 필드명으로도 사용 가능
		// 그러나 정적 필드는 클래스명.정적필드명으로 사용하는걸 권장
		String stName = sf.stName;
		
		Static_Field.stMethod();
	}

}

/*
 * 인스턴스 변수는 new 키워드를 통해 객체를 생성해야 된다.
 * 그래서 10라인에서 객체를 생성하지 않고 그 위에서 호출하려고 하면
 * 생성이 되지 않았기에 접근이 불가능하다.
 * 
 * 정적 메소드
 * 정적 필드(메소드)만 사용가능
 * 	- 정적 필드는 객체를 생성하지 않아도 사용가능 하지만
 * 	  인스턴스 필드는 반드시 객체가 생성되어야만 사용할 수 있다.
 * 	  정적 필드에서 인스턴스 필드를 사용할 때는 반드시 객체가 생성되어 있다는 것을
 * 	  담보할 수 없기 때문에
*/
