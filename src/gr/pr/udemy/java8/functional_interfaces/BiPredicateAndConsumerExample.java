package gr.pr.udemy.java8.functional_interfaces;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class BiPredicateAndConsumerExample {

	private static BiPredicate<Integer, Double> filterGradeLevelAndGPA = (grade, gpa) -> grade >= 3 && gpa >=3.9;
	private static BiConsumer<String, List<String>> studentNameAndActivities = (name, activities) -> System.out.println(name + ": " + activities);
	private static Consumer<Student> studentConsumer = student -> {
		if (filterGradeLevelAndGPA.test(student.getGradeLevel(),student.getGpa())) {
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