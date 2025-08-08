package _05_varArg;

public class Lib {
	String name;
	String author;
	int price;
	
	void addName(String name) {
		this.name = name;
	}
	
	void addAuthor(String author) {
		this.author=author;
	}
	
	void addPrice(int price) {
		this.price = price;
	}
	
	String bookInfor() {
		return "그런건 없습니다";
	}
	
}
