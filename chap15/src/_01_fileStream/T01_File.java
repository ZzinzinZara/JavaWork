package _01_fileStream;

import java.io.File;
import java.io.IOException;

public class T01_File {

	public static void main(String[] args) {
		File f1 = new File("test.txt");
		try {
			// 1. 경로를 지정하지 않거 파일 생성. 프로젝트 아래 만들어짐
			f1.createNewFile();
			System.out.println("절대경로: "+f1.getAbsolutePath());
			
			// 2. 존재하는 폴더에 파일 생성 => 경로 지정 해주면 됨 
			File f2 = new File("C:\\Users\\tj\\Desktop\\test.txt");
			f2.createNewFile();
			
			// 3. 없는 폴더에 파일은 생성할 수 없음
			// 4. 폴더 먼저 만들고 파일 만들기
			File tempFolder = new File("C:\\Users\\tj\\Desktop\\temp");
			tempFolder.mkdir();
			
			File f3 = new File("C:\\Users\\tj\\Desktop\\temp\\test.txt");
			f3.createNewFile();
			
			System.out.println(f1.exists()); // true
			System.out.println(new File("file.txt").exists()); // 객체만 생성한거 create안함
			System.out.println(f1.isFile());
			System.out.println(tempFolder.isFile());
			
			System.out.println("─────────────────────────────────");
			
			File folder = new File("parent");
			folder.mkdir();
			
			File file = new File("parent/person.txt");
			System.out.println("파일명: "+file.getName());
			System.out.println("절대경로: "+file.getAbsolutePath());
			System.out.println("파일용량: "+file.length());
			System.out.println("상위폴더: "+file.getParent());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
