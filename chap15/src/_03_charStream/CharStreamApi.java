package _03_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 문자기반 스트림
 *	- 데이터를 2바이트 단위로 전송하는 통로(넓은 통로)
 *	- 기반스트림: 외부매체 직접적으로 연결되는 통로
 *
 * xxxReader: 입력용 스트림
 * xxxWriter: 출력용 스트림
 */

public class CharStreamApi {
	void fileSave() {
		FileWriter fw = null;
		
		try {
//			1. 객체 생성
			fw = new FileWriter("c_char.txt");
			
//			2. writer() 메소드 이용한 출력
//				2byte단위로 데이터 전송
			fw.write("남");
			fw.write("궁");
			fw.write("용");
			fw.write("진");
			fw.write(" ");
			fw.write("스트림 재미있다"); // 하나씩 전송되는거임
			fw.write("\n");
			
			char[] arr = {'a','b','c'};
			fw.write(arr);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	void fileRead() {
		FileReader fr = null;
		
		try {
//			1. 스트림 생성
			fr = new FileReader("c_char.txt");
			
//			2. read() 메소드 이용하여 읽기 
			int value=0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
//				3. 닫기
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
