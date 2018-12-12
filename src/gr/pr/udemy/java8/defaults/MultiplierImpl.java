package gr.pr.udemy.java8.defaults;

import java.util.List;

public class MultiplierImpl implements Multiplier {

	@Override
	public int multiply(List<Integer> integers) {
		return integers.stream()
				.reduce(1,(a,b) -> a * b);
	}

	@Override
	public int size(List<Integer> integers) {
		System.out.println("Inside Class");
		return integers.size();
	}

}
