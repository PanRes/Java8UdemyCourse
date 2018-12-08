package gr.pr.udemy.java8.functionalinterfaces;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

	private static Predicate<Student> filterGradeLevel = student -> student.getGradeLevel() >= 3;
	private static Predicate<Student> filterGPA = student -> student.getGpa() >= 3.9;
	private static BiConsumer<String, List<String>> studentNameAndActivities = (name, activities) -> System.out.println(name + ": " + activities);
	private static Consumer<Student> studentConsumer = student -> {
		if (filterGradeLevel.and(filterGPA).test(student)) {
			studentNameAndActivities.accept(student.getName(),student.getActivities());
		}
	};

	public static void main(String[] args) {
		List<Student> students = StudentDataBase.getAllStudents();

		printNameAndActivities(students);
	}

	public static void printNameAndActivities(List<Student> students) {

		students.forEach(studentConsumer);
	}


}