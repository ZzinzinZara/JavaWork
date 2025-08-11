package _06_constructor;

class ConOver{
	int num;
	double dou;
	String name;
	
	ConOver(){
		System.out.printf("매개변수가 없는 생성자\n");
		num=1;
		dou=1.0;
		name="홍길동";
	}
	
	ConOver(int num){
		System.out.printf("매개변수가 한 개인 생성자(int)\n");
		this.num=num;
		dou=1.0;
		name="홍길동";
	}
	
	ConOver(String name){
		System.out.printf("매개변수가 한 개인 생성자(String)\n");
		num = 1;
		dou = 1.0;
		this.name = name;
	}
	
	ConOver(int num, double dou){
		System.out.printf("매개변수가 두 개인 생성자(int, double)\n");
		this.num = num;
		this.dou = dou;
		name = "홍길동";
	}
	
	ConOver(int num, double dou, String name){
		System.out.printf("매개변수가 세 개인 생성자\n");
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

public class Con_Over_Run {

	public static void main(String[] args) {
		ConOver con1 = new ConOver();
		con1.info();
		System.out.printf("\n");
		
		ConOver con2 = new ConOver(2);
		con2.info();
		System.out.printf("\n");
		
		ConOver con4 = new ConOver("남궁용진");
		con4.info();
		System.out.printf("\n");
		
		ConOver con3 = new ConOver(3, 1.4);
		con3.info();
		System.out.printf("\n");
		
		ConOver con5 = new ConOver(4,5.5,"남궁용진");
		con5.info();
		System.out.printf("\n");
	}

}
