package gr.pr.udemy.java8.personal;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class StreamsExample {
	public static void main(String[] args) {

		BiPredicate<String,String> containsLeter = (str1, str2) -> str1.contains(str2);
		List<String> names = new ArrayList<>();
		names.add("PR");
		names.add("PR");
		names.add("McCoy");
		names.add("Angel");
		names.add("Philippos");

		names.stream()
				.filter(name -> containsLeter.test(name, "P"))
				.distinct()
				.forEach(System.out::println);

	}
}