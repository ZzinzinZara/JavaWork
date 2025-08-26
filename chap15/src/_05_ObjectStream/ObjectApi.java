package _05_ObjectStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 보조스트림
 *  - ObjectOutputStream/ObjectInputStream: 객체 단위로 입출력할 수 있도록 도움을 주는 스트림
 *  - 메소드: writeObject() / readObject() 
 *  - 객체에 toString()을 오버라이딩하지 않으면 readObject()로 읽으면 주소가 들어옴
 * 기반스트림
 *  - FileOutputStream/FileInputStream: 파일과 연결하여 1byte단위로 입력한느 스트림
 */

public class ObjectApi {
	public void fileSave() {
		Phone p1 = new Phone("s25+", 115);
		Phone p2 = new Phone("s25", 97);
		Phone p3 = new Phone("s25U", 150);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phone.txt"))){
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone.txt"))){
			while(true) {
				System.out.println(ois.readObject());
			}
		} catch (Exception e) {
			System.out.println();
		}
	}
}
