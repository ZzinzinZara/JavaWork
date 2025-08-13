package _01_exception;

public class T05_numberFormat {

	public static void main(String[] args) {
		String str[] = {"23", "11","3.14"};
		int i=0;
		
		try {
			for(i=0;i<str.length;i++) {
				int num = (Integer.parseInt(str[i]));
				System.out.println(num);
			}
		} catch (NumberFormatException e) {
			System.out.printf("%s는 정수로 변환 불가\n",str[i]);
		}
	}

}
