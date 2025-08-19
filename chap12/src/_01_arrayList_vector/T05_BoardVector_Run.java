package _01_arrayList_vector;

import java.util.List;
import java.util.Vector;

public class T05_BoardVector_Run {

	public static void main(String[] args) {
		List<Board> list = new Vector<>();
		
		list.add(new Board("제목1","내용1","글쓴이1"));
		list.add(new Board("제목2","내용2","글쓴이2"));
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));
		list.add(new Board("제목5","내용5","글쓴이5"));
		
		list.remove(1);
		for(Board b:list) {
			System.out.print(b.getTitle()+" ");
			System.out.print(b.getContent()+" ");
			System.out.println(b.getWriter());
		}
		System.out.printf("――――――――――――――――――――――――――――――――\n");
	}

}
