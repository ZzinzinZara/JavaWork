package _02_StringMethod;

public class T04_startsWith_endsWoth {

	public static void main(String[] args) {
		// startsWith: 맨 앞에 지정하는 문자로 시작하는지
		String str = "springjavahtmlsql";
		boolean start = str.startsWith("spring");
		boolean start1 = str.startsWith("htnl");
		System.out.println(start);
		System.out.println(start1);
		
		// endsWith: 맨 끝에 지정하는 문자로 끝나는지
		String strArr[] = {"aa.jpg","bb.class","cc.text","dd.png"};
		//jpg, png
		for(int i=0;i<strArr.length;i++) {
			if(strArr[i].endsWith(".jpg")||strArr[i].endsWith(".png")) {
				System.out.printf("%s는 그림 파일\n",strArr[i]);
			}
			else System.out.println(strArr[i]+"는 그림 파일 아님");
		}
	}

}
