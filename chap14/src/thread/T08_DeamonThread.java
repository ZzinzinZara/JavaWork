package thread;

class AutoSaveThread extends Thread {
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("작업파일이 자동저장 됨");
		}
	}
}

public class T08_DeamonThread {

	public static void main(String[] args) {
		AutoSaveThread at = new AutoSaveThread();
		at.setDaemon(true); // 데몬스레드로 변경. setDeamon(true)을 넣지 않으면 일반스레드
		at.start();
		
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		System.out.println("프로그램 종료"); // 데몬스레드는 백그라운드 스레드로 일반 스레드가 종료되면 자동 종료됨
	}
}
