package gr.pr.udemy.java8.streams;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {

	public static void main(String[] args) {

		filterStudents().forEach(System.out::println);
	}

	public static List<Student> filterStudents() {
		return StudentDataBase.getAllStudents().stream()
				.filter(student -> student.getGender().equals("male")) //Stream<Student> -> only male
				.filter(student -> student.getGpa() >= 3.9 && student.getGradeLevel() >= 4)
				.collect(Collectors.toList());
	}
}