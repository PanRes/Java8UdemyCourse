package gr.pr.udemy.java8.functional_interfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	static UnaryOperator<String> unaryOperator = str -> str.concat(" World");

	public static void main(String[] args) {

		System.out.println(unaryOperator.apply("Hello"));
	}
}