package _01_operation;

import java.util.Scanner;

public class T05_threeOp {

	public static void main(String[] args) {
		// 삼항연산자 -> 조건식 ? 조건이 참일 때 실행: 조건이 거짓일 때 실행
		int n1 =10;
		int n2 =7;
		
		String str = n1 < n2 ? "n1이 더 작다" : "n1가 더 크다";
		System.out.println(str);
		
		char ch1 = n1 < n2 ? '소' : '대';
		System.out.println(ch1);
		
		int n3 = -5; 
		int n4 = n3 < 0 ? -n3 : n3;
		System.out.println(n4);
		
		// 사용자로 부터 점수를 입력 받아 80점 이상이면 합격 아니면 불합격
		Scanner s = new Scanner(System.in);
		System.out.print("점수를 입력하세요 >> ");
		int score = s.nextInt();
		String result = score >= 80 ? "합격": "불합격"; 
		System.out.println(result);
		
		String str2 = score > 100 ? "점수를 잘못 입력하였습니다" : 
		score >= 90 ? "A" :
		score >= 80 ? "B" :
		score >= 70 ? "C" :
		score >= 60 ? "D" :
		score > 0 ? "F" : "점수를 잘못 입력하였습니다";
		
		System.out.println("당신의 학점은: " + str2);
		
		score /= 10;
		// switch 사용 예시
		switch (score) 
		{
		case 10: 
		case 9: {
			System.out.println('A');
			break;
		}
		case 8: {
			System.out.println('B');
			break;
		}
		case 7: {
			System.out.println('C');
			break;
		}
		case 6: {
			System.out.println('D');
			break;
		}
		default:{
			System.out.println("F");
			break;
		}
		}
	}

}
