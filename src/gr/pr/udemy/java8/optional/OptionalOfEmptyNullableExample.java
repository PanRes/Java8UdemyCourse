package gr.pr.udemy.java8.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

	public static void main(String[] args) {

		System.out.println("ofNullable: " + ofNullable());
		System.out.println("of: " + of());
		System.out.println("empty: " + empty());
	}

	public static Optional<String> ofNullable() {
		return Optional.ofNullable("Hello");
	}

	public static Optional<String> of() {
		return Optional.of("Hello");
	}

	public static Optional<String> empty() {
		return Optional.empty();
	}
}