package sec02.exam01;

public class MultiCatchExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;

		/* mluti catch : try ������ ���� ���� ���ܰ� �߻��ϸ� ���ܺ��� catch�� ó��  */
		try {
			data1 = args[0];
			data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println("result:" + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű����� ���� �����մϴ�." + e);
		} catch (NumberFormatException e) {
			System.out.println("���ڷ� ��ȯ�� �� �����ϴ�." + e);
		} finally {
			System.out.println("Done");
		}
	}
}
