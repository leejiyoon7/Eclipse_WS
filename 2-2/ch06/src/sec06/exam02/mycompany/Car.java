package sec06.exam02.mycompany;

import sec06.exam02.hankook.SnowTire;
import sec06.exam02.hyundai.Engine;
import sec06.exam02.kumho.BigWidthTire;

public class Car {
	//auto import:Ctrl+shift+o
	Engine engine = new Engine();
	SnowTire tire = new SnowTire();
	BigWidthTire bigTire = new BigWidthTire();
	
	//Tire Ŭ������ �� ��Ű���� ��� �ִ� ���, ��Ű�� ���� ��ü �̸��� ���
	sec06.exam02.hankook.Tire hankookTire = 
			new sec06.exam02.hankook.Tire();
	sec06.exam02.kumho.Tire kumhoTire = 
			new sec06.exam02.kumho.Tire();	
}
