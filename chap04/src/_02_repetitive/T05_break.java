package _02_repetitive;

public class T05_break {

	public static void main(String[] args) {
		int sum=0;
		int i;
		for(i=0;i<100;i++) {
			sum += i; 
			if(sum > 1000) break;
		}
		System.out.printf("%d,  %d\n",i,sum);
		System.out.printf("===============================\n");
		
		// for문 이름 지어주기
		outer: for (int dan=2; dan<10; dan++) {
			for(int j=1;j<10;j++) {
				System.out.printf("%d * %d = %d\n",dan, j, dan*j);
				if(j==5) break outer;
			}
		}
		
		System.out.printf("===============================\n");
		
		
		
	}

}
