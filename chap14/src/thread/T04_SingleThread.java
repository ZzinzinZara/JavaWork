package thread;

public class T04_SingleThread {

	public static void main(String[] args) {
		Thread t1 = new Thread();
		long startTime = System.currentTimeMillis();
		for(int i=0;i<500;i++) {
			System.out.print("#");
		}
		System.out.println();
		System.out.println("소요시간: "+(System.currentTimeMillis()-startTime));
		
		for(int i=0;i<500;i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("소요시간: "+(System.currentTimeMillis()-startTime));
		
	}

}
