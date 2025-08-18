package _03_StringBuffer;

public class T03_Math {

	public static void main(String[] args) {
		// 절대값 abs()
		System.out.printf("-11의 절대값: %d\n",Math.abs(-11));
		System.out.printf("-11.45의 절대값: %.2f\n",Math.abs(-11.45));
		
		// 올림: ceil()
		System.out.printf("13.1의 올림: %.1f\n",Math.ceil(13.1));
		System.out.printf("-13.1의 올림: %.1f\n",Math.ceil(-13.1));
		
		// 소수점 이하를 작은숫자로 내림: floor()
		System.out.printf("14.7의 내림: %.1f\n",Math.floor(14.7));
		System.out.printf("-14.7의 내림: %.1f\n",Math.floor(-14.7));
		
		// 가장 가까운 정수로 반환: rint()
		System.out.printf("13.1의 가까운 정수: %.1f\n",Math.rint(13.1));
		System.out.printf("13.7의 가까운 정수: %.1f\n",Math.rint(13.7));
		System.out.printf("13.5의 가까운 정수: %.1f\n",Math.rint(13.5)); // 반올림
		System.out.printf("-13.1의 가까운 정수: %.1f\n",Math.rint(-13.1));
		System.out.printf("-13.7의 가까운 정수: %.1f\n",Math.rint(-13.7));
		System.out.printf("-13.5의 가까운 정수: %.1f\n",Math.rint(-13.5)); 
		System.out.printf("-----------------------------------------\n");
		
		// 소수점 이하 반올림 (가장 가까운 정수로): round()
		int result = (int)Math.round(13.1); // 원래 Long형
		System.out.printf("13.1의 반올림: %d\n",Math.round(13.1));
		System.out.printf("13.7의 반올림: %d\n",Math.round(13.7));
		System.out.printf("13.5의 반올림: %d\n",Math.round(13.5)); // 반올림
		System.out.printf("-13.1의 반올림: %d\n",Math.round(-13.1));
		System.out.printf("-13.7의 반올림: %d\n",Math.round(-13.7));
		System.out.printf("-13.5의 반올림: %d\n",Math.round(-13.5));
		System.out.printf("-----------------------------------------\n");
		
		// 소수점 2째자리까지 반올림하여 얻기
		double value = 12.34567;
		double value2 = value*100; // 1234.567
		double result2 = result / 100;
		System.out.println(result2);
		System.out.printf("%.2f\n",result2);
		
		// 두 수 중 큰 수 or 작은 수 반환: max(), min()
		System.out.println("7과 8중 큰 숫자: "+Math.max(7,8));
		System.out.println("7과 8중 작은 숫자: "+Math.min(7,8));
		System.out.println("7과 8중 작은 숫자: "+Math.min(7.23,8.89));
		char ch = (char)Math.max('a','z');
		char ch1 = (char)Math.min('a','z');
		System.out.printf("%c\n",ch);
		System.out.printf("%c\n",ch1);
		
		// 제곱 연산
		System.out.println("5^3: "+(int)Math.pow(5, 3));
		System.out.println("1024^5: "+(int)Math.pow(1024, 5));
		
		// 제곱근: sqrt()
		System.out.println("25의 제곱근: "+Math.sqrt(25));
		System.out.printf("-----------------------------------------\n");
		
		// 랜덤값 추출: random()
		// 1부터 100까지 값 중 1개 
		int random = (int)(Math.random()*100)+1;
		System.out.println(random);
		
		
	}
}
