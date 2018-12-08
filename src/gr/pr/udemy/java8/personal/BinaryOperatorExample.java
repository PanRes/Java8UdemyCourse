package gr.pr.udemy.java8.personal;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	static BinaryOperator<String> concatAndUppercaseStrings = (str1, str2) -> str1.concat(str2).toUpperCase();

	public static void main(String[] args) {

		System.out.println(concatAndUppercaseStrings.apply("Hello ","World!!"));

	}
}