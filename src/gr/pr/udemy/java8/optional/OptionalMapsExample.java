package gr.pr.udemy.java8.optional;

import gr.pr.udemy.java8.data.Bike;
import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.Optional;
import java.util.function.Predicate;

public class OptionalMapsExample {

	private static Predicate<Student> checkStdentGPA = student -> student.getGpa() >= 3;

	public static void main(String[] args) {

		optionalFilter();
		optionalMap();
		optionalFlatMap();

	}

	public static void optionalFilter() {
		Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());

		optionalStudent
				.filter(checkStdentGPA)
				.ifPresent(System.out::println);
	}

	public static void optionalMap() {
		Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());

		if (optionalStudent.isPresent()) {
			String studentName = optionalStudent
					.filter(checkStdentGPA)
					.map(Student::getName)
					.get();
			System.out.println(studentName);
		}
	}

	public static void optionalFlatMap() {
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

		Optional<String> studentsBikeNameOptional = studentOptional
				.filter(checkStdentGPA)
				.flatMap(Student::getBike)
				.map(Bike::getName);

		studentsBikeNameOptional.ifPresent(System.out::println);
	}
}