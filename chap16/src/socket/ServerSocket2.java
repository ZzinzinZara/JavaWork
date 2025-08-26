package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocket2 {

	public static void main(String[] args) {
		int port = 3006;
		Scanner s = new Scanner(System.in);
		try {
			try(ServerSocket server = new ServerSocket(port)){
				System.out.println("클라이언트의 요청을 기다리는 중...");
				
				Socket socket = server.accept();
				System.out.println(socket.getInetAddress().getHostAddress()+"가 연결을 요청함");
				
				try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))
					;PrintWriter pw = new PrintWriter(socket.getOutputStream())){
						
					pw.println("(☞ﾟヮﾟ)☞ 환영합니다 ☜(ﾟヮﾟ☜)");
					pw.flush(); 
					
					while(true) {
						System.out.println("클라이언트: "+br.readLine());
						
						System.out.println("서버: ");
						pw.println(s.nextLine());
						pw.flush();
					}
				}
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
