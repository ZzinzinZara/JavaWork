package _01_arrayList_vector;

public class Board {
	private String title;
	private String content;
	private String writer;
	
	public Board() {}
	public Board(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	// getter/setter 메소드
	public String getTitle() { 
		return title;
	}
	public String getContent() { 
		return content;
	}
	public String getWriter() { 
		return writer;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
} 
