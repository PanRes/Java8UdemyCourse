package gr.pr.udemy.java8.method_reference;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

	static Consumer<Student> printStudentLambda = student -> System.out.println(student);
	static Consumer<Student> printStudentMethodReference = System.out::println;
	static Consumer<Student> printListActivities = Student::printActivities;

	public static void main(String[] args) {

		StudentDataBase.getAllStudents().forEach(printStudentLambda);
		System.out.println();
		StudentDataBase.getAllStudents().forEach(printStudentMethodReference);
		System.out.println();
		StudentDataBase.getAllStudents().forEach(printListActivities);
	}
}