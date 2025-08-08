package _03_tv;

public class Tv {
	// 속성
	String company = "LG";
	String model = "울트라 FULL HD";
	int inch =80;
	boolean power;
	int volume;
	int channel=5;
	
	// 기능, 메서드
	void power() {
		power = !power;
		if (power==true) {
			//power=true;
			System.out.printf("Tv를 켭니다\n");
		}
		else {
			//power=false;
			System.out.printf("Tv를 끕니다\n");
		}
	}
	
	int channelUp() {
		channel++;
		return channel;
	}
	
	int channelDown() {
		channel--;
		return channel;
	}
	
	int volume(int volumeInut) {
		volume = volumeInut;
		return volume;
	}
}
