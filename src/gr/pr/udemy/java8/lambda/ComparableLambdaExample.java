package gr.pr.udemy.java8.lambda;

import java.util.Comparator;

public class ComparableLambdaExample {

	public static void main(String[] args) {
		//prior to Java 8
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};

		System.out.println("Result of the comparator for 3 and 2 is " + comparator.compare(3,2));

		Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);

		System.out.println("Result of the comparator for 3 and 2 with lambda is " + comparatorLambda.compare(3,2));

		Comparator<Integer> comparatorLambda1 = (a, b) -> a.compareTo(b);

		System.out.println("Result of the comparator for 3 and 2 with lambda without parameter type is " + comparatorLambda.compare(3,2));


	}

}
