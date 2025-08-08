package _02_Array;

import java.util.Arrays;
import java.util.Scanner;

public class T06_Ex2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		// 1. 길이 10인 배열을 선언하고 1~10까지 반복문을 이용하여 순서대로 넣고 출력하기
		if(n==1) {
			s.nextLine();
			int arr[] = new int[10];
			for(int i=0;i<arr.length;i++) {
				arr[i] = i;
			}
			for(int i=0;i<arr.length;i++) {
				System.out.printf("%d ",arr[i]);
			}
		}
		
		// 2. 길이 10인 배열을 선언하고 1~10까지 값을 반복문을 이용하여 역순으로 배열 인덱스에 넣고 값 출력
		if(n==2) {
			s.nextLine();
			int arr[] = new int[10];
			int a=10;
			for(int i=0;i<10;i++) {
				arr[i] =a;
				a--;
			}
			for(int i=0;i<10;i++) {
				System.out.printf("%d ",arr[i]);
			}
		}
		
		// 3. 사용자로 부터 입력받은 수 만큼 배열을 만들고 1~입력받은 수를 차례대로 넣어 출력
		if(n==3) {
			s.nextLine();
			System.out.printf("배열을 얼만큼 만들거? ");
			int nn = s.nextInt();
			int arr[] = new int[nn];
			for(int i=0;i<arr.length;i++) {
				arr[i] = i+1;
			}
			for(int i=0;i<arr.length;i++) {
				System.out.printf("%d ",arr[i]);
			}
		}
		
		// 4. 길이가 5일 배열에 사과,귤,포도,복숭아,참외로 초기화한후 배열 인덱스를 이용하여 귤 출력
		if(n==4) {
			s.nextLine();
			String arr[]={"사과","귤","포도","복숭아","참외"};
			System.out.printf("%s",arr[1]);
		}
		
		// 5. 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		//    개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력
		if(n==5) {
			s.nextLine();
			System.out.printf("넣을 문자열 입력 >> ");
			String str = s.nextLine();
			char arr[] = new char[str.length()];
			for(int i=0;i<arr.length;i++) {
				arr[i]=str.charAt(i);
			}
			System.out.printf("찾을 문자 입력 >> ");
			char search = s.next().charAt(0);
			int count=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==search) {
					System.out.printf("%c가 존재하는 인덱스 %d\n",search, i);
					count++;
				}
			}
			System.out.printf("%c의 개수: %d\n",search,count);
		}
		
		// 6. 배열에 요일(월,화,수,목,금,토,일)을 초기화하여 넣고 사용자로 부터 0~6사이의 숫자를 입력받아
		//    숫자와 같은 요일 출력
		if(n==6) {
			s.nextLine();
			char day[] = {'월','화','수','목','금','토','일'};
			System.out.printf("0~6사이의 숫자를 입력하세요 >> ");
			int nn = s.nextInt();
			if(nn>6||nn<0) {
				System.out.printf("제대로 입력해라\n");
				System.exit(1);
			}
			else System.out.printf("%c\n",day[nn]);
		}
		
		// 7. 사용자로 부터 배열의 크기를 입력받아 그 배열의 갯수만큼 숫자로 입력받아 배열에 저장하고
		//    배열 전체의 합 출력
		if(n==7) {
			s.nextLine();
			System.out.printf("배열의 개수를 입력하세요 >> ");
			int nn = s.nextInt();
			int arr[] = new int[nn];
			System.out.printf("배열에 넣을 수를 입력하세요 >> ");
			for(int i=0;i<arr.length;i++) {
				arr[i] = s.nextInt();
			}
			System.out.println(Arrays.toString(arr));
		}
		
		// 8. 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		//    중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		//    단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		//    다시 정수를 받도록 하세요. 
		if(n==8) {
			s.nextLine();
			System.out.printf("3이상인 홀수 자연수를 입력하세요 >> ");
			int nn = s.nextInt();
			int arr[] = new int[nn];
			int length = arr.length;
			int i =0;
			int count=0;
			for(i=0;i<(length/2)+1;i++) {
				arr[i]=i;
			}
			count =--i;
			for(i=(length/2)+1;i<length;i++) {
				arr[i]=--count;
			}
			System.out.println(Arrays.toString(arr));
		}
		
		// 9. 사용자가 입력한 값이 배열에 있는지 검색하여
		//    있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
		//    단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		if(n==9) {
			s.nextLine();
			String arr[] = {"굽네","bhc","bbq"};
			System.out.printf("치킨 이름을 입력하세요 >> ");
			String ch=s.nextLine();
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i].equals(ch)) System.out.printf("%s치킨 배달가능",ch);
			}
		}
		
		// 10. 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
	    //     1~10 사이의 난수를 발생시켜 배열에 초기화 후
	    //	   배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		if(n==10) {
			s.nextLine();
			int arr[]=new int[10];
			for(int i=0;i<arr.length;i++) {
				arr[i]=(int)(Math.random()*10)+1;
			}
			int max=arr[0], min=arr[0];
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>max) max=arr[i];
				if(arr[i]<min) min=arr[i];
			}
			System.out.printf("최대값: %d, 최소값: %d\n",max,min);
		}
		
		// 11. 사용자로부터 정수값 5개 배열에 입력
		//	   오름차순 정렬로 정렬하기
		if(n==11) {
			s.nextLine();
			int arr[] = new int[5];
			System.out.printf("정수 다섯개를 입력하세요 >> ");
			for(int i=0;i<5;i++) {
				arr[i] = s.nextInt();
			}
			for(int i=0;i<4;i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		
		// 12. 각 학생별 국어 영어 수학점수의 총점과 평균을 구하고
		//	   각 과목별 총점과 평균을 구해 아래와 같이 출력하기
		//	   점수는 2차원 배열로 마음대로 넣는다.
		if(n==12) {
			s.nextLine();
			int arr[][]=new int[2][6];
			System.out.printf("번호 국어 영어 수학 점수를 차례대로 입력하세요 >> \n");
			for(int i=0;i<arr.length;i++) {
				int sum=0;
				int avg=0;
				for(int j=0;j<4;j++) {
					arr[i][j]=s.nextInt();
					if(j>0 && j<4) {
						sum += arr[i][j];
					}
					arr[i][4] = sum;
					arr[i][5] = sum/3;
				}
			}
			
			System.out.printf("번호 국어 영어 수학 총점 평균\n");
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.printf("%03d ",arr[i][j]);
				}
				System.out.printf("\n");
			}
		}		
	}

}
