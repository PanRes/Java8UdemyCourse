package gr.pr.udemy.java8.streams.numeric_streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingExample {

	public static void main(String[] args) {

		System.out.println(boxing());
		System.out.println(unboxing(boxing()));

	}

	public static List<Integer> boxing() {
		return IntStream.rangeClosed(1,10)
				//boxed needed because cannot exist List<int> but it needs wrapped class Integer
				//with boxed convert the primitive to wrapped class
				.boxed()
				.collect(Collectors.toList());
	}

	public static int unboxing(List<Integer> integers) {
		return integers.stream()
				//convert each input to primitive type
				.mapToInt(Integer::intValue)
				.sum();
	}
}