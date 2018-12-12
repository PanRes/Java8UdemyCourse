package gr.pr.udemy.java8.defaults;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultiplierClient {

	public static void main(String[] args) {
		Multiplier multiplier = new MultiplierImpl();
		//List<Integer> integers = Arrays.asList(1,3,5);
		//Test IntStream
		List<Integer> integers = IntStream
				.rangeClosed(1,5)
				.filter(i -> i%2 != 0)
				.boxed()
				.collect(Collectors.toList());
		System.out.println("Result of the multiplier is: " + multiplier.multiply(integers));
		System.out.println("Default method size: " + multiplier.size(integers));
		System.out.println("Static Method in interface " + Multiplier.isEmpty(integers));
	}
}
