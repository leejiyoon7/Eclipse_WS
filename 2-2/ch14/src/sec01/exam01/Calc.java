package sec01.exam01;

/* 함수형 인터페이스 선언 */
@FunctionalInterface
public interface Calc {
	public int getValue(int x, int y);
}
