package _02_Scanner;

import java.util.Scanner;

public class T02_Ex01 {
	// static 변수를 사용할거면 main 밖에서 해야 됨

	public static void main(String[] args) {
		// 국어, 컴퓨터, 수학 점수를 입력받아 저장하고, 총점과 평균을 출력
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("국어 점수 >> ");
		int ko = s.nextInt();
		
		System.out.print("컴퓨터 점수 >> ");
		int com = s.nextInt();
		
		System.out.print("수학 점수 >> ");
		int ma = s.nextInt();
		
		int total = ko + com + ma;
		
		double avg = total / 3; 
		
		System.out.println("총점: "+total);
		System.out.println("평균: "+avg);
	}

}
