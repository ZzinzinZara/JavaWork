package thread;

class Thread3 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<500;i++) {
			System.out.print(new String("*"));
		}
		System.out.println();
		System.out.println("소요시간: "+(System.currentTimeMillis()-T05_MultiThreadTime.startTime));
	}
}


public class T05_MultiThreadTime {
	public static long startTime; 
	public static void main(String[] args) {
		startTime = System.currentTimeMillis();
		Thread3 t1 = new Thread3();
		t1.start();
		
		for(int i=0;i<500;i++) {
			System.out.print(new String("#"));
		}
		
		System.out.println();
		System.out.println("소요시간: "+(System.currentTimeMillis()-startTime));
		
	}

}
