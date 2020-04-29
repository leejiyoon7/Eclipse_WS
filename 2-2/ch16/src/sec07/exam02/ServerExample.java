package sec07.exam02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

//����
public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();		
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
			while(true) {
				System.out.println( "[���� ��ٸ�]");
				//ServerSocket ���� 
				Socket socket = serverSocket.accept();
				//InetSocketAddress ������ �̿��Ͽ� serverSocket�� ��Ʈ ���ε�
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[���� ������] " + isa.getHostName());
				
				byte[] bytes = null;
				String message = null;
				
				//socket���κ��� InputStream ��� - ������ �ޱ�
				InputStream is = socket.getInputStream();
				bytes = new byte[100];//�����͸� ������ bytes �迭 ����
				int readByteCount = is.read(bytes);//����Ʈ �����͸� �о� bytes �迭�� ����(����Ʈ�� ����)
				message = new String(bytes, 0, readByteCount, "UTF-8");//bytes �迭�� ���ڿ��� ��ȯ
				System.out.println("[������ �ޱ� ����]: " + message);
				
				//socket���κ��� OutputStream ��� - ������ ������
				OutputStream os = socket.getOutputStream();
				message = "Hello Client";//���� ������
				bytes = message.getBytes("UTF-8");//UTF-8 ���ڼ����� bytes �迭�� ��
				//������ ������
				os.write(bytes);
				os.flush();
				System.out.println( "[������ ������ ����]");
				
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
