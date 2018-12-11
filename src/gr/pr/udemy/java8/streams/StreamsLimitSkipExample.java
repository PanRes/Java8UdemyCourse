package gr.pr.udemy.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(6,7,8,9,10);
		Optional<Integer> limitResult = limit(integerList);

		if (limitResult.isPresent()){
			System.out.println(limitResult.get());
		}
		else {
			System.out.println("The list was empty");
		}

		System.out.println();
		Optional<Integer> skipResult = skip(integerList);

		if (limitResult.isPresent()){
			System.out.println(skipResult.get());
		}
		else {
			System.out.println("The list was empty");
		}

	}

	public static Optional<Integer> limit(List<Integer> integers) {
		//result = 6+7+8
		return integers.stream()
				.limit(3)
				.reduce(Integer::sum);
	}

	public static Optional<Integer> skip(List<Integer> integers) {
		//result = 9+10
		return integers.stream()
				.skip(3)
				.reduce(Integer::sum);
	}
}