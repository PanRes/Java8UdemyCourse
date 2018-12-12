package gr.pr.udemy.java8.functional_interfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

//	static Comparator<Integer> compareInts = (a, b) -> a.compareTo(b);
	static Comparator<Integer> compareInts = Integer::compareTo;

	public static void main(String[] args) {

		BinaryOperator<Integer> multiplyInts = (a, b) -> a * b;

		System.out.println("3 * 4 = " + multiplyInts.apply(3,4));

		BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(compareInts);
		System.out.println("Result of maxBy to 4, 6 " + maxBy.apply(4,6));
	}
}