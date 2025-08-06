package _02_repetitive;

public class T07_for_mul {

	public static void main(String[] args) {
		int n1, n2, n3;
		n1 = n2 = n3 =10;
		
		int n4=10, n5=20, n6=30;
		
		// 조건식에는 변수 하나만 들어가야 됨
		for(int i=1, j=20, z=200;i<11;i++,j--,z--) {
			System.out.printf("%03d %03d %03d \n",i,j,z);
		}
		
		// for(;;) == while(true)
	}

}
