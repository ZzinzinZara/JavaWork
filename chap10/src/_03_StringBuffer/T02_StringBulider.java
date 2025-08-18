package _03_StringBuffer;

public class T02_StringBulider {

	public static void main(String[] args) {
		// 동기화만 다르고 StringBuffer와 동일
		StringBuilder sb = new StringBuilder();
		
		sb.append("java");
		sb.append(" program study");
		System.out.println(sb);
		
		sb.insert(4, 2);
		System.out.println(sb);
		
		sb.setCharAt(4,'7');
		System.out.println(sb);
	}

}
