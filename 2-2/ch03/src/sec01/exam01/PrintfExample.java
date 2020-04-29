package sec01.exam01;


public class PrintfExample {
	public static void main(String[] args) {
		int value = 1000;
		System.out.printf("상품의 가격:%d원\n", value);//상품의 가격:1000원
		System.out.printf("상품의 가격:%6d원\n", value);//상품의 가격:   123원
		System.out.printf("상품의 가격:%-6d원\n", value);//상품의 가격:1000  원
		System.out.printf("상품의 가격:%06d원\n", value);//상품의 가격:001000원

		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);

		String name = "손흥민";
		String job = "축구선수";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}
}
