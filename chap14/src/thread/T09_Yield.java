package thread;

class ThreadA extends Thread {
	boolean stop=false;
	boolean work=true; // yield 메소드를 호출한 시점을 알기위해
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("A 실행");
			} else {
				Thread.yield();
			}
		}
		System.out.println();
		System.out.println("A 종료");
	}
}

class ThreadB extends Thread {
	boolean stop=false;
	boolean work=true; // yield 메소드를 호출한 시점을 알기위해
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("B 실행");
			} else {
				Thread.yield();
			}
		}
		System.out.println("B 종료");
	}
}

public class T09_Yield {

	public static void main(String[] args) {
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		
		ta.start();
		tb.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		ta.work = false; // B만 작업
		System.out.printf("────────A작업 일시정지────────\n");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		ta.work = true; // A, B 번갈아가면서 작업
		System.out.printf("──────A작업 일시정지 해제──────\n");
		
		ta.stop = true;
		tb.stop = true;
	}

}
