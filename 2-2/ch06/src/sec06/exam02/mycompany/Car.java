package sec06.exam02.mycompany;

import sec06.exam02.hankook.SnowTire;
import sec06.exam02.hyundai.Engine;
import sec06.exam02.kumho.BigWidthTire;

public class Car {
	//auto import:Ctrl+shift+o
	Engine engine = new Engine();
	SnowTire tire = new SnowTire();
	BigWidthTire bigTire = new BigWidthTire();
	
	//Tire 클래스가 두 패키지에 모두 있는 경우, 패키지 포함 전체 이름을 기술
	sec06.exam02.hankook.Tire hankookTire = 
			new sec06.exam02.hankook.Tire();
	sec06.exam02.kumho.Tire kumhoTire = 
			new sec06.exam02.kumho.Tire();	
}
