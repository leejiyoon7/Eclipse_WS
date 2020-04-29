package sec01.exam06;

//Comparable �������̽��� ������ Student Ŭ���� ����
public class Student implements Comparable<Student> {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() { return name; }
	public int getScore() { return score; }

	@Override
	public int compareTo(Student o) {
		/* Integer.compare() �޼��� ��ȯ��
		 * this.score < o.score : ����(-1)
		 * this.score == o.score : 0
		 * this.score > o.score : ���(1)
		 */
		return Integer.compare(this.score, o.score);
	}
}
