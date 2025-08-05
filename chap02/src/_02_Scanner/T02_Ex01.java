package _02_Scanner;

import java.util.Scanner;

public class T02_Ex01 {
	// static 변수를 사용할거면 main 밖에서 해야 됨

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자 입력 >> ");
		int n = s.nextInt();
		
		if(n==1) {
		  // 1. 문자 하나를 입력받아 그 문자의 유니코드를 출력하기
		  System.out.println("문자를 입력하세요 >> "); 
		  char ch1 = s.next().charAt(0);
		  System.out.println((int)ch1);
		  System.exit(0);
		}
		  
		if(n==2) {
		  // 2. 국어, 컴퓨터, 수학 점수를 입력받아 저장하고, 총점과 평균을 출력 
		  System.out.print("국어 점수 >> ");
		  int ko = s.nextInt();		
		  System.out.print("컴퓨터 점수 >> "); 
		  int com = s.nextInt();
		  System.out.print("수학 점수 >> "); 
		  int ma = s.nextInt();
		  
		  int total = ko + com + ma;
		  
		  double avg = total / 3;
		  
		  System.out.println("총점: "+total); System.out.printf("평균: %.2f",avg);
		  System.exit(0);
		}
		
		if(n==3) {
			// 3.
			int iNum1 =10;
			int iNum2 =4;
			float fNum=3.0f;
			double dNum = 2.5;
			char ch = 'K';
			
			// 3.1  iNum1 / iNum2의 몫 출력
			System.out.println(iNum1/iNum2);
			// 3.2  iNum2 * dNum 한 결과를 변수에 넣고 출력하기
			double result1 = iNum2 * dNum;
			System.out.println(result1);
			// 3.3  iNum1의 값이 10.0으로 출력되게 하기
			System.out.println((double)iNum1);
			// 3.4  iNum1 / iNum2 한 결과 소수점까지 나오게 출력하기
			System.out.println((double)iNum1/iNum2);
			// 3.5  iNum1 / fNum 한 결과 3이 출력되게 하시오
			System.out.println(iNum1 / (int)fNum);
			// 3.6  iNum1 / fNum 한 결과 소수점 13자리이상까지 나오게 하시오
			System.out.printf("%.13f\n",iNum1/fNum);
			// 3.7  ch변수의 유니코드 출력하기
			System.out.println((int)ch);
			// 3.8  ch변수에 1을 더해 L 이 출력되게 하시오
			int intch = ch + 1;
			System.out.println((char)intch);
			System.exit(0);
		}
	}

}
