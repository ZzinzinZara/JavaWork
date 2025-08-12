package _08_polymorphismEx;

public class Computer extends Product{
	Computer(){
		super(120);
	}
	
	@Override
	public String toString() {
		return "Computer";
	}
}
