package sec06.exam01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
	public static void main(String[] args) {
		try {
			//로컬 컴퓨터에서 ip 주소 얻기
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내컴퓨터 IP주소: " + local.getHostAddress());
			
			//도메인 이름으로 복수 ip 주소 얻기
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP주소: " + remote.getHostAddress());
			}
		} catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}
}


