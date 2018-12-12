package gr.pr.udemy.java8.optional;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

	public static void main(String[] args) {

		System.out.println("optionalOrElse: " + optionalOrElse());
		System.out.println("optionalOrElseGet: " + optionalOrElseGet());
		System.out.println("optionalOrElseThrow: " + optionalOrElseThrow());

	}

	public static String optionalOrElse() {
		Optional<Student> optionalStudent = Optional.ofNullable(null);

		return optionalStudent.map(Student::getName).orElse("Default");
	}

	public static String optionalOrElseGet() {
		Optional<Student> optionalStudent = Optional.ofNullable(null);

		return optionalStudent.map(Student::getName).orElseGet(() -> "Default");
	}

	public static String optionalOrElseThrow() {
		Optional<Student> optionalStudent = Optional.ofNullable(null);

		return optionalStudent.map(Student::getName).orElseThrow(() -> new RuntimeException("No Data found"));
	}

}