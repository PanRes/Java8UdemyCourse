package gr.pr.udemy.java8.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample {

	public static void main(String[] args) {

		List<String> stringList = Arrays.asList("PR", "McCoy", "Angel");

		/**
		 * Prior Java 8
		 */
/*
		Collections.sort(stringList);
		System.out.println(stringList);
*/

		/**
		 * Java 8
		 */

		stringList = Arrays.asList("PR", "McCoy", "Angel");
		stringList.sort(Comparator.reverseOrder());
		System.out.println(stringList);
	}
}