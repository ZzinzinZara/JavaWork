package _01_operation;

import java.util.Scanner;

public class T06_Ex01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자 입력 >> ");
		int n = s.nextInt();
	
		if(n==1) {
			// 1. 사용자로부터 정수를 입력받아 양수인지 양수가 아닌지 판별하는 결과 출력
			s.nextLine();
			System.out.print("정수를 입력하세요 >> ");
			int n1 = s.nextInt();
			char ch1 = n1 > 0 ? '양':'음';
			System.exit(1);
		}
		
		if(n == 2) {
			// 2. 사용자로부터 정수를 입력받아 양수, 0, 음수 판별하는 결과 출력
			s.nextLine();
			System.out.print("정수를 입력하세요 >> ");
			int n2 = s.nextInt();
			char ch2 = n2 > 0 ? '양':'음';
			System.exit(1);
		}
		
		if(n==3){
			// 3. 사용자로부터 정수를 입력받아 짝수인지 홀수인지 판별하는 결과 출력
			s.nextLine();
			System.out.print("정수를 입력하세요 >> ");
			int n3 = s.nextInt();
			char ch3 = n3%2==0 ? '짝':'홀';
			System.out.println(ch3);
			System.exit(1);
		}
		
		if(n==4) {
			/*
			 * 4. 각 인원수에 따라 사탕을 동일하게 나눠 주려고 한다 
			 * 사용자로부터 인원수와 사탕의 갯수를 입력받아 1인당 동일하게 
			 * 나눠가진 사탕 개수와 나눠주고 남은 사탕 갯수를 출력하기
			 */
			s.nextLine();
			System.out.print("사탕 개수를 입력하세요 >> ");
			int n4 = s.nextInt();
			System.out.print("인원수를 입력하세요 >> ");
			int n5= s.nextInt();
			System.out.printf("1인당 %d개의 사탕, %d 남음",n4/n5, n4%n5);
			System.exit(1);
		}
		
		if(n==5) {
			// 5. 키보드로 입력 받은 값들을 변수에 저장하고 저장된 변수의 값을 다음과 같이 출력하기
			// 이 때, 성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력.
			
			s.nextLine();
			System.out.print("이름 >> ");
			String name = s.nextLine();
			System.out.print("학년(숫자) >> ");
			int grade = s.nextInt();
			System.out.print("반(숫자) >> ");
			int num = s.nextInt();
			System.out.print("번호(숫자) >> ");
			int num2 = s.nextInt();
			System.out.print("성별(M/F) >> ");
			char chh = s.next().charAt(0);
			char gender = chh == 'M' ? '남':'여';
			System.out.print("성적(소수점 둘째자리까지) >> ");
			double score1 = s.nextDouble();
			
			System.out.printf("%d학년 %d반 %d번 %s %c학생의 성적은 %.2f이다. ", grade, num, num2, name,gender,score1);
			System.exit(1);
		}
		
		if(n==6) {
			//6. 사용자로부터 나이를 입력받아 13세이하이면 어린이
		    //	 14세~19세 이하이면 청소년
		    //	 20세 이상이면 성인으로 출력
			
			s.nextLine();
			System.out.print("나이를 입력하세요 >> ");
			int age = s.nextInt();
			/*
			 * String str1 = age >= 13 ? "어린이" : 14 <= age <= 19 ? "청소년": age >= 20 ?
			 * "성인":"뭐냐?";
			 */
			if(age <= 13) System.out.println("어린이");
			else if(14 <= age && 19 <= age) System.out.println("청소년");
			else System.out.println("성인");
			System.exit(1);
		}
		
		if(n==7) {
			// 7. 사용자로부터 국어, 영어, 수학 점수를 입력받아 
			// 세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력.
			
			s.nextLine();
			System.out.print("국어 점수 >> ");
			int ko = s.nextInt();
			System.out.print("영어 점수 >> ");
			int en = s.nextInt();
			System.out.print("수학 점수 >> ");
			int ma = s.nextInt();
			
			double avg = (ko+en+ma)/3;
			
			String result1 = ko>39 && en>39 && ma>39 && avg >59 ? "합격" : "불합격";
			System.out.println(result1);
			System.exit(1);
		}
		
		if(n==8) {
			// 8. 주민번호를 입력받아 남자인지 여자인지 출력하기
			s.nextLine();
			System.out.print("주민번호를 '-' 포함해서 입력하세요 >> ");
			String numnum = s.nextLine();
			char cch = numnum.charAt(7);
			String gen = cch==1 || cch==3 ? "남자":"여자";
			System.out.println(gen);
			System.exit(1);
		}
		
		if(n==9) {
			// 9.  사용자로부터 두 개를 입력 받아 num1, num2에 저장하고
		    // 또 다른 정수를 입력 받아 그 수가 num1 미만거나 num2 초과이면 true를 출력하고
		    // 아니면 false를 출력. (단, num1은 num2보다 작아야 함)
			s.nextLine();
			System.out.print("첫 번째 정수를 입력하세요 >> ");
			int nn1 = s.nextInt();
			System.out.print("두 번째 정수를 입력하세요 >> ");
			int nn2 = s.nextInt();
			System.out.print("세 번째 정수를 입력하세요 >> ");
			int nn3 = s.nextInt();
			
			boolean bo = nn3 < nn1 || nn3 > nn2 ? true : false;
			System.out.println(bo);
			System.exit(1);
		}
		
		if(n==10) {
			// 10. 사용자로부터 3개의 수를 키보드로 입력 받아 
		    // 입력 받은 수가 모두 같으면 true, 아니면 false를 출력
			
			s.nextLine();
			System.out.print("첫 번째 정수를 입력하세요 >> ");
			int nn1 = s.nextInt();
			System.out.print("두 번째 정수를 입력하세요 >> ");
			int nn2 = s.nextInt();
			System.out.print("세 번째 정수를 입력하세요 >> ");
			int nn3 = s.nextInt();
			
			boolean bo = nn1 == nn2 && nn1 == nn3 ? true : false;
			System.out.println(bo);
			System.exit(1);
		}
		
	}

}
