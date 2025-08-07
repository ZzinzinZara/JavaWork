package _02_Array;

import java.util.Arrays;
import java.util.Scanner;

public class T04_two_demensionalArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int score[][]= {{1,2,3,4,5},
						{6,7,8,9,10,},
						{11,12,13,14,15}};
		
		System.out.printf("%d\n",score[1][1]);
		
		System.out.printf("score의 길이(행): %d\n",score.length);
		System.out.printf("score[0]의 길이(열): %d\n",score[0].length);
		
		for (int f = 0; f < score.length; f++) {
			for (int i = 0; i < score[f].length; i++) {
				System.out.printf("%d ",score[f][i]);
			}
			System.out.printf("\n");
		}
		
		System.out.println("==========================");
		
		// 4행 3열 배열에 값을 3의 배수로 넣기
		int arr[][] = new int [4][3];
		int num=3;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[j].length;j++) {
					arr[i][j] = num;
					num+=3;
					System.out.printf("%d ",arr[i][j]);
				}
			System.out.printf("\n");
		}
		System.out.println("==========================");
		
		int arr2[][]= {{1,2,3},{4,5},{6,7,8,9}};
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.printf("%d ",arr2[i][j]);
			}
			System.out.printf("\n");
		}
	}	

}
