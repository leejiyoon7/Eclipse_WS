package sec01.exam01;


public class PrintfExample {
	public static void main(String[] args) {
		int value = 1000;
		System.out.printf("��ǰ�� ����:%d��\n", value);//��ǰ�� ����:1000��
		System.out.printf("��ǰ�� ����:%6d��\n", value);//��ǰ�� ����:   123��
		System.out.printf("��ǰ�� ����:%-6d��\n", value);//��ǰ�� ����:1000  ��
		System.out.printf("��ǰ�� ����:%06d��\n", value);//��ǰ�� ����:001000��

		double area = 3.14159 * 10 * 10;
		System.out.printf("�������� %d�� ���� ����:%10.2f\n", 10, area);

		String name = "�����";
		String job = "�౸����";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}
}
