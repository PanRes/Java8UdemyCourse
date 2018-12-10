package gr.pr.udemy.java8.personal;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiPredicate;

public class StreamsStudentExample {
	public static void main(String[] args) {

		BiPredicate<Student, String> containsLetter = (student, nameContext) -> student.getName().contains(nameContext);

		List<Student> students = StudentDataBase.getAllStudents();

		students.stream()
				.filter(student -> containsLetter.test(student, "A"))
				.forEach(System.out::println);
	}
}