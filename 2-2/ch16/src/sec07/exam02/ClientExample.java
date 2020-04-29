package sec07.exam02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

//클라이언트
public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			//socket생성
			socket = new Socket();
			System.out.println( "[연결 요청]");
			//연결 요청
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println( "[연결 성공]");
			
			byte[] bytes = null;//바이트 데이터를 저장할 바이트 배열
			String message = null;//바이트 데이터를 문자열로 변환하여 저장할 변수
			
			//socket으로부터 OutputStream 얻기 - 데이터 보내기
			OutputStream os = socket.getOutputStream();
			message = "Hello Server";//보낼 데이터
			bytes = message.getBytes("UTF-8");//UTF-8 문자셋으로 bytes 배열을 얻어냄
			
			//데이터 보내기
			os.write(bytes);
			os.flush();
			System.out.println( "[데이터 보내기 성공]");
			
			//socket으로부터 InputStream 얻기 - 데이터 받기
			InputStream is = socket.getInputStream();
			bytes = new byte[100];//데이터를 저장할 bytes 배열 생성
			int readByteCount = is.read(bytes);//바이트 데이터를 읽어 bytes 배열에 저장(바이트수 리턴)
			message = new String(bytes, 0, readByteCount, "UTF-8");//bytes 배열을 문자열로 변환
			System.out.println("[데이터 받기 성공]: " + message);
			
			os.close();
			is.close();
		} catch(Exception e) {}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e1) {}
		}
	}
}