package gr.pr.udemy.java8.personal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample3 {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1,3,5,6,4,6);

		int sum = integerList.stream()
				.mapToInt(Integer::intValue)
				.sum();

		System.out.println(sum);

		System.out.println();
		Stream<Integer> integerStream = Stream.iterate(1, integer -> integer * 2)
				.skip(1)
				.limit(10);

		List<Integer> integerList1 = integerStream.collect(Collectors.toList());

		System.out.println();
		integerList1.forEach(System.out::println);
	}

}
