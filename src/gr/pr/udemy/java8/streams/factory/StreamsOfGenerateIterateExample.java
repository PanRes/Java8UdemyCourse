package gr.pr.udemy.java8.streams.factory;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamsOfGenerateIterateExample {
	public static void main(String[] args) {

		Stream<String> namesStream = Stream.of("PR","McCoy", "Angel");
		namesStream.forEach(System.out::println);

		System.out.println();

		//seed is the the initial number(the first number in the stream) then is multiplied by 2 and added to the stream
		//until the stream reaches the length of 10 inputs
		Stream.iterate(1,i -> i*2)
				.limit(10)
				.forEach(System.out::println);

		Supplier<Integer> integerSupplier = new Random()::nextInt;
		Stream.generate(integerSupplier)
				.limit(5)
				.forEach(System.out::println);
	}
}