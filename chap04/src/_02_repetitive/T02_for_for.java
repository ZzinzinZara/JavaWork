package _02_repetitive;

public class T02_for_for {

	public static void main(String[] args) {
		// 중첩 for문
		// 구구단
		/* for(int i=2; i<10;i++) {
			System.out.printf("%d단\n",i);
			for(int j=1;j<10;j++) {
				System.out.printf("%d x %d = %d\n",i,j,i*j);
			}
			System.out.printf("\n");
		} */ 
		
		// 구구단 ver.2
		for(int i=1; i<10;i++) {
			for(int j=2;j<10;j++) {
				System.out.printf("%d x %d = %d\t",j,i,i*j);
			}
			System.out.printf("\n");
		}
	}
} 
