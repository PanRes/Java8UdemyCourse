package gr.pr.udemy.java8.streams.paraller_streams;

import java.util.stream.IntStream;

public class StreamsParallelSum {

	public static void main(String[] args) {

		Sum sum = new Sum();

		IntStream.rangeClosed(1,1000)
				.parallel()
				.forEach(sum::performSum);

		System.out.println(sum.getTotal());
	}
}