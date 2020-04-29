package sec01.exam05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FlatMapExample {
	public static void main(String[] args) {
		//두 개의 요소를 갖는 컬렉션 생성
		List<String> inputList1 = Arrays.asList("java8 lambda", "stream mapping");
		
		//inputList1 컬렉션의 각 요소의 단어들을 공백(" ")으로 분리하여 새로운 스트림을 생성하여 출력
		inputList1.stream()//오리지널 스트림 참조
		     /* 각 요소의 단어들을 공백으로 분리하여 배열을 생성한 후, 배열에서 stream을 얻어내어 
		      * 중간 스트림을 생성하고, forEach()문으로 요소를 하나씩 출력
		      */
			.flatMap(data -> Arrays.stream(data.split(" ")))
			.forEach(word -> System.out.println(word));
		
		System.out.println();
		
		//두 개의 요소를 갖는 컬렉션 생성
		List<String> inputList2 = Arrays.asList("10, 20, 30", "40, 50, 60");
		
		//inputList2 컬렉션의 각 요소의 숫자들을 콤마(",")으로 분리하여, 숫자를 요소를 갖는 새로운 스트림을 생성하여 출력
		inputList2.stream()
		    //flatMapToInt(): 문자열에 있는 값을 숫자로 분리하여 IntStream으로 반환하는 메서드
			.flatMapToInt(data -> {
				//각 요소의 숫자들을 콤마로 분리하여 String 배열로 생성
				String[] strArr = data.split(",");
				//숫자를 저장할 int 배열 생성하고, 문자열(숫자)을 int로 변환하여 배열에 저장
				int[] intArr = new int[strArr.length];
				for(int i=0; i<strArr.length; i++) {
					intArr[i] = Integer.parseInt(strArr[i].trim());
				}
				return Arrays.stream(intArr);//IntStream 리턴(중간 스트림 생성)
			})
			.forEach(number -> System.out.println(number));//중간 스트림에서 요소 출력
	}
}
