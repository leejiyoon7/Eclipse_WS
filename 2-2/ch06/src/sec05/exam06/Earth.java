package sec05.exam06;

public class Earth {
	//상수 선언과 동시에 초기화
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	//static {}에서 초기화
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
