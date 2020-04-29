package sec07.exam02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

//Ŭ���̾�Ʈ
public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			//socket����
			socket = new Socket();
			System.out.println( "[���� ��û]");
			//���� ��û
			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println( "[���� ����]");
			
			byte[] bytes = null;//����Ʈ �����͸� ������ ����Ʈ �迭
			String message = null;//����Ʈ �����͸� ���ڿ��� ��ȯ�Ͽ� ������ ����
			
			//socket���κ��� OutputStream ��� - ������ ������
			OutputStream os = socket.getOutputStream();
			message = "Hello Server";//���� ������
			bytes = message.getBytes("UTF-8");//UTF-8 ���ڼ����� bytes �迭�� ��
			
			//������ ������
			os.write(bytes);
			os.flush();
			System.out.println( "[������ ������ ����]");
			
			//socket���κ��� InputStream ��� - ������ �ޱ�
			InputStream is = socket.getInputStream();
			bytes = new byte[100];//�����͸� ������ bytes �迭 ����
			int readByteCount = is.read(bytes);//����Ʈ �����͸� �о� bytes �迭�� ����(����Ʈ�� ����)
			message = new String(bytes, 0, readByteCount, "UTF-8");//bytes �迭�� ���ڿ��� ��ȯ
			System.out.println("[������ �ޱ� ����]: " + message);
			
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