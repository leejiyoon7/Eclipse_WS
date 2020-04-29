package sec01.exam05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class HashSetExample {
	public static void main(String[] args) {
		lotto_generator(5);
	}

	public static void print_lotto(List<Integer> lottoNum) {
	      for(int k = 0; k<lottoNum.size(); k++) 
	         System.out.print(String.format("%02d,", lottoNum.get(k)));
	}
	//lotto_generator() 메서드를 정적 메서드로 선언
	public static void lotto_generator(int n) {
		//랜덤 숫자를 만들기 위해 Random 객체 생성
		Random number = new Random();
		
		//Integer 타입의 값을 저장하는 HashSet을 참조할 변수 선언 
		HashSet<Integer> lotto = null;
		
		//인자로 받은 n개의 HashSet 객체 생성
		for (int i = 0; i < n; i++) {
			//HashSet 객체 생성
			lotto = new HashSet<Integer>();
			//HashSet에 저장되는 숫자의 개수많큼 반복(로또번호는 6개)
			for (int j = 0; lotto.size() <= 5; j++) {
				//1~45사이의 정수 중 임의의 수 하나를 선택하여 반환된 값을 HashSet에 저장
				lotto.add(number.nextInt(45)+1);//중복된 값은 저장안됨
			}

			//HashSet인 lotto를 초기값을 갖는 ArrayList 생성
			List<Integer> lottoNum = new ArrayList<Integer>(lotto);
			//Collections.sort() 메서드는 인자로 전달된 List의 값을 오름차순으로 정렬
			Collections.sort(lottoNum);
			//System.out.println(lottoNum);
			print_lotto(lottoNum);
		}
	}
}
