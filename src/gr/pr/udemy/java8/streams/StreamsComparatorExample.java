package gr.pr.udemy.java8.streams;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class StreamsComparatorExample {

	public static void main(String[] args) {

		getStudentsSortedByName().stream()
				.forEach(System.out::println);
		System.out.println();
		getStudentsSortedByGPA().stream()
				.forEach(System.out::println);
		System.out.println();
		getStudentsSortedByGPADesc().stream()
				.forEach(System.out::println);

	}

	public static List<Student> getStudentsSortedByName() {
		return StudentDataBase.getAllStudents().stream()
				.sorted(comparing(Student::getName))
				.collect(Collectors.toList());
	}

	public static List<Student> getStudentsSortedByGPA() {
		return StudentDataBase.getAllStudents().stream()
				.sorted(comparing(Student::getGpa))
				.collect(Collectors.toList());
	}

	public static List<Student> getStudentsSortedByGPADesc() {
		return StudentDataBase.getAllStudents().stream()
				.sorted(comparing(Student::getGpa).reversed())
				.collect(Collectors.toList());
	}
}