package _01_conditional;

import java.util.Scanner;

public class T03_multiIf {

	public static void main(String[] args) {
		// 사용자로부터 정수를 입력받아서 학점 출력
		Scanner s = new Scanner(System.in);
		
		System.out.printf("학점을 입력하세요 >> ");
		int score = s.nextInt();
		
		if(score > 100 || score < 0) {
			System.out.printf("점수를 잘못 입력했습니다.\n");
		} else if (score > 89){
			System.out.printf("A학점\n");
		} else if (score >79) {
			System.out.printf("B학점\n");
		} else if (score > 69) {
			System.out.printf("C학점\n");
		} else if( score > 59) {
			System.out.printf("D학점\n");
		}else {
			System.out.printf("낙오자\n");
		}
	}

}
