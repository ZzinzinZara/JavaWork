package _06_constructor;

public class Tv_Run {
	public static void main(String[] args) {
		Tv tv = new Tv("LG","울트라 TV",11);
		System.out.printf("제조사: %s\n",tv.company);
		System.out.printf("모델명: %s\n",tv.model);
		System.out.printf("채널 %d\n",tv.channel);
		
		System.out.printf("\n");
		
		Tv tv2 = new Tv("삼성", "FULL HD TV", 9);
		System.out.printf("제조사: %s\n",tv2.company);
		System.out.printf("모델명: %s\n",tv2.model);
		System.out.printf("채널 %d\n",tv2.channel);
	}
}
