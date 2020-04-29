package sec01.exam11;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingAndReductionExample {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("�����", 95, Student.Sex.MALE),
				new Student("�迬��", 96, Student.Sex.FEMALE),
				new Student("�̰���", 97, Student.Sex.MALE),
				new Student("�տ���", 98, Student.Sex.FEMALE)
		);
		
		//������ ��� ������ �����ϴ� Map ���
		Map<Student.Sex, Double> mapBySex = totalList.stream()
				.collect(
					Collectors.groupingBy(
						Student :: getSex, //������ �׷���(kay)
						Collectors.averagingDouble(Student :: getScore)//�л� ������ ��հ�(value)
					)
				);
		
		System.out.println("���л� ��� ����: " + mapBySex.get(Student.Sex.MALE));
		System.out.println("���л� ��� ����: " + mapBySex.get(Student.Sex.FEMALE));
		
		//������ ��ǥ�� ���е� �л��� �̸��� �����ϴ� Map ���
		Map<Student.Sex, String> mapByName = totalList.stream()
				.collect(
					Collectors.groupingBy(
						Student :: getSex, //������ �׷���(key)
						Collectors.mapping(//(value)
							Student :: getName,//�л��� �̸��� ����
							Collectors.joining(",")//�л��� �̸� ����
						)
					)
				);
		System.out.println("���л� ��ü �̸�: " + mapByName.get(Student.Sex.MALE));
		System.out.println("���л� ��ü �̸�: " + mapByName.get(Student.Sex.FEMALE));
	}
}
