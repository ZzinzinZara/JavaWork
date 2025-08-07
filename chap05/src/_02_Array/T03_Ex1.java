package _02_Array;

public class T03_Ex1 {

	public static void main(String[] args) {
		// 1. 총점, 평균 구하기
		int n[] = {100,98,69,79,82};
		int sum=0;
		for(int i=0;i<n.length;i++) {
			sum += n[i];
		}
		System.out.printf("총점: %d\n",sum);
		System.out.printf("평균: %.1f\n",(double)sum/n.length);
		
		// 2. 최대값 최소값 구하기
		int nn[] = {6,3,5,7,4,85,8,7,98,69,79,82};
		int min=nn[0], max=nn[0];
		
		for(int i=1;i<nn.length;i++) {
			if(nn[i] < min) min = nn[i];
			if(nn[i] > max) max = nn[i];
		}
		System.out.printf("최대값: %d\n",max);
		System.out.printf("최소값: %d\n",min);
		
		// 3. 정수형 배열 10개를 만들어 랜덤함수를 이용하여 값 넣기
		int intArr[] = new int[10];
		for(int i=0;i<intArr.length;i++) {
			intArr[i] = (int)(Math.random() * 10)+1; // 1~10
		}
		
		for (int i = 0; i < intArr.length; i++) {
			System.out.printf("%d ",intArr[i]);
		}
		
	}

}
