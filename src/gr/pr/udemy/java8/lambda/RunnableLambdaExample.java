package gr.pr.udemy.java8.lambda;

public class RunnableLambdaExample {

	public static void main(String[] args) {

		/**
		 * prior Java 8
		 */

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside runnable 1");
			}
		};

		new Thread(runnable).start();


		/**
		 * Java 8
		 */

		Runnable runnableLambda = () -> {
			System.out.println("Inside Runnable 2");
		};

		Runnable runnableLambda1 = () -> System.out.println("Inside runnable 3");

		new Thread(runnableLambda).start();
		new Thread(runnableLambda1).start();
		new Thread(() -> System.out.println("Inside runnable 4")).start();
	}
}