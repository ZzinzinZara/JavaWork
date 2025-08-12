package _03_Car;

public class Car_Run {
	public static void main(String[] args) {
		AmbulanceCar ac = new AmbulanceCar("응급이 1호","남궁용진");
		
		ac.power();
		ac.start();
		ac.siren();
		ac.speedUp(); ac.speedUp(); ac.speedUp(); ac.speedUp(); ac.speedUp(); ac.speedUp(); ac.speedUp(); ac.speedUp(); ac.speedUp(); ac.speedUp();
		ac.speedDown();ac.speedDown();ac.speedDown();ac.speedDown();ac.speedDown();ac.speedDown();ac.speedDown();ac.speedDown();ac.speedDown();
		ac.stop(); ac.speedCheck(); ac.power();
		ac.firstAid();
	}
}

class Car {
	String model;
	String company;
	boolean power;
	int speed =0;
	
	Car(String model, String company){
		this.model = model;
		this.company = company;
	}
	
	void power() {
		if (!power) {
			power = true;
			System.out.printf("시동 on\n");
		} else {
			power = false;
			System.out.printf("시동 off\n");
		}
	}
	
	void stop() {
		System.out.printf("%s사의 %s 정지합니다\n",this.company, this.model);
		this.speed = 0;
	}
	
	void start() {
		System.out.printf("%s사의 %s 출발합니다\n",this.company, this.model);
	}
	
	void speedUp() {
		this.speed += 10;
		System.out.printf("속도: %d\n",this.speed);
	}
	
	void speedDown() {
		if(this.speed == 0) {
			System.out.printf("속도를 더이상 줄일 수 없습니다\n");
		} else {
			this.speed-=10;
			System.out.printf("속도: %d\n",this.speed);
		}
	}
	
	void speedCheck() {
		System.out.printf("속도: %d\n",this.speed);
	}
}

class AmbulanceCar extends Car {
	boolean siren;
	AmbulanceCar(String model, String company){
		super(model, company);
	}
	
	void siren() {
		if(!this.siren) {
			siren = true;
			System.out.printf("위이이이이이이잉\n");
		}
		else {
			siren = false;
			System.out.printf("사이렌 종료\n");
		}
	}
	
	void firstAid() {
		System.out.printf("응급처지중...\n");
	}
}	


