package gr.pr.udemy.java8.defaults.multiple_inheritance;

public class MultipleInheritanceConflict {

	public static void main(String[] args) {
		Implement123 implement123 = new Implement123();

		implement123.methodA(); // Always uses child's method
		implement123.methodB();
		implement123.methodC();

		System.out.println();

		Implement14 implement14 = new Implement14();

		implement14.methodA();

	}
}