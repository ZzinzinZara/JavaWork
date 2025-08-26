package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientProgram2 {

	public static void main(String[] args) {
		int port = 3006;
		Scanner s = new Scanner(System.in);
		try{
			String ip = InetAddress.getLocalHost().getHostAddress();
			try(Socket socket = new Socket(ip,port);){
				try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));	
					PrintWriter pw = new PrintWriter(socket.getOutputStream());){
					System.out.println("서버와 연결 성공");
					System.out.println("서버: "+ br.readLine());
					
					String msg = null;
					while((msg = br.readLine()) != null) {
						System.out.println("서버: "+msg);
						System.out.print("클라이언트: ");
						String send = s.nextLine();
						pw.println(send);
						pw.flush();
						if(send.equals("exit")) {
							System.out.println("채팅을 종료합니다");
							break;
						}
					}
				}
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
