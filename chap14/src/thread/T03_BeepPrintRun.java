package thread;

import java.awt.Toolkit;

class BeekTest extends Thread {
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.printf("띵\n");
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class T03_BeepPrintRun {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		BeekTest bt = new BeekTest();
		
		bt.start();
		
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
