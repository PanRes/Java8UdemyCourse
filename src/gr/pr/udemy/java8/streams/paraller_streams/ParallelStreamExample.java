package gr.pr.udemy.java8.streams.paraller_streams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

	public static void main(String[] args) {

		System.out.println(Runtime.getRuntime().availableProcessors());

		System.out.println("Sequential Stream Time: " + checkPerformanceResult(ParallelStreamExample::sumSequentialStream, 20) + "ms");
		System.out.println("Parallel Stream Time: " + checkPerformanceResult(ParallelStreamExample::sumParallelStream, 20) + "ms");
	}

	public static int sumSequentialStream() {
		return IntStream.rangeClosed(1,10000).sum();
	}

	public static int sumParallelStream() {
		return IntStream.rangeClosed(1,10000)
				.parallel()
				.sum();
	}

	public static long checkPerformanceResult(Supplier<Integer> supplier, int numberOfTimes) {

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < numberOfTimes; i++) {
			supplier.get();
		}
		return System.currentTimeMillis() - startTime;
	}
}