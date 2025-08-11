package _05_varArg;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		int n=0;
		Lib lib = new Lib();
		Scanner s = new Scanner(System.in);
		System.out.printf("책 이름을 입력하세요 >> ");
		String name = s.nextLine();
		lib.addName(name);
		
		System.out.printf("저자를 입력하세요 >> ");
		String author = s.nextLine();
		lib.addAuthor(author);
		
		System.out.printf("책의 가격을 입력하세요 >> ");
		int price = s.nextInt();
		lib.addPrice(price);
		
		System.out.printf("%s\n",lib.name);
		System.out.printf("%s\n",lib.author);
		System.out.printf("%d원\n",lib.price);
		
		System.out.printf("%s\n",lib.bookInfor());
	}

}
