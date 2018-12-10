package gr.pr.udemy.java8.streams;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * This example is simplified of BiFunctionExample
 */
public class StreamsExample {
	public static void main(String[] args) {

		Predicate<Student> filterGradeLevel = student -> student.getGradeLevel() >=3;
		Predicate<Student> filterGPA = student -> student.getGpa() >=3.9;

		Map<String, List<String>> studentActivities = StudentDataBase.getAllStudents().stream()
				.peek(student -> System.out.println("Before filters " + student))
				.filter(filterGradeLevel)
				.peek(student -> System.out.println("After 1st filter " + student))
				.filter(filterGPA)
				.peek(student -> System.out.println("After 2nd filter " + student))
				.collect(Collectors.toMap(Student::getName,Student::getActivities));

		System.out.println();
		System.out.println(studentActivities);
	}
}