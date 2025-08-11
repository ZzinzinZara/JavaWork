package _06_constructor;

public class Tv {
	String company;
	String model;
	int channel;
	
	Tv(String company, String model, int channel){
		System.out.printf("생성자 호출\n");
		this.company = company;
		this.model = model;
		this.channel = channel;
	}
}
