package sec01.exam11;

import java.util.ArrayList;
import java.util.List;

/* ����� ���� �����̳ʷ� ����� Ŭ���� ����
 * ���л��� ������ �����̳�
 */
public class MaleStudent  {
	//�л� ��ü�� �����ϴ� �÷��� List(���л��� ����)
	private List<Student> list;
	
	//������
	public MaleStudent() {
		list = new ArrayList<Student>();
		//����ϴ� ������ ���
		System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent()");
	}
	
	//List �÷��ǿ� ���л��� �����ϴ� �޼���
	public void accumulate(Student student) {
		list.add(student);
		System.out.println("[" + Thread.currentThread().getName() + "] accumulate()");
	}
	/* ����ó���� ����ϴ� �޼���(����)
	 * �ٸ� �����̳ʸ� �Ű������� �޾Ƽ�, �� �����̳ʿ� �ִ� list�� ��� ���� list�� �߰�(����)
	 */
	public void combine(MaleStudent other) {
		list.addAll(other.getList());
		System.out.println("[" + Thread.currentThread().getName() + "] combine()");
	}
	
	//list�� ���� getter �޼���
	public List<Student> getList() {
		return list;
	}
}
