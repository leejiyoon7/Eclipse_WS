package sec01.exam03;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {
	public static void main(String[] args) {
		/* List<Member> Ÿ���� list �÷��� ����
		 * Arrays.asList(): �ʿ��� ��ŭ�� ������ capacity�� �����ϱ� ������ �޸𸮸� ���������� ���
		 * (��, list�� �߰�/���� �Ұ�(UnsupportedOperationException))
		 */
		List<Member> list = Arrays.asList(
				new Member("�����", Member.MALE, 27),
				new Member("�迬��", Member.FEMALE, 29),
				new Member("�̰���", Member.MALE, 18),
				new Member("�¿�", Member.FEMALE, 28),
				new Member("��Ŵ", Member.MALE, 31),
				new Member("������", Member.FEMALE, 43)
		);
		
		/* ��Ʈ�� ������������ �̿��Ͽ� ����ȸ���� ��ճ��� ���
		 * 1) list�κ��� Member ��ü�� ��ҷ� ������ �������� stream ��������
		 * 2) filter() �޼���� ���� ȸ���� ���͸��Ͽ� �߰���Ʈ�� ����(���͸� �߰�ó��)
		 * 3) mapToInt() �޼���� ����ȸ���� ���̸� ��ҷ� ������ �߰���Ʈ�� ����(���� �߰�ó��)
		 *    - Member��ü�� getAge() �޼����� ���ϰ����� �߰���Ʈ�� ����(���� ��ҷ� ������ IntStream)
		 * 4) average() �޼��带 ȣ���Ͽ� ��ճ��̸� ����(����ó��)
		 *    - average()�� ���� Ÿ���� OptionalDouble�̱� ������ getAsDouble() �޼��带 ȣ���Ͽ�
		 *      Double Ÿ���� ��հ��� ���Ѵ�.
		 */
		double ageAvg =   list.stream()
			.filter(m -> m.getSex()==Member.MALE)
			.mapToInt(Member :: getAge)
			.average()
			.getAsDouble();
		
		//String.format("%.2f", ageAvg))���� ��ճ��̸� �Ҽ��� 2��° �ڸ����� ǥ��
		System.out.println("���� ��� ����: " + String.format("%.2f", ageAvg));
	}
}


