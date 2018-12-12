package gr.pr.udemy.java8.defaults.multiple_inheritance;

public interface Interface1 {

	default void methodA() {
		System.out.println("Inside MethodA " + Interface1.class);
	}

}
