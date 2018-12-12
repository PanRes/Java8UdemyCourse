package gr.pr.udemy.java8.functional_interfaces;

import gr.pr.udemy.java8.data.Student;
import gr.pr.udemy.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	static Consumer<Student> printStudent = student -> System.out.println(student);
	static Consumer<Student> printStudentName = student -> System.out.print(student.getName());
	static Consumer<Student> printStudentActivities = student -> System.out.println(student.getActivities());


	public static void main(String[] args) {

		Consumer<String> printToUpperCase = (string) -> System.out.println(string.toUpperCase());

		printToUpperCase.accept("java 8 test");

		printStudents();
		System.out.println();
		printNameAndActivieties();
		System.out.println();
		printNameAndActivitiesUsingConditions();
		System.out.println();
		printNameAndActivitiesUsingFilter();
	}

	public static void printStudents() {
		List<Student> studentList = StudentDataBase.getAllStudents();
		System.out.println();
		studentList.forEach(printStudent);
	}

	public static void printNameAndActivieties() {

		List<Student> studentList = StudentDataBase.getAllStudents();

		studentList.forEach(printStudentName.andThen(printStudentActivities)); //consumer chaining
	}

	public static void printNameAndActivitiesUsingConditions() {

		List<Student> studentList = StudentDataBase.getAllStudents();

		studentList.forEach(student -> {
			if (student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
				printStudentName.andThen(printStudentActivities).accept(student);
			}
		});
	}

	public static void printNameAndActivitiesUsingFilter() {

		List<Student> studentList = StudentDataBase.getAllStudents();

		studentList.stream().filter(student -> student.getGradeLevel() >= 3 && student.getGpa() >= 3.9)
				.forEach(printStudentName.andThen(printStudentActivities));
	}

}