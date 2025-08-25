package thread;

public class T07_ThreadGroup {

	public static void main(String[] args) {
		ThreadGroup main = Thread.currentThread().getThreadGroup();
		String name = main.getName();
		System.out.println(name);
		
		ThreadGroup group1 = new ThreadGroup("Group_1");
		ThreadGroup group2 = new ThreadGroup("Group_2");
		ThreadGroup subgrp = new ThreadGroup(group1,"subGroup_1");
		
		group1.setMaxPriority(9);
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		/* Thread()
		 * Thread(Runnable r)
		 * Thread(ThreadGroup tg, Runnable r, String name)
		 */
		
		Thread th1 = new Thread(group1,r,"남궁용진_1");
		Thread th2 = new Thread(subgrp,r,"남궁용진_s1");
		Thread th3 = new Thread(group2,r,"남궁용진_2");
		
		th1.start();
		th2.start();
		th3.start();
		
		System.out.println("실행준인 스레드 상위 그룹: "+main.getName());
		System.out.println("실행준인 스레드그룹의 수: "+main.activeGroupCount());
		System.out.println("실행중인 스레드의 수: "+main.activeCount());
		main.list();
		
	}
}
