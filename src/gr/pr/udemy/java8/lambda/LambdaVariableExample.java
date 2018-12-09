package gr.pr.udemy.java8.lambda;

import java.util.function.Consumer;

public class LambdaVariableExample {

	static int value = 4;

	public static void main(String[] args) {


		Consumer<Integer> intExample = i -> {
			value++; //it is not allowed for local variables in lambda, only for static instance variables
			System.out.println(value + i);
		};

		intExample.accept(5);
	}
}