package sec01.exam03;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {
	public static void main(String[] args) {
		/* List<Member> 타입의 list 컬렉션 생성
		 * Arrays.asList(): 필요한 만큼의 고정된 capacity를 생성하기 때문에 메모리를 경제적으로 사용
		 * (단, list에 추가/삭제 불가(UnsupportedOperationException))
		 */
		List<Member> list = Arrays.asList(
				new Member("손흥민", Member.MALE, 27),
				new Member("김연아", Member.FEMALE, 29),
				new Member("이강인", Member.MALE, 18),
				new Member("태연", Member.FEMALE, 28),
				new Member("폴킴", Member.MALE, 31),
				new Member("박정현", Member.FEMALE, 43)
		);
		
		/* 스트림 파이프라인을 이용하여 남자회원의 평균나이 계산
		 * 1) list로부터 Member 객체를 요소로 가지는 오리지널 stream 가져오기
		 * 2) filter() 메서드로 남자 회원만 필터링하여 중간스트림 생성(필터링 중간처리)
		 * 3) mapToInt() 메서드로 남자회원의 나이를 요소로 가지는 중간스트림 생성(맵핑 중간처리)
		 *    - Member객체의 getAge() 메서드의 리턴값으로 중간스트림 생성(나이 요소로 구성된 IntStream)
		 * 4) average() 메서드를 호출하여 평균나이를 집계(최종처리)
		 *    - average()의 리턴 타입이 OptionalDouble이기 때문에 getAsDouble() 메서드를 호출하여
		 *      Double 타입의 평균값을 구한다.
		 */
		double ageAvg =   list.stream()
			.filter(m -> m.getSex()==Member.MALE)
			.mapToInt(Member :: getAge)
			.average()
			.getAsDouble();
		
		//String.format("%.2f", ageAvg))으로 평균나이를 소숫점 2번째 자리까지 표현
		System.out.println("남자 평균 나이: " + String.format("%.2f", ageAvg));
	}
}


