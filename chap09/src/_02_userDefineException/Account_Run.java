package _02_userDefineException;

public class Account_Run {

	public static void main(String[] args) {
		Account a = new Account();
		a.deposit(500);
		
		try {
			a.witdraw(900);
		} catch (UserException e) {
			System.out.println(e.getMessage());
		}
	}

}
