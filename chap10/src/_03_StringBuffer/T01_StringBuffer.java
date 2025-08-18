package _03_StringBuffer;
/*
 * String(불변성): 한 번 객체가 생성되면 덮어쓰기 안됨(무조건 새로 생성)
 * 				  변하지 않는 문자열 사용할 때 
 * StringBuffer: 추가, 삭제, 수정 가능. 동기화 지원
 * 				 자주 변경되는 문자열을 사용할 때
 * 				 멀티스레드 환경에서 사용
 * StringBulider: 추가, 삭제, 수정 가능. 동기화 지원
 * 				  자주 변경되는 문자열을 사용할 때
 * 				  단일스레드 환경에서 사용
 * 				  StringBuffer보다 빠름
 */

public class T01_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer(); // 기본적으로 16문자를 담을 수 있는 객체 생성
		StringBuffer sb2 = new StringBuffer(30); // 30문자를 담을 수 있는 객체 생성
		// 기본 16문자 + 3문자?
		StringBuffer sb3 = new StringBuffer("abc"); // "abc"의 값이 들어있는 객체 생성
		
		System.out.println("sb1의 길이 "+sb1.length());
		System.out.println("sb2의 길이 "+sb2.length());
		System.out.println("sb3의 길이 "+sb3.length());
		
		// buffer는 equals는 오버라이딩 하지 않음
		StringBuffer sb4 = new StringBuffer("abc");
		System.out.println(sb3 == sb4);
		System.out.println(sb3.equals(sb4)); // 주소를 같냐고 물어보는거랑 같음
		System.out.println("=======================================");
		
		// toString은 오버라이딩 되어 있음(값으로 들어있는 문자열 반환)
		System.out.println(sb3);
		sb3.append("def");
		System.out.println(sb3);
		sb3.append(123);
		System.out.println(sb3);
		sb3.append(true);
		System.out.println(sb3);
		System.out.println("=======================================");
		
		// delete()
		sb3.deleteCharAt(8);
		System.out.println(sb3);
		sb3.delete(3, 6);
		System.out.println(sb3);
		sb3.delete(3, sb3.length());
		System.out.println(sb3);
		System.out.println("=======================================");
		
		// insert(얼만큼떨어뜨려서, 문자열)
		sb3.insert(1,"123");
		System.out.println(sb3);
		sb3.insert(4,"남궁");
		System.out.println(sb3);
		
		// replace(start, end, 문자열)
		sb3.replace(0, 1, "용진");
		System.out.println(sb3);
		
		// reverse(): 뒤에서부터 거꾸로
		System.out.println(sb3.reverse());
		
		// capacity(): StringBuffer의 객체가 생성될 때 버퍼의 크기
		//				기본 버퍼크기 16문자 + 문자크기
		System.out.println("sb1 버퍼크기: "+sb1.capacity());
		System.out.println("sb2 버퍼크기: "+sb2.capacity());
		System.out.println("sb4 버퍼크기: "+sb4.capacity());
		
		
	}
}
