package _04_BufferStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 보조 스트림: 기반스트림만으로 부족했던 성능개선을 해주는 스트림
 * 			 기반스트림에서 제공하지 않는 추가적인 메소드 제공(전송속도 증가 등등)
 *   => 외부매체와 직접 연결되지 않음
 *   	단독 사용 불가(반드시 기반스트림과 함께 사용)
 *   
 * BufferedWrite/BufferedReader: 버퍼라는 공간을 제공하주는 보조스트림 (속도향상)
 */

public class Buffer_Api {
//	기반스트림: FileWriter 사용 (2byte 단위 전송)
//	보조스트림: BufferedWriter 사용
	BufferedWriter bw = null;
	void fileSave() {
		try {
//			1. 기반스트림 생성
//			FileWriter fw = new FileWriter("b_buffer.txt");
			
//			2. 보조스트림 생성
//			BufferedWriter bw = new BufferedWriter(fw); // 기반스트림 매개변수로 넘겨줌
			bw = new BufferedWriter(new FileWriter("b_buffer.txt")); // 한줄로 축소 가능
			
//			3. 쓰기
			bw.write("안녕하시렵니까?\n");
			bw.write("반갑습니다");
			bw.newLine();
			bw.write("좋은 하루 되세요");
//			버퍼라는 공간에 계속 쌓아놨다가 한 번에 출력해줌 => 속도 향상
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close(); // 닫아야 들어가나 ?
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		/*
		 * try-with~resource 구문: 자원반납을 알아서 해줌
		 * 
		 * try(try 블럭내에서 사용할 스트림객체 생성 구문){
		 * 
		 * } catch (예외클래스 e){
		 * 
		 * }
		 */
		
		try (BufferedWriter bw2 = new BufferedWriter(new FileWriter("d_buffer.txt"))) {
			bw2.write("안녕하시렵니까?\n");
			bw2.write("반갑습니다");
			bw2.newLine();
			bw2.write("좋은 하루 되세요");
		} catch (IOException e) {
			e.printStackTrace();
		} // 자원반납 구문을 안써도 됨 자동으로 반납까지 해줌	
	}
	
	void fileRead() {
		try(BufferedReader br = new BufferedReader(new FileReader("d_buffer.txt"))){
			int value=0;
			while((value = br.read()) != -1) {
				System.out.print((char)value);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
