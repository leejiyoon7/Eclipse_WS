package sec05.exam06;

public class Earth {
	//��� ����� ���ÿ� �ʱ�ȭ
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	//static {}���� �ʱ�ȭ
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
