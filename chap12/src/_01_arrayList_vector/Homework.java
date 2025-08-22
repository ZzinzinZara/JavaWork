package _01_arrayList_vector;

import java.util.ArrayList;

class Book{
	private String title;
	private String author;
	private String publisher;
	
	Book() {}
	Book(String t, String a, String p) {
		this.title = t;
		this.author = a;
		this.publisher = p;
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
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {
		return "제목:"+title+" 저자:"+author+" 출판사:"+publisher+" ";
	}
}
	
class Member {
	private String name;
	private int age;
	private String gender;
		
	Member() { }
	Member(String n, int a, String g){
		this.name = n;
		this.age=a;
		this.gender=g;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String isGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "이름: "+name+", 나이"+age+", 성별: "+gender;
	}
}

class LibraryController {
	Member member; // 멤버 변수 선언
	ArrayList<Book> aList = new ArrayList<>();
	
	LibraryController(Member member){
		this.member =member;
	}
	
	void info () {
		System.out.println(member); // 객체 주소가 아니라 toString 오버라이딩해서 그 내용이 뜸
	}
	
	void insertBook() {
		aList.add(new Book("Java","남궁용진","김앤북"));
		aList.add(new Book("spring","강용진","한빛미디어"));
		aList.add(new Book("html","이용진","길벗"));
	}
	
	void insertBook(Book book) {
		aList.add(book);
	}
	
	ArrayList<Book> selectAll(){
		return aList;
	}
	
	Book searchBook(String bookTitle) {
		Book book = null;
		for(int i=0;i<aList.size();i++) {
			if(bookTitle.equals(aList.get(i).getTitle())) {
				book = aList.get(i);
			}
		}
		return book;
	}
}

public class Homework {
	public static void main(String[] args) {
		LibraryController lc = new LibraryController(new Member("남궁용진",27,"남자"));
		
		lc.insertBook();
		lc.insertBook(new Book("react","이고잉","위키북스"));
		System.out.println(lc.selectAll());
		Book searchBook = lc.searchBook("Java");
		if(searchBook == null) {
			System.out.println("찾는 책이 없습니다");
		} else {
			System.out.println(searchBook);
		}
		
	}
}

