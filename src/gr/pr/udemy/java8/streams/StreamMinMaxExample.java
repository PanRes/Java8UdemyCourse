package gr.pr.udemy.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(6,7,10,8,9);
//		List<Integer> integerList = new ArrayList<>();

		System.out.println("Max in the list is: " + findMaxValue(integerList));

		System.out.println();
		Optional<Integer> optionalMaxInteger =  findMaxValueOptional(integerList);
		if (optionalMaxInteger.isPresent()) {
			System.out.println("Max in the list with optional is: " + optionalMaxInteger.get());
		}
		else {
			System.out.println("The List was empty");
		}

		System.out.println();
		Optional<Integer> optionalMinInteger =  findMinValueOptional(integerList);
		if (optionalMinInteger.isPresent()) {
			System.out.println("Min in the list with optional is: " + optionalMinInteger.get());
		}
		else {
			System.out.println("The List was empty");
		}
	}

	public static int findMaxValue(List<Integer> integerList) {

		return integerList.stream()
				//x holds the max value every time having as default value the identity
				//It will return 0 if list is empty
				.reduce(0, (x,y) -> x > y ? x : y);
	}

	public static Optional<Integer> findMaxValueOptional(List<Integer> integerList) {

		return integerList.stream()
//				.reduce((x,y) -> x < y ? x : y);
				.reduce(Integer::max);
	}

	public static Optional<Integer> findMinValueOptional(List<Integer> integerList) {

		return integerList.stream()
//				.reduce((x,y) -> x < y ? x : y);
				.reduce(Integer::min);
	}
}