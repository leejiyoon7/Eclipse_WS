package sec07.exam01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

//����
public class ServerExample {
	public static void main(String[] args) {
		//serverSocket ���� 
		ServerSocket serverSocket = null;
		try {
			//ServerSocket ���� 
			serverSocket = new ServerSocket();	
			//InetSocketAddress ������ �̿��Ͽ� serverSocket�� ��Ʈ ���ε�
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
			
			while(true) {
				System.out.println( "[���� ��ٸ�]");
				//���� ��� �� ���� ��û�� ������ ���� ����(����� ���� socket ����) 
				Socket socket = serverSocket.accept();
				//����� Ŭ���̾�Ʈ IP �ּ� ���
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[���� ������] " + isa.getHostName());
			}
		} catch(Exception e) {}
		
		if(!serverSocket.isClosed()) {//serverSocket �������̸�
			try {
				serverSocket.close();//serverSocket �ݱ�
			} catch (IOException e1) {}
		}
	}
}
