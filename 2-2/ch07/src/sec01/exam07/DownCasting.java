package sec01.exam07;

import java.util.ArrayList;

class Animal{
	public void move(){
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move(){
		System.out.println("사람이 두 발로 걷습니다. ");
	}
	
	public void readBook(){
		System.out.println("사람이 책을 읽습니다. ");
	}
}

class Tiger extends Animal{
	public void move()	{
		System.out.println("호랑이가 네 발로 뜁니다. ");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다. ");
	}
}

class Eagle extends Animal{
	public void move(){
		System.out.println("독수리가 하늘을 납니다 ");
	}
	
	public void flying() {
		System.out.print("독수리가 날개를 쭉 펴고 멀리 날아갑니다");
	}
}

//DownCasting 클래스 선언
public class DownCasting {
	//배열의 자료형은 Animal 형으로 지정
	ArrayList<Animal> aniList = new ArrayList<Animal>();

	public static void main(String[] args) {
		//실행을 위한 DownCasting 객체 생성
		DownCasting aTest = new DownCasting();
		//각 동물의 인스턴스를 생성하여 ArrayList에 추가하는 addAnimal() 호출
		aTest.addAnimal();
		
		System.out.println("원래 타입으로 다운 캐스팅 ");
		//다운 캐스팅을 위한 testCasting() 호출
		aTest.testCasting();

	}
	
	/* 각 동물의 인스턴스를 생성하면서 Animal 형으로 선언된 배열에 추가
	   - ArrayList에 추가되는 각 동물의 인스턴스는 Animal 형으로 자동 타입 변환
	 */
	public void addAnimal()	{
		aniList.add(new Human()); 
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		/*  배열의 요소들을 Animal형으로 꺼내서 move() 메서드를  호출하면 
		        오버라이딩된 move() 메소드가 호출 됨
		 */
		for(Animal ani : aniList){ 
			ani.move();             
		}
	}

	//다운 캐스팅 메소드
	public void testCasting(){
		 //모든 배열 항목들을 하나씩 꺼내서 다운 캐스팅
		for(int i=0; i<aniList.size(); i++){ 
			
			// 배열에서 꺼내온 객체를 Animal 타입의 변수에 저장
			Animal ani = aniList.get(i); 
			
		    /* 변수 ani가 참조하는 객체가 어떤 객체인지 비교하여 다운 캐스팅  */
			if(ani instanceof Human){ //Human이면
				Human h = (Human)ani; //Human형으로 다운 캐스팅
				// Human 객체의 readBook() 메소드 호출
				h.readBook();
			}
			else if(ani instanceof Tiger){ //Tiger 형이면
				Tiger t = (Tiger)ani;      //Tiger형으로 다운 캐스팅
				//Tiger 객체의 hunting() 호출
				t.hunting();
			}
			else if(ani instanceof Eagle){//Eagle 형이면
				Eagle e = (Eagle)ani;     //Eagle 형으로 다운 캐스팅
				//Eagle 객체의 flying() 메소드 호출
				e.flying();
			}
			else{
				System.out.println("지원되지 않는 타입입니다.");
			}
		}
	}
}





