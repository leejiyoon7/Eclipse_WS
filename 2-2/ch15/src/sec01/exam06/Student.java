package sec01.exam06;

//Comparable 인터페이스를 구현한 Student 클래스 선언
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
		/* Integer.compare() 메서드 반환값
		 * this.score < o.score : 음수(-1)
		 * this.score == o.score : 0
		 * this.score > o.score : 양수(1)
		 */
		return Integer.compare(this.score, o.score);
	}
}
