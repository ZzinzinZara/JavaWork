package _07_polymorphism;

class Car {
	String color;
	int speed;
	void drive() {
		System.out.printf("운전중...\n");
	}
	
	void stop() {
		System.out.printf("Stop!!!\n");
	}
}

class FireCar extends Car {
	void water() {
		System.out.printf("물 뿌리는 중...\n");
	}
}

public class T03_poly_Run {

	public static void main(String[] args) {
		FireCar fCar = new FireCar();
		fCar.drive();
		fCar.stop();
		fCar.water();
		
		Car car = fCar;
		car.drive();
		car.stop();
//		Car.water();
		
		FireCar f2 = (FireCar)car; // 강제 형변환
		
		/* 강제형변환 주의!!
		 * 반드시 부모는 최초 객체 생성시 자식의 타입으로 객체가 생성되어 있어야 함
		 */
		
		Car car2 = new Car();
		// 컴파일 오류(실행시 오류 발생)
		// FireCar f3 = (FireCar)c;
		
		// instanceof: 좌측의 객체가 우측의 타입으로 만들어졌나를 검사 (true or false)
		FireCar f3 = null;
		if(car instanceof FireCar) {
			f3 = (FireCar)car;
			System.out.printf("변환 완료\n");
		} else {
			System.out.printf("변환할 수 없음\n");
		}
	}

}
