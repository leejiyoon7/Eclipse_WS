package sec07.exam02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

//서버
public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();		
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
			while(true) {
				System.out.println( "[연결 기다림]");
				//ServerSocket 생성 
				Socket socket = serverSocket.accept();
				//InetSocketAddress 정보를 이용하여 serverSocket에 포트 바인딩
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함] " + isa.getHostName());
				
				byte[] bytes = null;
				String message = null;
				
				//socket으로부터 InputStream 얻기 - 데이터 받기
				InputStream is = socket.getInputStream();
				bytes = new byte[100];//데이터를 저장할 bytes 배열 생성
				int readByteCount = is.read(bytes);//바이트 데이터를 읽어 bytes 배열에 저장(바이트수 리턴)
				message = new String(bytes, 0, readByteCount, "UTF-8");//bytes 배열을 문자열로 변환
				System.out.println("[데이터 받기 성공]: " + message);
				
				//socket으로부터 OutputStream 얻기 - 데이터 보내기
				OutputStream os = socket.getOutputStream();
				message = "Hello Client";//보낼 데이터
				bytes = message.getBytes("UTF-8");//UTF-8 문자셋으로 bytes 배열을 얻어냄
				//데이터 보내기
				os.write(bytes);
				os.flush();
				System.out.println( "[데이터 보내기 성공]");
				
				is.close();
				os.close();
				socket.close();
			}
		} catch(Exception e) {}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e1) {}
		}
	}
}
