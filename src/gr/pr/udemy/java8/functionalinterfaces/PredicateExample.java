package gr.pr.udemy.java8.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {

	static Predicate<Integer> p = i -> i%2 == 0;
	static Predicate<Integer> p1 = i -> i%5 == 0;

	public static void predicateAnd() {
		System.out.println("Predicate And result for 4 is: " + p.and(p1).test(4)); //predicate chaining
		System.out.println("Predicate And result for 10 is: " + p.and(p1).test(10)); //predicate chaining
	}

	public static void predicateOr() {
		System.out.println("Predicate Or result for 9 is: " + p.or(p1).test(9)); //predicate chaining
		System.out.println("Predicate Or result for 8 is: " + p.or(p1).test(8)); //predicate chaining
		System.out.println("Predicate Or result for 25 is: " + p.or(p1).test(25)); //predicate chaining
	}

	public static void predicateNegate() {
		System.out.println("Predicate Or & Negate result for 8 is: " + p.or(p1).negate().test(8)); //predicate chaining
		System.out.println("Predicate Or & Negate result for 9 is: " + p.or(p1).negate().test(9)); //predicate chaining
	}

	public static void main(String[] args) {

		System.out.println(p.test(5));

		predicateAnd();
		predicateOr();
		predicateNegate();
	}

}
