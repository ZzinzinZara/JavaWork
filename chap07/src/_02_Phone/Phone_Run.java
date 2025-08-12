package _02_Phone;

public class Phone_Run {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("아이폰 15pro","black");
		
		System.out.printf("모델명: %s, 색상: %s\n",sp.model,sp.color);
		
		sp.bell();
		sp.hangUp();
		sp.sendVoice("씨발 집 언제보내주노?");
		sp.receveVoice("23시20분에 갈 수 있다;;;");
		sp.hangOut();
		System.out.println(sp.search("우리집"));
	}

}
