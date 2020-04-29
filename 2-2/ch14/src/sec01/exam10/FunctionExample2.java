package sec01.exam10;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
	private static List<Student> list = Arrays.asList(
			new Student("�����", 97, 96),
			new Student("�̰���", 95, 97)
	);
	
	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for(Student student : list) {
			sum += function.applyAsInt(student);
		}
		double avg = (double) sum / list.size();
		return avg;
	}
	
	public static void main(String[] args) {
		double englishAvg = avg( s -> s.getEnglishScore() );
		System.out.println("���� ��� ����: " + englishAvg);
		
		double mathAvg = avg( s -> s.getMathScore() );
		System.out.println("���� ��� ����: " + mathAvg);
	}
}
