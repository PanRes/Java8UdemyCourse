package gr.pr.udemy.java8.streams.numeric_streams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamsRangeExample {

	public static void main(String[] args) {

		System.out.println("Range count 1 -> 50: " + IntStream.range(1, 50).count());

		IntStream.range(1,50)
				.forEach(i -> System.out.print(i + ", "));

		System.out.println();
		System.out.println("Range Closed count 1 -> 50: " + IntStream.rangeClosed(1, 50).count());

		IntStream.rangeClosed(1, 50)
				.forEach(i -> System.out.print(i + ", "));
		System.out.println();
		System.out.println();

		System.out.println("Long Range count 1 -> 50: " + LongStream.range(1, 50).count());

		LongStream.range(1,50)
				.forEach(i -> System.out.print(i + ", "));

		System.out.println();
		System.out.println("Long Range Closed count 1 -> 50: " + LongStream.rangeClosed(1, 50).count());

		LongStream.rangeClosed(1, 50)
				.forEach(i -> System.out.print(i + ", "));

		System.out.println();
		System.out.println();
		//range and rangeClosed does not supported by Double so create a range for InteStream and convert it to DoubleStream
		System.out.println();
		System.out.println("Double Range count 1 -> 50: " + LongStream.range(1, 50).count());
		IntStream.range(1,50)
				.asDoubleStream()
				.forEach(i -> System.out.print(i + ", "));

	}
}