package gr.pr.udemy.java8.personal;

import gr.pr.udemy.java8.data.Student;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerMethodReference {

	static BiConsumer<Student, String> setStudentName = Student::setName;
	static Consumer<Student> printStudent = System.out::println;

	public static void main(String[] args) {
		Student student = new Student();

		setStudentName.accept(student,"McCoy");

		printStudent.accept(student);
	}

}
