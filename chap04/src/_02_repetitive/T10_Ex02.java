package _02_repetitive;

import java.util.Scanner;

public class T10_Ex02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		// 1.  주사위의 숫자 맞추기 게임
	    // 랜덤으로 주사위숫자(1~6숫자 중 1개) 만들기
	    // 사용자로 부터 숫자 입력받아서
	    // 숫자를 맞추면 '축하합니다. 맞췄습니다' 하고 끝내기
	    // 못맞췄으면 계속 물어보기
		
		if(n==1) {
			s.nextLine();
			while(true) {
				int ran1 = (int)(Math.random() * 6) +1;
				System.out.printf("주사위의 숫자를 입력하세요 >> ");
				int ex = s.nextInt();
				
				if(ran1 == ex) {
					System.out.printf("주사위 숫자 %d, 정답\n", ran1); 
					break;
				}
				else if(ran1 != ex) System.out.printf("주사위 숫자 %d, 오답\n", ran1);
			}
		}
		
		// 2. 1부터 100까지의 정수 중 5의 배수의 합계를 출력하는 프로그램 작성
		if(n==2) {
			s.nextLine();
			int sum = 0;
			
			for(int i=1;i<101;i++) {
				if(i%5==0) sum+=i;
			}
			System.out.printf("%d\n",sum);
		}
		
		// 3. 1부터 100까지의 수 중 짝수와 홀수의 합을 각각 구하기
		if(n==3) {
			s.nextLine();
			int sum1=0;
			int sum2=0;
			s.nextLine();
			for(int i=1;i<101;i++) {
				if(i%2==0) sum1 += i;
				else sum2 += i;
			}
			System.out.printf("홀수 합 %d\n",sum2);
			System.out.printf("짝수 합 %d\n",sum1);
		}
		
		// 4. 두 개의 주사위 눈이 합이 6이 되는 모든 경우의 수를 출력
		if(n==4) {
			s.nextLine();
			for(int i=1;i<7;i++) {
				for(int j=1;j<7;j++) {
					if(i+j==6) System.out.printf("(%d, %d)\n",i,j);
				}
			}
		}
		
		// 5. 
		if(n==5) {
			s.nextLine();
			for(int i=1;i<6;i++) {
				for(int j=0;j<i;j++) {
					System.out.printf("*");
				}
				System.out.printf("\n");
			}
		}
		
		// 6.
		if(n==6) {
			s.nextLine();
			for(int i=5;i>0;i--) {
				for(int j=0;j<i;j++) {
					System.out.printf("*");
				}
				System.out.printf("\n");
			}
		}
		
		// 7.
		if(n==7) {
			s.nextLine();
			for(int i=1;i<6;i++) {
				System.out.printf("    ");
				for(int j=1;j<=9;j+=2) {
					System.out.printf("*");
				}
				System.out.printf("\n");
			}
		}
		
		if(n==8) {
			s.nextLine();
			int count =0;
			while(true) {
				count++;
				int num = (int)(Math.random() *6)+1;
				System.out.printf("%d\n",num);
				if(num==6) {
					System.out.printf("굴린 횟수 %d회\n",count);
					break;
				}
			}
		}
	}
}
