package gr.pr.udemy.java8.method_reference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

	static Function<String, String> toUppercaseLambda = str -> str.toUpperCase();
	static Function<String, String> toUppercaseMethodReference = String::toUpperCase;

	public static void main(String[] args) {

		System.out.println(toUppercaseLambda.apply("java8"));
		System.out.println(toUppercaseMethodReference.apply("java8"));

	}
}