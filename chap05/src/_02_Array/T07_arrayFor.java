package _02_Array;

public class T07_arrayFor {

	public static void main(String[] args) {
		// 배열에서만 사용가능한 반복문
		// 전체 배열만 가능
		int num[] = {1,2,3,4,5};
		
		// for(int i=0;i<num.length;i++){
		for(int result : num) { // 근데 이것도 배열안에 원소가 있어야 되는거 아냐?
			System.out.printf("%d ",result);
		}
		System.out.printf("\n");
		
		String name[]= {"남궁용진","김용진","이용진"};
		for(String name1:name) System.out.printf("%s ",name1); // 별로 필요 없는거 같은데 
		System.out.printf("\n");
		
		String name2[] = new String[3];
		int index=0;
		for(String str : name) {
			name2[index] = str;
			System.out.printf("%s ",name[index++]);
		}
		
	}

}
