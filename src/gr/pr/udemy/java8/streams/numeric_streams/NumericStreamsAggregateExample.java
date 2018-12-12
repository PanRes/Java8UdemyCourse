package gr.pr.udemy.java8.streams.numeric_streams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamsAggregateExample {

	public static void main(String[] args) {

		int sum = IntStream.rangeClosed(1,50).sum();

		System.out.println("The sum is: " + sum);
		System.out.println();

		OptionalInt optionalIntMax = IntStream.rangeClosed(0,0).max();

		System.out.println("Max value = " + (optionalIntMax.isPresent() ? optionalIntMax.getAsInt() : "empty " + optionalIntMax));
		System.out.println();

		OptionalLong optionalLongMin = LongStream.rangeClosed(50,100).min();

		System.out.println("Min value = " + (optionalLongMin.isPresent() ? optionalLongMin.getAsLong() : "empty " + optionalIntMax));

		System.out.println();

		OptionalDouble optionalDouble = IntStream.rangeClosed(1,50).average();

		System.out.println("Max value = " + (optionalDouble.isPresent() ? optionalDouble.getAsDouble() : "empty " + optionalDouble));

	}
}