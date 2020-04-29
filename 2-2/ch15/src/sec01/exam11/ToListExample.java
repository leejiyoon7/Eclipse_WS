package sec01.exam11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {
	public static void main(String[] args) {
		//totalList �÷��� ����
		List<Student> totalList = Arrays.asList(
				new Student("�����", 95, Student.Sex.MALE),
				new Student("�迬��", 96, Student.Sex.FEMALE),
				new Student("�̰���", 97, Student.Sex.MALE),
				new Student("�տ���", 98, Student.Sex.FEMALE)
		);
		
		/* ���л��鸸 ���� List �÷��� ����
		 * collect() �޼����� ���ϰ��� List �÷���
		 */
		List<Student> maleList = totalList.stream()//�������� ��Ʈ�� ����
				.filter(s->s.getSex()==Student.Sex.MALE)//���л� ���͸�
				//Collectors.toList() �޼��带 ȣ���Ͽ� List �÷����� �����Ͽ� ���л� ��� �����Ͽ� ����				
				.collect(Collectors.toList());
		
		//maleList���� ��Ʈ���� ���� ��Ұ���(�л��̸�) ���
		maleList.stream()
			.forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
		/* ���л��鸸 ���� HashSet �÷��� ����
		 * Collectors.toCollection() �޼����� ���ϰ��� Set �÷���
		 */
		Set<Student> femaleSet = totalList.stream()
				.filter(s -> s.getSex() == Student.Sex.FEMALE)
				//Collectors.toCollection() �޼��带 ȣ���Ͽ� HashSet �÷����� �����Ͽ� ���л� ��Ҹ� �����Ͽ� ����	
				.collect(Collectors.toCollection(HashSet :: new));
				//.collect( Collectors.toCollection(()->{return new HashSet<Student>();}) );
				//.collect( Collectors.toCollection(()->new HashSet<Student>()) );
		
		//femaleSet���� ��Ʈ���� ���� ��Ұ���(�л��̸�) ���
		femaleSet.stream()
			.forEach(s -> System.out.println(s.getName()));
	}
}
