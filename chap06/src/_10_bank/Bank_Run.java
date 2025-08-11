package _10_bank;

public class Bank_Run {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		bank.deposit(11000000);
		System.out.println("잔액: "+bank.getBalance());
		
		bank.withdraw(1000000);
		System.out.println("잔액: "+bank.getBalance());
		
		bank.withdraw(10000000);
		System.out.println("잔액: "+bank.getBalance());
		
		
	}
}
