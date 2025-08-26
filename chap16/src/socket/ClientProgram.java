package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientProgram {

	public static void main(String[] args) {
		int port = 3006;
		BufferedReader br = null; // 입력용 보조스트림
		PrintWriter pw = null; // 출력용 보조스트림
		Socket socket = null;
		
		Scanner s = new Scanner(System.in);
		try {
//			1. 서버의 포트 번호, ip주소를 알아야 함
			String ip = InetAddress.getLocalHost().getHostAddress(); // ip만 가져오기
			socket = new Socket(ip,port);
			
			System.out.println("서버와 연결 성공");
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));	
			pw = new PrintWriter(socket.getOutputStream()); 
			
			System.out.println("서버: "+ br.readLine());
			
			while(true) {
				System.out.println("클라이언트: ");
				pw.println(s.nextLine());
				pw.flush();
				
				System.out.println("서버: "+br.readLine());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			pw.close();
			br.close();
			socket.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	}

}
