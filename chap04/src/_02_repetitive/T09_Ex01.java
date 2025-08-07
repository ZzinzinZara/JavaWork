package _02_repetitive;

import java.util.Scanner;

public class T09_Ex01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		//1. 사용자로부터 국어, 영어, 수학 점수를 입력받아 
		//   세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
		//   (if문으로)
		if(n==1) {
			s.nextLine();
			System.out.printf("국어, 영어, 수학 점수를 입력하세요 >> ");
			int n1 = s.nextInt();
			int n2 = s.nextInt();
			int n3 = s.nextInt();
			
			int sum=n1+n2+n3;
			
			if(n1<40||n2<40||n3<40||sum<60) System.out.printf("불합격\n");
			else System.out.printf("합격\n");
		}
		
		//2. id와 비밀번호를 변수에 저장하고
		//   사용자로부터 아이디와 비밀번호를 입력 받아
		//   아이디와 비밀번호가 모두 맞으면 "로그인 성공"출력
		//   아이디가 틀렸으면 "아이디가 틀렸습니다"출력
		//   비밀번호가 틀렸으면 "비밀번호가 틀렸습니다"출력
		
		if(n==2) {
			s.nextLine();
			System.out.printf("아이디를 입력하세요 >> ");
			String id = s.nextLine();
			System.out.printf("비밀번호를 입력하세요 >> ");
			String pass = s.nextLine();
			
			System.out.printf("아이디를 입력하세요 >> ");
			String id1 = s.nextLine();
			System.out.printf("비밀번호를 입력하세요 >> ");
			String pass1 = s.nextLine();
			
			// 내용이 동일한지 비교를 할 때는 equals를 써야 된다. "=="를 쓰면 내용이 아니라 주소가 같냐고 물어보는 것
			if(!id.equals(id1)) System.out.printf("아이디가 틀렸습니다\n");
			if(!pass.equals(pass1)) System.out.printf("비밀번호가 틀렸습니다\n");
			
			else System.out.printf("로그인 성공\n");
		}
		
		//3. 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 
		//   계산 결과에 따라 저체중/정상체중/과체중/비만을 출력하세요.
		
		if(n==3) {
			s.nextLine();
			System.out.printf("키와 몸무게를 입력하세요 >> ");
			double height = s.nextDouble()* 0.01;
			double weight = s.nextDouble();
			double bmi = weight/(height*height);
			
			if(bmi<18.5) System.out.printf("저체중\n");
			else if(bmi>=18.5&&bmi<23) System.out.printf("정상체중\n");
			else if(bmi>22&&bmi<25)System.out.printf("과체중\n");
			else if(bmi>=25&&bmi<30)System.out.printf("비만\n");
			else System.out.printf("고도 비만\n");
		}
		
		// 4. 중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail을 출력
		//   평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고 
		// 이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산.
		//   70점 이상일 경우 Pass, 
		//   70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력
		
		if(n==4) {
			s.nextLine();
			System.out.printf("중간고사, 기말고사, 과제점수, 출석횟수를 입력하세요 >> ");
			double mid = s.nextInt() * 0.2;
			double fin = s.nextInt() * 0.3;
			double home = s.nextInt()* 0.3;
			int num = s.nextInt();
			
			double sum = mid+fin+home+num;
			if(sum>69) System.out.printf("Pass\n");
			else if((20*0.7)>=num) System.out.printf("NonPass(출석부족)\n");
			else if(sum<70) System.out.printf("NonPass(점수미달)\n");
		}
	}
}
