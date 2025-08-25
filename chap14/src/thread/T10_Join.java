package thread;

class SumThread extends Thread {
	private int sum=0; // 바로 밑에서 선언하면 인스턴스 변수, 0을 안 넣어도 자동으로 0이 들어감
	
	int getSum() {
		return sum;
	}
 	
	@Override 
	public void run() {
		for(int i=1; i<=1000;i++) {
			sum+=i;
		}
		System.out.println("종료");
	}
}
public class T10_Join {
	public static void main(String[] args) {
		SumThread sumT = new SumThread();
		sumT.start();
		try {
			sumT.join(); // run이 다 끝날 때까지 기다림
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1-1000까지 합: "+sumT.getSum());
	}
}
