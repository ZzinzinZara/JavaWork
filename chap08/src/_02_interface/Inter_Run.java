package _02_interface;

public class Inter_Run {

	public static void main(String[] args) {
		Inter i = new InterClass();
		i.print(100);
		i.method();
		System.out.println(i.str("남궁용진"));
		
		// i.MAX = 50; 상수라서 변경 불가
		System.out.printf("최대값: %d\n",i.MAX);
	}

}
