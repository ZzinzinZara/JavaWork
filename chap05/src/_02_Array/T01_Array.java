package _02_Array;

public class T01_Array {

	public static void main(String[] args) {
		/*
		 * 1. 같은 자료형만 배열로 만들 수 있음
		 * 2. 배열의 개수는 나중에 변경 불가 (늘리거나 줄일 수 없음)
		 */
		
		// 저장공간만 확보하고 값은 나중에 넣을 때
		int arr1[] = new int[10]; // 나는 이걸 더 선호
		int[] arr2 = new int[10];
		
		// 배열을 만들면서 값을 바로 넣을 때
		int arr3[] = {1,2,3,4,53,2,123,33};
		for(int i=0;i<arr3.length;i++) {
			System.out.printf("%d\n",arr3[i]);
		}
		
		System.out.println("===========================");
		
		for(int i=0;i<arr3.length;i++) {
			System.out.printf("%d\n",arr3[i]*3);
		}
		
		System.out.printf("arr1의 길이: %d\n",arr1.length);
		System.out.printf("arr3의 길이: %d\n",arr3.length);
		
		// 1. 길이가 5인 배열에 for문으로 값 0,3,6,9,12 넣고, 합계 출력
		int arr[] = new int[5];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=i*3;
			sum+=arr[i];
			System.out.printf("%d ",arr[i]);
		}
		System.out.printf("%d\n",sum);
	}

}
