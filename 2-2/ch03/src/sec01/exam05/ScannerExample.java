package sec01.exam05;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) throws Exception {
		//scanner ��ü ����
		Scanner scanner = new Scanner(System.in);
		String inputData;

		while(true) {
			//scanner ��ü�� �̿��Ͽ� �Էµ� ���� ����
			inputData = scanner.nextLine();
			System.out.println("�Էµ� ���ڿ�: \"" + inputData + "\"");
			
			//equals() �޼ҵ带 �̿��Ͽ� ���ڿ� ��
			if(inputData.equals("q")) {
				break;
			}
		}		
		System.out.println("����");
	}
} 
