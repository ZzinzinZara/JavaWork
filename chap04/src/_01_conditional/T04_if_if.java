package _01_conditional;

public class T04_if_if {

	public static void main(String[] args) {
		// if문 안에 if문이 중첩으로 들어감
		int n1 =100;
		
		if(n1 >= 100) { // 100보다 큰 수
			if(n1>200) { // 200보다 큰 수
				System.out.printf("200보다 큰수\n");
			} else {
				System.out.printf("100보다 크고 200보다 작은 수\n");
			}
		} else if (n1 <=100) { // 100보다 작은 수
			if (n1 > 0) {
				System.out.printf("100보다 작은 수\n");
			}else if(n1 == 0) {
				System.out.printf("0입니다\n");
			}else{
				System.out.printf("음수\n");
			}
		}
	}
}
