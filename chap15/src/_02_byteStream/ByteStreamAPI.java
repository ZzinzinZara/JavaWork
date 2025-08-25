package _02_byteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * byte Stream
 *  바이트 스트림: 데이터를 1바이트 단위로 전송하는 통로(좁은 통로, 1바이트면 한글 깨짐)
 *  기반 스트림: 외부매체와 직접적으로 연결되는 통로
 *  
 *  xxxInputStream: xxx매채로부터 데이터를 입력받는 통로(외부 매체로부터 데이터를 읽어옴)
 *  xxxOutputStream: xxx매체로 데이터를 출력하는 통로(외부 매체로 데이터를 내보냄)
 *  
 *  순서
 *   1. 스트림 생성 (통로 만들기)
 *   2. 스트림으로 데이터 출력 (메소드 활용)
 *   3. 다 사용 후 스트림 반납
 */

public class ByteStreamAPI {
	// FileOutputStream: 파일과 직접 연결하여 1바이트 단위로 출력하는 스트림
	public void fileSave() {
		try { // 파일이 없으면 새로 만들고 통로 연결, 있으면 통로 연결
			// 1. 스트림 생성
			FileOutputStream fout = new FileOutputStream("a_byte.txt"); 
			
			// 2. 스트림으로 데이터 출력: write 메소드 사용
			fout.write(97);
			fout.write('b');
			byte[] arr = {99,100,101};
			fout.write(arr,1,2); // (변수, index(~부터), 개수)
			fout.write('은'); // 2byte라 깨져서 들어감
			
			// 3. 스트림 반납
			fout.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		// FileInputStream: 파일로부터 데이터를 1바이트 단위로 입력받는 스트림
		FileInputStream fin = null;
		try {
			// 1. 스트림 생성 (통로만들기)
			fin = new FileInputStream("a_byte.txt");
			
			// 2. 스트림으로 데이터 입력: read() 메소드 이용
			// 		1byte단위로 하나씩 읽어옴/숫자로 읽음
//			System.out.println((char)fin.read());
			
//			반복문 실행시 fin.read()가 두번씩 실행됨
//			while(fin.read() != -1) {
//				System.out.print((char)fin.read());
//			}
			
//			해결방법 1.
//			while(true) {
//				int value = fin.read();
//				if(value == -1) {
//					break;
//				}
//				System.out.println((char)value);
//			}
			
//			해결방법 2. (권장)
			int value=0;
			while((value = fin.read()) != -1) {
				System.out.print((char)value+" ");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 3. 다 사용한 후 스트림 반납
		try {
			fin.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
}
