package _02_Array;

public class T05_lotto {

	public static void main(String[] args) {
		// 45개의 배열에 값을 넣기
		int lotto[] = new int[45];
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = i+1;			
		}
		
		for(int i=0;i<6;i++) {
			int change = (int)(Math.random() * 45);
			int temp = lotto[i];
			lotto[i] = lotto[change];
			lotto[change] = temp;
		}
		
		for(int i=0;i<6;i++) {
			System.out.printf("%d ",lotto[i]);
		}
		
	}

}
