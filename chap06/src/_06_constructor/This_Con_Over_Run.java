package _06_constructor;

class ThisConOver{
	int num;
	double dou;
	String name;
	
	ThisConOver(){
		this(1,1.0,"홍길동");
	}
	
	ThisConOver(int num){
		this(num,1.0,"홍길동");
	}
	
	ThisConOver(String name){
		this(1,10,name);
	}
	
	ThisConOver(int num, double dou){
		this(num,dou,"홍길동");
	}
	
	ThisConOver(int num, double dou, String name){
		this.name=name;
		this.num=num;
		this.dou=dou;
	}
	
	void info() {
		// 지역변수가 우선순위가 더 높아서 동일한 이름의 변수가 있을 경우
		// 지역변수를 출력하고 없으면 전역변수를 출력한다.
		System.out.printf("int: %d, double: %.1f, String: %s\n",num,dou,name);
	}
	
}

public class This_Con_Over_Run {

	public static void main(String[] args) {
		ThisConOver con1 = new ThisConOver();
		con1.info();
		System.out.printf("\n");
		
		ThisConOver con2 = new ThisConOver(2);
		con2.info();
		System.out.printf("\n");
		
		ThisConOver con4 = new ThisConOver("남궁용진");
		con4.info();
		System.out.printf("\n");
		
		ThisConOver con3 = new ThisConOver(3, 1.4);
		con3.info();
		System.out.printf("\n");
		
		ThisConOver con5 = new ThisConOver(4,5.5,"남궁용진");
		con5.info();
		System.out.printf("\n");
	}

}
