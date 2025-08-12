package _08_polymorphismEx;

public class Tv extends Product{
	Tv(){
		super(300);
	}
	
	@Override
	public String toString() {
		return "Tv";
	}
}
