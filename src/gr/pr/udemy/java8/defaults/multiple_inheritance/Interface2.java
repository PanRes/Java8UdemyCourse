package gr.pr.udemy.java8.defaults.multiple_inheritance;

public interface Interface2 extends Interface1{

	default void methodB() {
		System.out.println("Inside MethodB");
	}

	default void methodA() {
		System.out.println("Inside MethodA " + Interface2.class);
	}


}
