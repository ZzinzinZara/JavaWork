package _02_Scanner;

import java.util.Scanner;

public class T01_Scanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//String name = scan.next(); // 문자열의 단어, 띄어쓰기 하면 그 뒤로 안 읽힘
		//System.out.println(name);
		
		System.out.print("이름을 입력하세요 >> ");
		String name2 = scan.nextLine(); // 이렇게 써야 띄어쓰기까지 읽힘
		
		System.out.print("나이를 입력하세요 >> ");
		int age = scan.nextInt();
		
		System.out.print("키를 입력하세요 >> ");
		double height = scan.nextDouble();
		
		System.out.print("성별을 입력하세요(남자면 true, 여자면 false) >> ");
		boolean gender = scan.nextBoolean();
		
		// 남자아이, 여자아이
		System.out.print("성별을 넣으세요 >> ");
		char gender1 = scan.next().charAt(0); // index번호 첫번째것만 가져오기
		
		scan.nextLine();
		
		System.out.print("주소를 입력하세요 >> ");
		String address = scan.nextLine();
		
		System.out.println("이름: "+name2);
		System.out.println("나이: "+age);
		System.out.println("키: "+height);
		
		if(gender)
			System.out.println("남자구나?");
		else
			System.out.println("여자구나?");
		
		System.out.println("성별: "+gender1);
		
		System.out.println("주소: "+address);
		
		
	}
}
