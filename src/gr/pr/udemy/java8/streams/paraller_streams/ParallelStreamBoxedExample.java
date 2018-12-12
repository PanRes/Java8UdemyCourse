package gr.pr.udemy.java8.streams.paraller_streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class ParallelStreamBoxedExample {

	public static void main(String[] args) {

		List<Integer> integerList = IntStream.rangeClosed(1,10000)
				.boxed()
				.collect(toList());

		//Method reference parallel is faster than sequential
		sequentialSum(integerList);
		parallelSum(integerList);
	}

	public static int sequentialSum(List<Integer> integerList) {
		long startTime = System.currentTimeMillis();

		int sum = integerList.stream()
				.reduce(0, (a,b) -> a+b);

		System.out.println("Duration execution for sequential: " + (System.currentTimeMillis() - startTime) + "ms");

		return sum;
	}

	public static int parallelSum(List<Integer> integerList) {
		long startTime = System.currentTimeMillis();

		int sum = integerList.parallelStream()
				.reduce(0, (a,b) -> a+b);

		System.out.println("Duration execution for parallel: " + (System.currentTimeMillis() - startTime) + "ms");

		return sum;
	}
}