package gr.pr.udemy.java8.streams.numeric_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);

		System.out.println("Sum of list " + sumOfNumbersList(integerList));
		System.out.println();
		System.out.println("Sum using InteStream " + sumOfNumbersIntStream());

	}

	public static int sumOfNumbersList(List<Integer> integers) {
		return integers.stream()
				.reduce(0, Integer::sum);
	}

	public static int sumOfNumbersIntStream() {
		return IntStream.rangeClosed(1,6)
				.sum();
	}
}