package _01_object;

import java.util.Scanner;

public class T01_mainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// 라이브러리 사용하기
		// 클래스이름 변수명 = new 클래스이름();
		T01_apiClass api1 = new T01_apiClass();
		System.out.printf("%.2f\n",api1.dou);
		System.out.printf("%s\n",api1.name);
		
		api1.name="더빛나";
		System.out.printf("%s\n",api1.name);
		
		T01_apiClass api2 = new T01_apiClass();
		System.out.printf("%s\n",api2.name);
		
		T02_apiClass api01=new T02_apiClass();
		System.out.printf("나이: %d\n", api01.age);
		
		api01.address = "서울 서초구";
		System.out.printf("주소: %s\n",api01.address);
	}
}
