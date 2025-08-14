package _03_loginException;

import java.util.Scanner;

public class Login_Run {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Login login = new Login();
		
		System.out.printf("아이디를 입력하세요 >> ");
		String id = s.nextLine();
		System.out.printf("비밀번호를 입력하세요 >> ");
		String password = s.nextLine();
		
		try {
			if(login.check(id, password)){
				System.out.printf("로그인 성공\n");
			} 
		} catch (UserException e) {
			System.out.println(e.getMessage());
		}
	}
}

class Login{
	private String id = "skarnddydwls";
	private String password = "dydwls12";
	
	String getId() { return id; }
	String getPassword() {return password; }
	
	boolean check(String id, String password) throws UserException {
		if(!id.equals(this.id)||!password.equals(this.password)) {
			throw new UserException("아이디 또는 비밀번호가 일치하지 않습니다");
		} else {
			return true;
		}
	}
}
