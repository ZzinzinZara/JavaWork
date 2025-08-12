package _06_anonymous;

class Parent{
	String method() {
		return "부모의 재산";
	}
}

class Child extends Parent {
	@Override
	String method() {
		return "자식의 재산";
	}
}

public class Anonymous_Run {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.method();
		
		// 익명클래스: 재사용할 필요가 없을 때 1번만 정의하여 사용
		
		Parent p2 = new Parent() {
			int age=24;
			@Override
			String method() {
				System.out.println(age);
				return "익명클래스";
			}
		};
		
		System.out.printf("%s\n",p2.method());
	}

}
