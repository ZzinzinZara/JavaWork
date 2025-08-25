package thread;

class Bank {
	private int balance = 1_000;
	
	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int money) {
		if(balance >= money) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= money;
	}
}

class ThreadSy implements Runnable {
	Bank bank = new Bank();
	@Override
	public void run() {
		while(bank.getBalance() > 0) {
			int money = ((int)(Math.random()*3) +1) *100; // 100, 200, 300
			bank.withdraw(money);
			System.out.println("잔액: "+bank.getBalance());
		}
	}
}

public class T11_synchronized {

	public static void main(String[] args) {
		Runnable r = new ThreadSy();
		new Thread(r).start();
		new Thread(r).start();
	}
}


