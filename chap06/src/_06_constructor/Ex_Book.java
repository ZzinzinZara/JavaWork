package _06_constructor;

class Book{
	String name;
	int price;
	int isbn;
	
	Book(String name, int price, int isbn){
		this.name = name;
		this.price=price;
		this.isbn=isbn;
	}
	
	Book(){
		this("집 언제가요?",20000,15642345);
	}
	
	Book(String name){
		this(name, 30000, 16668457);
	}
	
	Book(String name, int price){
		this(name, price, 44689875);
	}
	
	void print() {
		System.out.printf("이름: %s, 가격: %d, ISBN: %d\n", name, price, isbn);
	}
	
}

public class Ex_Book {

	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book("집 보내줘요");
		Book b3 = new Book("집 제발 보내줘요", 200000);
		Book b4 = new Book("집 진짜로 보내줘요", 300000, 68487695); 
		
		b1.print();
		b2.print();
		b3.print();
		b4.print();
		
	}

}
