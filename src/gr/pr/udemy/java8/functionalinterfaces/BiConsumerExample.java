package gr.pr.udemy.java8.functionalinterfaces;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {

		BiConsumer<String, String> biConsumer = (a, b) -> System.out.println("a: " + a + ", b: " + b);

		biConsumer.accept("java7", "java8");

		BiConsumer<Integer, Integer> printMultiply = (a,b) -> System.out.println(a + " * " + b + " = " + a*b);

		printMultiply.accept(3,5);

		BiConsumer<Integer, Integer> printDivision = (a,b) -> System.out.println(a + " / " + b + " = " + a/b);

		printMultiply.andThen(printDivision)
				.accept(5,4);

		studentNameAndActivities();
	}

	public static void studentNameAndActivities() {
		BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + " : " + activities);

		List<Student> students = StudentDataBase.getAllStudents();

		students.forEach(student -> biConsumer.accept(student.getName(),student.getActivities()));
	}

}
