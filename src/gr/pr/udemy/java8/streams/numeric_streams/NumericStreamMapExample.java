package gr.pr.udemy.java8.streams.numeric_streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {

	public static void main(String[] args) {

		System.out.println("mapToObj " + mapToObj());
		System.out.println("mapToLong " + mapToLong());
		System.out.println("mapToDouble " + mapToDouble());

	}

	public static List<Integer> mapToObj() {
		return IntStream.rangeClosed(1,5)
				.mapToObj(Integer::new)
				.collect(Collectors.toList());
	}

	public static Long mapToLong() {
		return IntStream.rangeClosed(1,5)
				.mapToLong(i -> i)
				.sum();
	}

	public static Double mapToDouble() {
		return IntStream.rangeClosed(1,5)
				.mapToDouble(i -> i)
				.sum();
	}
}