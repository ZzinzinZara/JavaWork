package _03_tv;

public class TvRun {

	public static void main(String[] args) {
		Tv tv1 = new Tv();
		System.out.printf("회사명: %s\n",tv1.company);
		System.out.printf("모델명: %s\n",tv1.model);
		System.out.printf("%d인치\n",tv1.inch);
		
		tv1.power();
		System.out.printf("현재 채널: %d\n",tv1.channelUp());
		System.out.printf("현재 채널: %d\n",tv1.channelUp());
		System.out.printf("현재 채널: %d\n",tv1.channelDown());
		System.out.printf("소리: %d\n",tv1.volume(10));
		
		tv1.power();
	}

}
