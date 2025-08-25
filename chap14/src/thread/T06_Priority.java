package thread;

class Thread4 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.print("凸");
			for(int j=0;j<10000;j++);
		}
		System.out.println();
		System.out.printf("종료\n");
	}
}

class Thread5 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.print("品");
		for(int j=0;j<10000;j++); 
			
		}
		System.out.println();
		System.out.printf("종료\n");
	}
}

public class T06_Priority {

	public static void main(String[] args) {
		Thread4 t4 = new Thread4();
		Thread t5 = new Thread5();
		
		t4.setPriority(Thread.MIN_PRIORITY);
		t5.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("凸의 우선순위: "+t4.getPriority());
		System.out.println("品의 우선순위: "+t5.getPriority());
		t4.start();
		t5.start();
	}
}
