package gr.pr.udemy.java8.functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {

	static Function<String, String> toUppercase = name -> name.toUpperCase();
	static Function<String, String> toUppercaseAndConcatDefault = name -> name.toUpperCase().concat(" World");

	public static void main(String[] args) {
		System.out.println("Pangagiotis with Function 1 becomes: " + toUppercase.apply("Panagiotis"));
		System.out.println("Pangagiotis with Function 1 becomes: " + toUppercase.andThen(toUppercaseAndConcatDefault).apply("Panagiotis"));
		//First apply the second Function
		System.out.println("Pangagiotis with Function 2 becomes: " + toUppercase.compose(toUppercaseAndConcatDefault).apply("Panagiotis"));
	}

}
