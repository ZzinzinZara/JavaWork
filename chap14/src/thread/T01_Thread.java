package thread;

class Thread1 extends Thread {
	@Override
	public void run() {
		setName("첫번째 스레드"); // 스레드 이름 넣어주기 
		for(int i=0;i<=5; i++) {
			System.out.println(getName());
		}
	}
}

class Thread2 implements Runnable {
	@Override
	public void run() {
		Thread.currentThread().setName("두번째 스레드");
		for(int i=0;i<6;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}

public class T01_Thread {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		t1.start();
		
//		Runnable r1 = new Thread2();
//		Thread t2 = new Thread(r1); // 생성자 Thread(Runnable target)
//      ↑ 이걸 줄이면 밑에꺼
		
		Thread t2 = new Thread(new Thread2());
		t2.start();
	}
}
