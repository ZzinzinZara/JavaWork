package _09_sccess;

public class Access {
	private int num = 5;
	
	// setter 메소드: 
	void setNum(int num) {
		this.num = num;
	}
	
	// getter 메소드: private으로 된 필드의 값을 얻어올 때
	int getNum() {
		return num;
	}
}
