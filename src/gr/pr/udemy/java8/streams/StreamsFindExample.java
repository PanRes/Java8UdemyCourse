package gr.pr.udemy.java8.streams;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindExample {

	public static void main(String[] args) {

		Optional<Student> studentOptionalFindAny = findAnyStudent();
		if (studentOptionalFindAny.isPresent()) {
			System.out.println(studentOptionalFindAny.get());
		}
		else {
			System.out.println("List was empty");
		}

		Optional<Student> studentOptionalFindFirst = findFirstStudent();
		if (studentOptionalFindFirst.isPresent()) {
			System.out.println(studentOptionalFindFirst.get());
		}
		else {
			System.out.println("List was empty");
		}
	}

	public static Optional<Student> findAnyStudent() {
		return StudentDataBase.getAllStudents().stream()
				.filter(student -> student.getGpa() >= 3.9)
				.findAny();
	}

	public static Optional<Student> findFirstStudent() {
		return StudentDataBase.getAllStudents().stream()
				.filter(student -> student.getGpa() >= 3.9)
				.findFirst();
	}
}