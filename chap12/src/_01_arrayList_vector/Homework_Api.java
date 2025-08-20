package _01_arrayList_vector;

public class Homework_Api {
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
			return "제목: "+title+", 저자: "+author+", 출판사: "+publisher;
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
	
	class LibraayController {
		
	}
}
