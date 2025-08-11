package _11_staticEx;

class Text{
	static int count=0;
	String name;
	Text(){
		this.name = "제목 없음" + ++this.count;
		System.out.printf("문서 %s 생성됨\n",this.name);
	}
	
	Text(String name){
		this.name = name;
		System.out.printf("문서 %s 생성됨\n",this.name);
	}
}

public class Text_Void {

	public static void main(String[] args) {
		Text tx1 = new Text();
		Text tx2 = new Text();
		Text tx4 = new Text("Java");
		Text tx3 = new Text();
	}
}
