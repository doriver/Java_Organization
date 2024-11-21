package aStream;

import java.util.Arrays;
import java.util.List;

public class StreamAndLambdaExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		
		// 스트림과 람다를 사용한 선언적 프로그래밍
		numbers.stream()			// 스트림 생성
			.filter(n -> n%2 == 0)	// 짝수 필터링
			.map(n -> n*n)			// 제곱계산
			.forEach(System.out::println); // 출력
		// 4 , 16 , 36

	}

}
