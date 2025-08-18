package _02_StringMethod;

/*
 * substring(index): 문자열에서 index번호로부터 끝까지 얻어옴
 * substring(index, lastIndex): 문자열에서 index번호부터 lastIndex번호 앞까지 얻어옴
 */
public class T10_substring {

	public static void main(String[] args) {
		String str = "spring aws start";
		System.out.println(str.substring(7)); // index 7번 이후로 갖고오기
		System.out.println(str.substring(7,10)); // aws만 갖고오기
		
		String sn = "040818-1124567";
		System.out.println(sn.substring(0,6)); // 앞자리만 출력

		System.out.printf("20%s년 %s월 %s일\n",sn.substring(0, 2),sn.substring(2,4),sn.substring(4, 6));
		System.out.printf("%d년 %d월 %d일\n"
				,Integer.parseInt(sn.substring(0, 2))
				,Integer.parseInt(sn.substring(2, 4))
				,Integer.parseInt(sn.substring(4, 6)));
		
		int year = 0;
		if(sn.charAt(7) =='1'||sn.charAt(7)=='2') year = 1900+Integer.parseInt(sn.substring(0, 2));
		else year = 2000+Integer.parseInt(sn.substring(0, 2));
		System.out.printf("%d년생, %d살\n",year,2025-year);
	}

}
