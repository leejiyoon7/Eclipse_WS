package sec07.exam01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

//클라이언트
public class ClientExample {
	public static void main(String[] args) {
		//socket 변수
		Socket socket = null;
		try {
			//socket생성
			socket = new Socket();
			System.out.println( "[연결 요청]");
			//연결 요청
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println( "[연결 성공]");
		} catch(Exception e) {}
		
		if(!socket.isClosed()) {
			try {
				socket.close();//socket 닫기
			} catch (IOException e1) {}
		}	
	}
}
