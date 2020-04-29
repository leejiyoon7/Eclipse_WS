package sec07.exam01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

//서버
public class ServerExample {
	public static void main(String[] args) {
		//serverSocket 변수 
		ServerSocket serverSocket = null;
		try {
			//ServerSocket 생성 
			serverSocket = new ServerSocket();	
			//InetSocketAddress 정보를 이용하여 serverSocket에 포트 바인딩
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
			
			while(true) {
				System.out.println( "[연결 기다림]");
				//연결 대기 중 연결 요청이 들어오면 연결 수락(통신을 위한 socket 리턴) 
				Socket socket = serverSocket.accept();
				//연결된 클라이언트 IP 주소 얻기
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함] " + isa.getHostName());
			}
		} catch(Exception e) {}
		
		if(!serverSocket.isClosed()) {//serverSocket 실행중이면
			try {
				serverSocket.close();//serverSocket 닫기
			} catch (IOException e1) {}
		}
	}
}
