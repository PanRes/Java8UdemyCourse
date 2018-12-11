package gr.pr.udemy.java8.functionalinterfaces;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {

		Supplier<Student> studentSupplier = () -> new Student("PR",8,6.5, "male", Arrays.asList("swimminCod", "coding","bicycling"), 6);

		Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();

		System.out.println(studentSupplier.get());
		System.out.println("Students are: " + listSupplier.get());
	}
}