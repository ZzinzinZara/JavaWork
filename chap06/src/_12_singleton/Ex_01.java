package _12_singleton;

public class Ex_01 {

	public static void main(String[] args) {
		int arr[] = {25,10,24,53,22,100,50,66,78,12,54};
		Math ma = new Math();
		int max = ma.max(arr);
		int min = ma.min(arr);
		
		System.out.println(max);
		System.out.println(min);
	}

}

class Math{
	// 최대값, 최소감 함수
	int max(int[] a) {
		int max = a[0];
		for (int i=0;i<a.length;i++) {
			if(a[i] > max) max = a[i];
		}
		return max;
	}
	
	int min(int[] a) {
		int min = a[0];
		for (int i=0;i<a.length;i++) {
			if(a[i] < min) min=a[i];
		}
		return min;
	}
}
