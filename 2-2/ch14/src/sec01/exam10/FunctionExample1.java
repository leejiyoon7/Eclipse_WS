package sec01.exam10;

import java.util.function.Function;

public class FunctionExample1 {
	public static void main(String[] args) {
		//���ڿ�(String)�� �Ű������� �޾� Integer ��ü�� �����Ͽ� ����
		Function<String, Integer> func = (s) -> {
			int cnt = 0;
			String[] word = s.split(" ");
			cnt = word.length;
			return cnt;
		};

		int wordCnt = func.apply("Function �Լ��� �������̽��� �Ű� ���� �޾� �����Ͽ� ���� ������ �����ϴ� ��� ����");
		System.out.println("�ܾ� �� : " + wordCnt);
	}
}
