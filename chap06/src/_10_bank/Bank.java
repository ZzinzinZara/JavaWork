package _10_bank;

public class Bank {
	private int balance;
	
	// 다른 패키지에서 사용하려면 접근 제한자를 public으로 해야됨
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) {
		if(balance < money) 
			System.out.println("잔고부족");
		else
			balance -= money;
	}
	
	public int getBalance() {
		
		return balance;
	}
}
