package sec05.exam02;

public class TvExample {
	public static void main(String[] args) {
		/* Tv 클래스의 info, discountPrice 정적 필드 사용
		   - Tv 클래스를 사용할 시점에 info, discountPrice 정적 필드가 초기화 됨 
		 */
		System.out.println("TV Info : " + Tv.info);
		System.out.println("TV Discount Price : " + Tv.discountPrice);
	}
}
