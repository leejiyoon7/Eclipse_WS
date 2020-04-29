package sec01.exam11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student> list = Arrays.asList(
			new Student("�����", "����", 97),
			new Student("�迬��", "����", 98),
			new Student("�̰���", "����", 95),
			new Student("�տ���", "����", 96)
	);
	/* Predicate�� test()�� ����Ͽ� �Ű����� ���Ͽ� ó���ϴ� �޼��� ����
	 * avg() �޼����� �Ű������� Predicate �Լ��� �������̽��� �����ϸ�
	 * Predicate�� test() �޼��尡 �Ű� ���� ������ true �Ǵ� false�� ����
	 * ��հ��� ���
	 */
	public static double avg(Predicate<Student> predicate) {
		int count = 0, sum = 0;
		for(Student student : list) {
			if(predicate.test(student)) {//student�� �����Ͽ� true/false����
				count++;
				sum += student.getScore();//��������
			}
		}
		return (double) sum / count;//��հ� ��� �� ����
	}
		
	public static void main(String[] args) {
		//avg(Predicate ������ü�� �����ϴ� ������ ���ٽ����� �ۼ�)
		double maleAvg = avg( (t) ->  { return t.getSex().equals("����");} );
		System.out.println("���� ��� ����: " + maleAvg);
			
		double femaleAvg = avg( (t) ->  t.getSex().equals("����") );
		System.out.println("���� ��� ����: " + femaleAvg);
	}
}
