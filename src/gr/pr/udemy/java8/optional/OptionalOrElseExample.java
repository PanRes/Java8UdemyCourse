package gr.pr.udemy.java8.optional;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

	public static void main(String[] args) {

		System.out.println("optionalOrElse: " + optionalOrElse());

	}

	public static String optionalOrElse() {
		Optional<Student> optionalStudent = Optional.ofNullable(null);

		return optionalStudent.map(Student::getName).orElse("Default");
	}

}