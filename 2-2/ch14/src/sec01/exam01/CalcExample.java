package sec01.exam01;

public class CalcExample {
	public static void main(String[] args) {
		/* Calc �������̽��� ���ٽ����� ���� */		
		Calc minNum = (int x, int y) -> x < y ? x : y;
		System.out.println("min: " + minNum.getValue(3, 5));
		
		Calc maxNum = (x, y) -> x > y ? x : y;
		System.out.println("max: " + maxNum.getValue(3, 5));
		
		Calc maxNum2 = (x, y) -> {
			if (x > y) { return x;}
			else { return y;}
		};		
		System.out.println("max: " + maxNum2.getValue(3, 5));
		
		//�� ���� �Է��Ͽ� x���� y������ �� ���
		Calc sum = (x, y) -> {
			int result = 0;
			for(int i=x; i<=y; i++) {
				result+=i;
			}
			return result;
		};			
		System.out.println("sum: " + sum.getValue(1, 10));
		
		//�͸� Ŭ������ ����
		Calc minNum2 = new Calc() {		
			@Override
			public int getValue(int x, int y) {
				if (x < y) { 
					return x;
				} else  return y;
			}
		};
		System.out.println("min: " + minNum2.getValue(3, 5));
		
		Calc add = (x, y) -> sum(x, y);
		System.out.println("sum: " + add.getValue(10, 25));
		
	}	
	
	public static int sum(int x, int y) {
		return (x + y);
	}
}
