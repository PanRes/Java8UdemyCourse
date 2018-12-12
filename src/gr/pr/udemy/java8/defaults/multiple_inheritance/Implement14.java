package gr.pr.udemy.java8.defaults.multiple_inheritance;

//If both parent interfaces have the same default method it is mandatory to Override that method
public class Implement14 implements Interface1, Interface4 {

	public void methodA() {
		System.out.println("Inside MethodA " + Implement14.class);
	}
}
