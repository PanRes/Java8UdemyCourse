package gr.pr.udemy.java8.optional;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
/*
		String name = getStudentName();
		if (name != null) {
			System.out.println("Length of name: " + name.length());
		}
		else {
			System.out.println("name not found");
		}*/

		Optional<String> nameOptional = getStudentNameOptional();

		if (nameOptional.isPresent()) {
			System.out.println("Length of name: " + nameOptional.get().length());
		}
		else {
			System.out.println("name not found");
		}

	}

	public static String getStudentName() {
//		Student student = StudentDataBase.studentSupplier.get();
		Student student = null;

		if (student != null) {
			return student.getName();
		}

		return null;
	}

	public static Optional<String> getStudentNameOptional() {

		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

		if (studentOptional.isPresent()) {
			return studentOptional.map(Student::getName);
		}

		return Optional.empty();
	}
}