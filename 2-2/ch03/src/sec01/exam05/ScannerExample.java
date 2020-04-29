package sec01.exam05;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) throws Exception {
		//scanner 객체 생성
		Scanner scanner = new Scanner(System.in);
		String inputData;

		while(true) {
			//scanner 객체를 이용하여 입력된 값을 읽음
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			
			//equals() 메소드를 이용하여 문자열 비교
			if(inputData.equals("q")) {
				break;
			}
		}		
		System.out.println("종료");
	}
} 
