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
	//lotto_generator() �޼��带 ���� �޼���� ����
	public static void lotto_generator(int n) {
		//���� ���ڸ� ����� ���� Random ��ü ����
		Random number = new Random();
		
		//Integer Ÿ���� ���� �����ϴ� HashSet�� ������ ���� ���� 
		HashSet<Integer> lotto = null;
		
		//���ڷ� ���� n���� HashSet ��ü ����
		for (int i = 0; i < n; i++) {
			//HashSet ��ü ����
			lotto = new HashSet<Integer>();
			//HashSet�� ����Ǵ� ������ ������ŭ �ݺ�(�ζǹ�ȣ�� 6��)
			for (int j = 0; lotto.size() <= 5; j++) {
				//1~45������ ���� �� ������ �� �ϳ��� �����Ͽ� ��ȯ�� ���� HashSet�� ����
				lotto.add(number.nextInt(45)+1);//�ߺ��� ���� ����ȵ�
			}

			//HashSet�� lotto�� �ʱⰪ�� ���� ArrayList ����
			List<Integer> lottoNum = new ArrayList<Integer>(lotto);
			//Collections.sort() �޼���� ���ڷ� ���޵� List�� ���� ������������ ����
			Collections.sort(lottoNum);
			//System.out.println(lottoNum);
			print_lotto(lottoNum);
		}
	}
}
