package _03_casting;

import java.util.Scanner;

public class T04_Ex02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자 입력 >> ");
		int n = s.nextInt();
		
		if(n==1) {
			// 1. 이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
			System.out.print("이름을 입력하세요 >> ");
			String name = s.nextLine();
			System.out.print("성별을 입력하세요(남/여) >> ");
			char gender = s.next().charAt(0);
			System.out.print("나이를 입력하세요 >> ");
			int age = s.nextInt();
			System.out.print("키를 입력하세요 >> ");
			double height = s.nextDouble();
			
			System.out.printf("키 %.1f인 %d살 %c자 %s님 반갑습니다.",height,age,gender,name);
			System.exit(0);
		}
		
		if(n==2) {
			// 2. 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
			System.out.print("첫 번째 정수 >> ");
			int num1 = s.nextInt();
			System.out.print("두 번째 정수 >> ");
			int num2 = s.nextInt();
			
			System.out.printf("더하기 결과: %d\n",num1+num2);
			System.out.printf("빼기 결과: %d\n",num1-num2);
			System.out.printf("곱하기 결과: %d\n", num1*num2);
			System.out.printf("나누기 몫 결과: %d\n", num1/num2);
			System.exit(0);
		}
		
		if(n==3) {
			// 3. 키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
			System.out.print("세로 값을 입력하세요 >> ");
			double height1 = s.nextDouble();
			System.out.print("가로 값을 입력하세요 >> ");
			double width1 = s.nextDouble();
			
			System.out.printf("면적: %.2f\n", height1 * width1);
			System.out.printf("둘레: %.2f\n", (width1 + height1) * 2);
			System.exit(0);
		}
			
		if(n==4) {
			// 4. 영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.
			System.out.print("문자열을 입력하세요 >> ");
			s.nextLine(); // 버퍼에 남아있는 \n를 소비, 없으면 에러남
			String str1 = s.nextLine();
			
			System.out.printf("첫 번째 문자: %c\n", str1.charAt(0));
			System.out.printf("두 번째 문자: %c\n", str1.charAt(1));
			System.out.printf("세 번째 문자: %c\n", str1.charAt(2));
			System.exit(0);
		}
	}
}
