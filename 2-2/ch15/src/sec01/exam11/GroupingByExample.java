package sec01.exam11;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
	public static void main(String[] args) {
		//�÷��� ����
		List<Student> totalList = Arrays.asList(
				new Student("�����", 10, Student.Sex.MALE, Student.City.Seoul),
				new Student("�迬��", 6, Student.Sex.FEMALE, Student.City.Pusan),
				new Student("�̰���", 10, Student.Sex.MALE, Student.City.Pusan),
				new Student("������", 6, Student.Sex.FEMALE, Student.City.Seoul)
		);
		
		/* ������ �л� ��ü�� �׷����ؼ� Map ��ü ����
		 * Map Ÿ�� ���� ����<key:�л��� ����, value:�л� List �÷���> ������ */
		Map<Student.Sex, List<Student>> mapBySex = totalList.stream()//�������� ��Ʈ�� ���
				//�л��� ���� key�� �׷����Ͽ� Map �÷��� ����(���:Student ��ü)
				.collect(Collectors.groupingBy(Student :: getSex));
		
		//���л� �׷��� �÷��� Ȯ��
		System.out.print("[���л�] ");
		mapBySex.get(Student.Sex.MALE).stream()
		        .forEach(s->System.out.print(s.getName() + " "));
		
		//���л� �׷��� �÷��� Ȯ��
		System.out.print("\n[���л�] ");		
		mapBySex.get(Student.Sex.FEMALE).stream()
		        .forEach(s->System.out.print(s.getName() + " "));
		
		System.out.println();
		
		/* �л��� ���������� �л� ��ü�� �׷����ؼ� Map ��ü ����
		 * Map Ÿ�� ���� ����<key:�л��� ������, value:�л� �̸�> ������ */
		Map<Student.City, List<String>> mapByCity = totalList.stream()//�������� ��Ʈ�� ���
				.collect(
						Collectors.groupingBy(//������ ���� �׷���
								Student::getCity, //key: �л��� ������
								//value: �л� �̸�(�л� ��ü�� �̸����� �����Ͽ� �̸��� List �÷��ǿ� ����)
								Collectors.mapping(Student::getName, Collectors.toList())
						)
				); 
		
		// ���� ������ �÷��� Ȯ��
		System.out.print("\n[����] ");
		//�������� ������ �л� List�� ����, List���� �������� ��Ʈ���� ��� ���
		mapByCity.get(Student.City.Seoul).stream()
		         .forEach(s->System.out.print(s + " "));
		// �λ� ������ �÷��� Ȯ��
		System.out.print("\n[�λ�] ");
		//�������� �λ��� �л� List�� ����, List���� �������� ��Ʈ���� ��� ���
		mapByCity.get(Student.City.Pusan).stream()
		         .forEach(s->System.out.print(s + " "));	
	}
}
