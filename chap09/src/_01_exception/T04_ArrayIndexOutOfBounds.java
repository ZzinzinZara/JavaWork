package _01_exception;

public class T04_ArrayIndexOutOfBounds {

	public static void main(String[] args) {
		String str[] = {"집","가고","싶어"};
		try {
			str[3] = "집가!!";
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
