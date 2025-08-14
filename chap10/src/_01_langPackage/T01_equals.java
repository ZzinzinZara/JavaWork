package _01_langPackage;

class Value {
	int value;
	Value(int value) {
		this.value = value;
	}
	@Override // 값이 같은가를 비교하기 위해 equals를 오버라이딩 함
	public boolean equals(Object o) {
		return value == ((Value)o).value; // value는 Value타입, o는 Object 타입
	}									  // Object타입의 o를 Value로 강제 형변환
}

public class T01_equals {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) // 인스턴스 객체는 주소가 같은지 물어보는거
			System.out.printf("v1, v2 일치\n");
		else 
			System.out.printf("v1, v2 불일치\n");
		
		Value v3 = v1;
		if(v1.equals(v3)) // v1, v3는 주소 일치
			System.out.printf("v1, v3 일치\n");
		else 
			System.out.printf("v1, v3 불일치\n");
	}
}
