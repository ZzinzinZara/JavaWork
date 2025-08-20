package _03_hashMap;

public class Snack {
	private String flavor; // 맛
	private int calory;
	
	Snack(){}
	Snack(String flavor, int calory){
		this.flavor = flavor;
		this.calory = calory;
	}
	
	public String getFlavor(){
		return flavor;
	}
	public int getCalory() {
		return calory;
	}
	public void setCalory(int calory) {
		this.calory = calory;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", calory=" + calory + "]";
	}
}
