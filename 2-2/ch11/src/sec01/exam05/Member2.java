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

    /* clone() 메소드 재정의(깊은 복제를 위해)
       - Object의 clone() 메소드를 재정의해서 int[] 배열과 Car 객체를 복제
     */
    @Override
	protected Object clone() throws CloneNotSupportedException {
    	//필드를 복제하기 위해 앝은 복제를 먼저 함(필드 복제)
		Member2 cloned = (Member2) super.clone();
		
		/* 복제된 객체에 scores 배열 복제
		 * 배열 복제 : Arrays.copyOf(복제할 배열, 복제된 배열크기)
		 */
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		
		/* 복제된 객체에 Car 객체 복제  */
		cloned.car = new Car(this.car.model);
		
		//복제된 객체 반환
		return cloned;
	}
	
	//객체를 복제하고 리턴하는 메서드 
	public Member2 getMember() {
        Member2 clonedObj = null;
        try {
        	//재정의한 clone() 메소드를 호출하여 깊은 복제한 객체를 가져옴 
        	clonedObj = (Member2) this.clone();
        } catch (CloneNotSupportedException e) {}
        //복제된 객체를 반환
        return clonedObj;
    }
		
	@Override
	public String toString() {		
		String objField = getClass().getSimpleName() +
		     "[name:" + this.name + ", age:" + this.age + "]";
		return objField;
	}
}