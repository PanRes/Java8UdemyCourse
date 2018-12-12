package gr.pr.udemy.java8.optional;

import java.util.Optional;

public class OptionalPresentExample {
	public static void main(String[] args) {

		Optional<String> stringOptional = Optional.ofNullable("Hello World");
		System.out.println(stringOptional.isPresent());
		if (stringOptional.isPresent()) {
			System.out.println(stringOptional.get());
		}

		System.out.println();
		stringOptional.ifPresent(System.out::println);
	}
}