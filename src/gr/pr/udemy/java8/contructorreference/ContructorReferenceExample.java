package gr.pr.udemy.java8.contructorreference;

import gr.pr.udemy.java8.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ContructorReferenceExample {

	static Supplier<Student> studentSupplier = Student::new;

	static Function<String,Student> studentFunction = Student::new;

	public static void main(String[] args) {

		System.out.println(studentSupplier.get());
		System.out.println();
		System.out.println(studentFunction.apply("PR"));

	}
}