package sec07.exam01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

//Ŭ���̾�Ʈ
public class ClientExample {
	public static void main(String[] args) {
		//socket ����
		Socket socket = null;
		try {
			//socket����
			socket = new Socket();
			System.out.println( "[���� ��û]");
			//���� ��û
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println( "[���� ����]");
		} catch(Exception e) {}
		
		if(!socket.isClosed()) {
			try {
				socket.close();//socket �ݱ�
			} catch (IOException e1) {}
		}	
	}
}
