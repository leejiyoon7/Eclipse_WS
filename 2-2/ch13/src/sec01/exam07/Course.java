package sec01.exam07;

/*���׸� Ÿ��(���� Course Ŭ���� ����
 * Course�� �پ��� ������� ������ �� ����
 * T Ÿ�� : �л�, �Ϲ���, �ٷ��� ��
 */
public class Course<T> {
	private String name;//������
	private T[] students;//������ �迭(TŸ�� �迭)
	
	//������(������, �ִ�����ο�)
	public Course(String name, int capacity) {
		this.name = name;//������
		//�ִ� �����ο��� Object �迭�� �����Ͽ� (T[]) Ÿ������ ���� Ÿ�� ��ȯ
		students = (T[]) (new Object[capacity]);
	}

	public String getName() { 
		return name; 
	}
	
	public T[] getStudents() { 
		return students; 
	}
	
	/* T Ÿ���� �Ű������� �޴� add() �޼���
	 * TŸ�� ��ü�� �Ű������� �޾Ƽ� ������ �迭(students)�� �����ϴ� �ż���
	 * students.length�� capacity
	 */
	public void add(T t) {
		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {//����ִ� �迭 ������ ������ �� break
				students[i] = t;
				break;
			}
		}
	}
}

