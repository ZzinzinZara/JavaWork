package _04_interfaceExtends;

// 같은 interface에서 상속 받을 때는 extends 사용 가능
// 여러개의 interface를 상속 받을 수 있음 (다중 상속 가능)
interface Inter1 {
	int method1();
}
// public을 왜 하나만?
interface Inter2{
	int method2();
}

public interface Inter extends Inter1, Inter2{
	int method();
}
