package gr.pr.udemy.java8.personal;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;
import gr.pr.udemy.java8.functionalinterfaces.BiFunctionExample;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * This example is like
 * @see BiFunctionExample
 * but with streams
 */
public class StreamsExample2 {
	public static void main(String[] args) {

		Predicate<Student> filterGradeLevel = student -> student.getGradeLevel() >=3;
		Predicate<Student> filterGPA = student -> student.getGpa() >=3.9;

		System.out.println();
		StudentDataBase.getAllStudents().stream()
				.filter(filterGradeLevel)
				.filter(filterGPA)
				.peek(student -> {
					if (student.getName().contains("E")){
						student.setName("Test");
					}
				})
				.collect(Collectors.toList())
				.forEach(System.out::println);

	}
}