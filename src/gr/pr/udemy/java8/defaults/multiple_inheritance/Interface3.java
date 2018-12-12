package gr.pr.udemy.java8.defaults.multiple_inheritance;

public interface Interface3 extends Interface2{

	default void methodC() {
		System.out.println("Inside MethodC");
	}

}
