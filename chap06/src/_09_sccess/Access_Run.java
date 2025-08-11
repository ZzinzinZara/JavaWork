package _09_sccess;

import _10_bank.Bank;

public class Access_Run {

	public static void main(String[] args) {
		Access ac = new Access();
		
		// ac.num = 5;
		// int num = ac.num; 접근 불가
		
		System.out.println(ac.getNum());
		ac.setNum(100);
		System.out.println(ac.getNum());
		
		Bank bank = new Bank();
		bank.deposit(3000);
		bank.withdraw(2000);
		System.out.println(bank.getBalance());
	}
}
