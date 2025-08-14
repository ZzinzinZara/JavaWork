package _02_userDefineException;

public class Account {
	private int balance;
	
	void deposit(int money) {
		balance += money;
	}
	
	int getBalance() {
		return balance;
	}
	
	void witdraw(int money) throws UserException { // 함수 예외는 throws를 써야 됨
		if(balance < money) {
			throw new UserException("잔고부족: "+(money-balance) + "원 부족");
		} else {
			balance -= money;
		}
	}
}
