package gr.pr.udemy.java8.functionalinterfaces;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

	static Predicate<Student> gradeLevelFilter = student -> student.getGradeLevel() >= 3;
	static Predicate<Student> gpaFilter = student -> student.getGpa() >= 3.9;
	static List<Student> students = StudentDataBase.getAllStudents();

	public static void filterStudentByGradeLevel() {

		students.forEach(student -> {
			if (gradeLevelFilter.test(student)) {
				System.out.println(student);
			}
		});
	}

	public static void filterStudentByGPA() {

		students.stream().filter(gpaFilter)
				.forEach(student -> System.out.println(student));
	}

	public static void filterStudentByGradeLevelAndGPA() {

		students.stream().filter(gradeLevelFilter.and(gpaFilter))
				.forEach(student -> System.out.println(student));
	}

	public static void main(String[] args) {
		filterStudentByGradeLevel();
		System.out.println();
		filterStudentByGradeLevelAndGPA();
	}

}
