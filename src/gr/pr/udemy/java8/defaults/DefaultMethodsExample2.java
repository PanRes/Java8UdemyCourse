package gr.pr.udemy.java8.defaults;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import static java.util.Comparator.*;

public class DefaultMethodsExample2 {

	static Consumer<Student> studentConsumer = System.out::println;

	public static void main(String[] args) {

		List<Student> students = StudentDataBase.getAllStudents();

//		System.out.println("Before the sort");
//		students.forEach(studentConsumer);
//		students.sort(comparing(Student::getName));
//		System.out.println();
//		System.out.println("After the sort by name");
//		students.forEach(studentConsumer);
//		students.sort(comparing(Student::getGpa));
//		System.out.println();
//		System.out.println("After the sort by gpa");
//		students.forEach(studentConsumer);
//		students.sort(comparing(Student::getGradeLevel).thenComparing(Student::getGpa).reversed());
//		System.out.println();
//		System.out.println("After chain comparator");
//		students.forEach(studentConsumer);
//		System.out.println("After the sort by name nulls first");
//		students.forEach(studentConsumer);
//		students.sort(nullsFirst(comparing(Student::getName)));
//		System.out.println();
//		students.forEach(studentConsumer);
//		System.out.println();
		System.out.println("After the sort by name nulls last");
		students.forEach(studentConsumer);
		students.sort(nullsLast(comparing(Student::getName)));
		System.out.println();
		students.forEach(studentConsumer);
		System.out.println();

	}
}