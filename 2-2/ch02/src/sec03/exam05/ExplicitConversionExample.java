package sec03.exam05;

public class ExplicitConversionExample {
	public static void main(String[] args) {
		double dNum = 5.7;
		float fNum = 1.7f;
		
		int result1 = (int) dNum + (int) fNum;//두 실수가 각각 강제 형변환
		int result2 = (int) (dNum + fNum);//fNum이 double로 변환되어 계산하고 int로 강제 형변환		
		float result3 = (float) (dNum + fNum);//fNum이 double로 변환되어 계산하고 float으로 강제 형변환
		double result4 = dNum + fNum;//fNum이 double로 자동 변환되어 계산
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		System.out.println("result4: " + result4);
	}
}
