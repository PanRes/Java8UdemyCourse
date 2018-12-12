package gr.pr.udemy.java8.functional_interfaces;

public class FunctionExample1 {

	public static void main(String[] args) {

		String result = performConcat("Hello");

		System.out.println(result);
	}

	public static String performConcat(String str) {
		return FunctionExample.toUppercaseAndConcatDefault.apply(str);
	}
}
