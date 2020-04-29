package sec01.exam05;

import java.util.Arrays;

public class Member2 implements Cloneable {
	public String name;
    public int age;
    public int[] scores;
    public Car car;
    
    public Member2(String name, int age, int[] scores, Car car) {
        this.name = name;
        this.age = age;
        this.scores = scores;
        this.car = car;
    }

    /* clone() �޼ҵ� ������(���� ������ ����)
       - Object�� clone() �޼ҵ带 �������ؼ� int[] �迭�� Car ��ü�� ����
     */
    @Override
	protected Object clone() throws CloneNotSupportedException {
    	//�ʵ带 �����ϱ� ���� ���� ������ ���� ��(�ʵ� ����)
		Member2 cloned = (Member2) super.clone();
		
		/* ������ ��ü�� scores �迭 ����
		 * �迭 ���� : Arrays.copyOf(������ �迭, ������ �迭ũ��)
		 */
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		
		/* ������ ��ü�� Car ��ü ����  */
		cloned.car = new Car(this.car.model);
		
		//������ ��ü ��ȯ
		return cloned;
	}
	
	//��ü�� �����ϰ� �����ϴ� �޼��� 
	public Member2 getMember() {
        Member2 clonedObj = null;
        try {
        	//�������� clone() �޼ҵ带 ȣ���Ͽ� ���� ������ ��ü�� ������ 
        	clonedObj = (Member2) this.clone();
        } catch (CloneNotSupportedException e) {}
        //������ ��ü�� ��ȯ
        return clonedObj;
    }
		
	@Override
	public String toString() {		
		String objField = getClass().getSimpleName() +
		     "[name:" + this.name + ", age:" + this.age + "]";
		return objField;
	}
}