package sec01.exam06;
import java.util.Arrays;

public class MyInterfaceExample {
	
	public static void main(String[] args) throws EmptyStringException {

		String str = "Korea,Australia,China,Germany,Spain,Turkey";

		////MyInterface �����ϴ� ���ٽ� 
		MyInterface mi = (s) -> {
			if (s.length() == 0) {//�� ���ڿ��̸� EmptyStringException �߻�
				throw new EmptyStringException();
			}
			//s ���ڿ��� ","�� �����ڷ� �и��Ͽ� ��ȯ
			return s.split(",");
		};

		//mi.getValue() �޼��� ȣ��
		String result[] = mi.getValue(str);
		System.out.println(Arrays.toString(result));//�迭�� ���� ���ڿ��� ��ȯ

		//�� ���ڿ��� ���ڷ� mi.getValue() �޼��� ȣ��(���ܹ߻�)
		String str2 = "";
		String result2[] = mi.getValue(str2);
		System.out.println(Arrays.toString(result2));
	}
}

