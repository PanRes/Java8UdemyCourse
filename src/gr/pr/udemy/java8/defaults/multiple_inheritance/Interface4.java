package gr.pr.udemy.java8.defaults.multiple_inheritance;

public interface Interface4 {

	default void methodA() {
		System.out.println("Inside MethodA " + Interface4.class);
	}

}
