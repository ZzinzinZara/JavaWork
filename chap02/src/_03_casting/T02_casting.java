package _03_casting;

public class T02_casting {

	public static void main(String[] args) {
		System.out.println("byte크기: "+ Byte.MIN_VALUE + " ~ "+ Byte.MAX_VALUE);
		System.out.println("short크기: "+Short.MIN_VALUE + " ~ "+Short.MAX_VALUE);
		System.out.println("int크기: "+Integer.MIN_VALUE+" ~ "+Integer.MAX_VALUE);
		System.out.println("char크기: "+(int)Character.MIN_VALUE+" ~ "+(int)Character.MAX_VALUE);
		System.out.println("========================================");
		
		int num1 = 1234;
		byte b1 = (byte)num1; // byte가 더 작아서 형변환
		
		System.out.println(b1);
		
		Long long1=3214567894L; // 'L'이 없으면 int형으로 간주
		float f1 = long1;
		System.out.println(f1);
		
		int num2 = 51648;
		char ch1 = (char)num2;
		System.out.println(ch1);
	}
}
