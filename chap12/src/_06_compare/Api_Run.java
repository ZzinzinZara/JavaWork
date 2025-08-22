package _06_compare;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import javax.naming.directory.SearchControls;

class Book implements Comparable<Book>{
	private String title;
	private String author;
	private String category;
	int price;
	
	Book() {}
	Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override 
	public String toString() {
		return "제목: "+title+", 저자: "+author+", 범주: "+category+", 가격: "+price;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(title,author,category,price);
	}
	
	public boolean equals(Book book) {
		if (this.title.equals(book.title) && this.author.equals(book.author) &&
				this.category.equals(book.category) && this.price == book.price)
			return true;
		else return false;
	}
	
	@Override
	public int compareTo(Book book) {
		return title.compareTo(book.getTitle());
	}
}

class LibraryController implements Comparable<Book>{
	Book book = new Book();
	ArrayList<Book> bList = new ArrayList<>();
	
	LibraryController(){
		bList.add(new Book("집 가는 법","남궁용진","휴식",20000));
		bList.add(new Book("학교 가는 방법","이용진","공부",35000));
		bList.add(new Book("밥 먹는 방법","갈용진","영양",75000));
	}
	
	void insertBook(Book book) {
		bList.add(book);
	}
	
	ArrayList<Book> selectList(){
		return bList;
	}
	
	ArrayList<Book> searchBook(String keyword){
		ArrayList<Book> sl = new ArrayList<>();
		for(int i=0;i<bList.size();i++) {
			if(bList.get(i).getTitle().contains(keyword)) { // 포함되어있는지는 contains
				sl.add(bList.get(i));
			} 
		}
		return sl;
	}
	
	Book deleteBook(String title, String author) {
		Book deleteBook = null; // 객체를 왜 생성해서 삭제를 하고 반환시켜야 되는거지?
		for(int i=0;i<bList.size();i++) {
			if(bList.get(i).getTitle().equals(title) && bList.get(i).getAuthor().equals(author)) {
				deleteBook = bList.remove(i);
				break;
			}
		}
		return deleteBook;
	}
	
	int ascBook() {
		bList.sort(null);
		return 1;
	}

	@Override
	public int compareTo(Book b) {
	
		return 1;
	}
}

public class Api_Run {

	public static void main(String[] args) {
		LibraryController lc = new LibraryController();
		boolean b = true;
		while(b) {
			System.out.printf("========== 메뉴 ==========\n");
			System.out.printf(" 1. 새 도서 추가\n");
			System.out.printf(" 2. 전체 도서 검색\n");
			System.out.printf(" 3. 도서 검색\n");
			System.out.printf(" 4. 도서 삭제\n");
			System.out.printf(" 5. 도서명 오름차순 정렬\n");
			System.out.printf(" 0. 종료\n");
			System.out.printf("=========================\n");
			Scanner s = new Scanner(System.in);
			int num = s.nextInt();
			s.nextLine();
			if(num == 1) {
				System.out.printf("도서 이름, 저자, 장르, 가격을 순서대로 입력하세요 >> \n");
				String name = s.nextLine();
				String author = s.nextLine();
				String category = s.nextLine();
				int price = s.nextInt();
				lc.insertBook(new Book(name,author,category,price));
			}
			else if(num == 2) {
				System.out.println(lc.selectList()); 
			}
			else if(num == 3) {
				System.out.printf("찾을 책을 입력하세요 >> ");
				String str = s.nextLine();
				System.out.println(lc.searchBook(str)); 
			}
			else if(num == 4) {
				System.out.printf("삭제할 책 이름과 저자를 입력하세요 >> ");
				String name = s.nextLine();
				String author = s.nextLine();
				lc.deleteBook(name, author);
			}
			else if(num == 5) {
				lc.ascBook();
			}
			else if(num == 0) {
				b = false;
			}
			else {
				System.out.printf("0~5 사이의 숫자를 입력해주세요\n");
			}
		}
	}

}
